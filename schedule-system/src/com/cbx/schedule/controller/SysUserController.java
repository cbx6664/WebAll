package com.cbx.schedule.controller;

import com.cbx.schedule.pojo.SysUser;
import com.cbx.schedule.service.impl.SysUserServiceImpl;
import com.cbx.schedule.util.MD5Util;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * ClassName: SysUserController
 * Package: com.cbx.schedule.controller
 * Description:
 *
 * @Author CBX
 * @Create 31/8/24 12:42
 * @Version 1.0
 */
//增 /user/add
//删 /user/remove
//改 /user/update
//查 /user/query

@WebServlet("/user/*")
public class SysUserController extends BaseController {
    private SysUserServiceImpl userService = new SysUserServiceImpl();

    /**
     * Receives requests of login
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1 receives the parameters posted by client
        String username = req.getParameter("username");
        String password = req.getParameter("userPwd");

        // 2 Invokes methods offered by Service, query database to check for username
        SysUser loginUser = userService.queryByUsername(username);
        // username does not exist
        if (null == loginUser) {
            // redirects page to loginUserNameError.html
            resp.sendRedirect("../loginUsernameError.html");

            // 3 check for pwd
        } else if (!MD5Util.encrypt(password).equals(loginUser.getUserPwd())) {
            // does not correct
            // redirects page to loginPwdError.html
            resp.sendRedirect("../loginPwdError.html");
        } else {
            // correct
            // login successfully
            resp.sendRedirect("../showSchedule.html");
        }
    }

    /**
     * Business process method that receives requests of registration
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void register(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1 Receives the parameters posted by client
        String username = req.getParameter("username");
        String password = req.getParameter("userPwd");

        // 2 Invokes methods offered by Service, completes the process of registration
        // we can also integrate parameters into an object
        SysUser sysUser = new SysUser(null, username, password);
        int rows = userService.register(sysUser);

        // 3 Redirects pages based on the registration results
        if (rows > 0) {
            resp.sendRedirect("../registerSucceeded.html");
        } else resp.sendRedirect("../registerFailed.html");

    }
}
