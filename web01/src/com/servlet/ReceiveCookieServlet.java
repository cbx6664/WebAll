package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * ClassName: CookieServlet
 * Package: com.servlet
 * Description:
 *
 * @Author CBX
 * @Create 1/9/24 11:25
 * @Version 1.0
 */
@WebServlet("/ReceiveCookieServlet")
public class ReceiveCookieServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // get cookies
        Cookie[] cookies = req.getCookies();

        // iterate cookies
        if (cookies != null && cookies.length >  0) {
            for (Cookie cookie : cookies) {
                System.out.println(cookie.getName()+":"+cookie.getValue());
            }
        }

    }
}
