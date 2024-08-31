package com.cbx.schedule.dao;

import com.cbx.schedule.pojo.SysUser;

/**
 * ClassName: SysUserDao
 * Package: com.cbx.schedule.dao
 * Description:
 *
 * @Author CBX
 * @Create 29/8/24 16:20
 * @Version 1.0
 */
public interface SysUserDao {
    /**
     * adds a user
     * @param sysUser
     * @return the number of influenced rows
     */
    int addUser(SysUser sysUser);
}
