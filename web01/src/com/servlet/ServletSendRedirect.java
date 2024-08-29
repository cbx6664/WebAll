package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * ClassName: SendRedirect
 * Package: com.servlet
 * Description:
 *
 * @Author CBX
 * @Create 29/8/24 13:27
 * @Version 1.0
 */
@WebServlet("/ServletSR")
public class ServletSendRedirect extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // get the parameter of the request
        String username = req.getParameter("username");
        System.out.println(username);

        //set request attributes
        req.setAttribute("requestAttribute", new String("xxxxxx"));
        // because there are multiple httpServletRequest objects, so the attribute won't pass to another req

        // send redirect
        resp.sendRedirect("servletD");
    }
}
