package com.cbx.schedule.test;

import com.cbx.schedule.dao.BaseDao;
import com.cbx.schedule.pojo.SysUser;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

/**
 * ClassName: TestBaseDao
 * Package: com.cbx.schedule.test
 * Description:
 *
 * @Author CBX
 * @Create 29/8/24 18:16
 * @Version 1.0
 */
public class BaseDaoTest {
    private static BaseDao baseDao;

    @BeforeClass
    public static void initBaseDao() {
        baseDao = new BaseDao();
    }

    @Test
    public void testBaseQuery() {
        // query all data of users
        //小心NoSuchField报错，Java 中 数据的filed 名与 MySQL 中不同，需要用别名和 Java 中的对应上
        String sql = "select uid, username, user_pwd as userPwd from sys_user";
        List<SysUser> sysUserList = baseDao.baseQuery(SysUser.class, sql);
        sysUserList.forEach(System.out::println);
    }

    @Test
    public void testBaseQueryObject() {
        // query the number of users
        String sql = "select count(1) from sys_user";
        Long numberOfUsers = baseDao.baseQueryObject(Long.class, sql);
        System.out.println(numberOfUsers);
    }

    @Test
    public void testBaseUpdate(){
        // update the data
        // 注意双引号要使用转义字符
        String sql = "update sys_user set username = \"CBX\" where uid = 1";
        System.out.println(baseDao.baseUpdate(sql));

    }
}
