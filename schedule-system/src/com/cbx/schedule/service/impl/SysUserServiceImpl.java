package com.cbx.schedule.service.impl;

import com.cbx.schedule.dao.SysUserDao;
import com.cbx.schedule.dao.impl.SysUserDaoImpl;
import com.cbx.schedule.pojo.SysUser;
import com.cbx.schedule.service.SysUserService;
import com.cbx.schedule.util.MD5Util;

/**
 * ClassName: SysUserServiceImpl
 * Package: com.cbx.schedule.service.impl
 * Description:
 *
 * @Author CBX
 * @Create 31/8/24 12:35
 * @Version 1.0
 */
public class SysUserServiceImpl implements SysUserService {
    private SysUserDao userDao = new SysUserDaoImpl();

    @Override
    public int register(SysUser sysUser) {
        // encrypt userPwd
        sysUser.setUserPwd(MD5Util.encrypt(sysUser.getUserPwd()));
        // utilize SysUserDao
        int rows = userDao.addUser(sysUser);

        return rows;
    }
}
