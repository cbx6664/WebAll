package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * ClassName: UserServlet
 * Package: com.servlet
 * Description:
 *
 * @Author CBX
 * @Create 26/8/24 20:45
 * @Version 1.0
 */
public class UserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取request中的参数
        String username = req.getParameter("username");
        if ("cbx".equals(username)) {
            //通过response对象设置响应信息
            resp.getWriter().write("No");
        }else {
            resp.getWriter().write("Yes");
        }
    }
}
