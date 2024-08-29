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
public class TestBaseDao {
    private static BaseDao baseDao;

    @BeforeClass
    public static void initBaseDao() {
        baseDao = new BaseDao();
    }
    @Test
    public void testBaseQueryObject() {
        // query the number of users
        String sql = "select uid, username, user_pwd as userPwd from sys_user";
        List<SysUser> sysUserList = baseDao.baseQuery(SysUser.class, sql);
        sysUserList.forEach(System.out::println);
    }
}
