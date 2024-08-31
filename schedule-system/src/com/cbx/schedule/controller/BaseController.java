package com.cbx.schedule.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.lang.reflect.Method;

/**
 * ClassName: BaseController
 * Package: com.cbx.schedule.controller
 * Description:
 *
 * @Author CBX
 * @Create 31/8/24 13:37
 * @Version 1.0
 */
public class BaseController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String requestURI = req.getRequestURI();
        String[] splits = requestURI.split("/");
        String methodName = splits[splits.length - 1];

        // 通过 反射 获取要执行的方法
        Class clazz = this.getClass();
        try {
            Method method = clazz.getDeclaredMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);

            //暴力破解 method 的访问权限
            method.setAccessible(true);

            //通过 反射 执行 method
            method.invoke(this, req, resp);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
