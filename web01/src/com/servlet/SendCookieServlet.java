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
@WebServlet("/SendCookieServlet")
public class SendCookieServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // generate cookie
        Cookie cookie1 = new Cookie("Cookie1","Cookie1Value");
        Cookie cookie2 = new Cookie("Cookie2","Cookie2Value");

        //put cookies into response
        resp.addCookie(cookie1);
        resp.addCookie(cookie2);
    }
}
