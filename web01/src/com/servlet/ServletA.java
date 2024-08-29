package com.servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

/**
 * ClassName: servletA
 * Package: com.servlet
 * Description:
 *
 * @Author CBX
 * @Create 28/8/24 20:24
 * @Version 1.0
 */
@WebServlet(
        name = "servletA",
        urlPatterns = "/servletA",
        initParams = {@WebInitParam(name = "param1", value = "value1"), @WebInitParam(name = "param2", value = "value2")}
)
public class ServletA extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletConfig servletConfig = this.getServletConfig();
        // servlet get the parameter through parameter name
        System.out.println("param1:" + servletConfig.getInitParameter("param1"));

        // servlet get all parameter names
        Enumeration<String> params = servletConfig.getInitParameterNames();
        while (params.hasMoreElements()) {
            String paramName = params.nextElement();
            System.out.println(paramName + " : " + servletConfig.getInitParameter(paramName));
        }
    }
}
