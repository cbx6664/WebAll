package com.cbx.schedule.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * ClassName: JDBCUtil
 * Package: com.cbx.schedule.util
 * Description:
 *
 * @Author CBX
 * @Create 29/8/24 17:15
 * @Version 1.0
 */
public class JDBCUtil {
    //创建连接池的引用，因为这个引用要提供给当前项目的全局使用，所以是静态的
    //引用类型为DataSource接口是为了实现多态，兼容多种连接池，之后如果更换连接池，只需要更换实现，不需要更换引用
    private static DataSource dataSource;
    private static ThreadLocal<Connection> threadLocal = new ThreadLocal<>();


    //在项目启动时，就创建连接池对象，让dataSource引用它
    static {
        try {
            Properties properties = new Properties();
            InputStream inputStream = JDBCUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");
            properties.load(inputStream);

            dataSource = DruidDataSourceFactory.createDataSource(properties);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    //对外提供在连接池中获取连接的方法
    public static Connection getConnection() {
        try {
            //在threadlocal获取connection
            Connection connection = threadLocal.get();
            //如果threadlocal中没有connection，即第一次获取
            if (connection == null) {
                //就从连接池中获取一个connection对象，存储在threadlocal中
                connection = dataSource.getConnection();
                threadLocal.set(connection);
            }
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //对外提供回收连接的方法
    public static void releaseConnection() {
        try {
            //从threadlocal中获取connection对象
            Connection connection = threadLocal.get();
            //如果threadlocal中还有存储的connection对象
            if (connection != null) {
                //将其从threadlocal中删除
                threadLocal.remove();
                //将connection对象归还给连接池
                connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
