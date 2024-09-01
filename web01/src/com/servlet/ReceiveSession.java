package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * ClassName: ReceiveSession
 * Package: com.servlet
 * Description:
 *
 * @Author CBX
 * @Create 1/9/24 11:25
 * @Version 1.0
 */
@WebServlet("/ReceiveSession")
public class ReceiveSession extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // get session object
        HttpSession session = req.getSession();
        // get session id
        String sessionId = session.getId();
        System.out.println("Received Session ID"+sessionId);
        //check if it's a new session
        System.out.println("Received a new session?"+":"+session.isNew());
        // get the data from session
        String username = (String) session.getAttribute("username");
        System.out.println(username);


    }
}
