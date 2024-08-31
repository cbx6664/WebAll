package com.cbx.schedule.dao.impl;

import com.cbx.schedule.dao.BaseDao;
import com.cbx.schedule.dao.SysUserDao;
import com.cbx.schedule.pojo.SysUser;

/**
 * ClassName: SysUserDaoImpl
 * Package: com.cbx.schedule.dao.impl
 * Description:
 *
 * @Author CBX
 * @Create 31/8/24 15:12
 * @Version 1.0
 */
public class SysUserDaoImpl extends BaseDao implements SysUserDao {


    @Override
    public int addUser(SysUser sysUser) {
        String sql = "insert into sys_user values(DEFAULT,?,?)";
        int rows = baseUpdate(sql, sysUser.getUsername(), sysUser.getUserPwd());
        System.out.println("added " + rows + " records");
        return rows;
    }
}
