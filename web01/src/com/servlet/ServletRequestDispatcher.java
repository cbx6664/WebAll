package com.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * ClassName: servletDispatcher
 * Package: com.servlet
 * Description:
 *
 * @Author CBX
 * @Create 28/8/24 22:01
 * @Version 1.0
 */
@WebServlet("/servletRD")
public class ServletRequestDispatcher extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // get the requestDispatcher
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("servletD");
        // get attributes of the request
        String username = req.getParameter("username");
        System.out.println(username);
        //add attribute to the context
        req.setAttribute("requestParameter", new String("requestParameter"));
        // forward the request to servletD
        requestDispatcher.forward(req, resp);

    }
}
