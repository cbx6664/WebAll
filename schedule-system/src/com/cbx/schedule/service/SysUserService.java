package com.cbx.schedule.service;

/**
 * ClassName: SysUserService
 * Package: com.cbx.schedule.service
 * Description:
 *
 * @Author CBX
 * @Create 31/8/24 12:33
 * @Version 1.0
 */

import com.cbx.schedule.pojo.SysUser;

/**
 * This interface defines functions surrounding sys_user table.
 */
public interface SysUserService {

    /**
     * Registers a new user by passing a new sysUser object
     *
     * @param sysUser
     * @return influenced rows
     */
    int register(SysUser sysUser);

    SysUser queryByUsername(String username);
}
