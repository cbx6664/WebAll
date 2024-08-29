package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * ClassName: ServletDestination
 * Package: com.servlet
 * Description:
 *
 * @Author CBX
 * @Create 28/8/24 22:02
 * @Version 1.0
 */
@WebServlet("/servletD")
public class ServletDestination extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // get the attribute of the request
        String parameter = req.getParameter("username");
        System.out.println(parameter);

        // get the attribute of the context
        String requestAttribute = (String) req.getAttribute("requestAttribute");
        System.out.println(requestAttribute);

        // response
        resp.getOutputStream().write("servletD response".getBytes());
    }
}
