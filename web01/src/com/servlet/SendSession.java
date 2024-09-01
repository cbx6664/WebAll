package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

/**
 * ClassName: SendSession
 * Package: com.servlet
 * Description:
 *
 * @Author CBX
 * @Create 1/9/24 11:25
 * @Version 1.0
 */
@WebServlet("/SendSession")
public class SendSession extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // get username
        String username = req.getParameter("username");
        // get session object
        HttpSession session = req.getSession();
        // get JSession id
        String jSessionId = session.getId();
        System.out.println("Session ID: "+jSessionId);
        // check if it is a new session
        boolean aNew = session.isNew();
        System.out.println("Send a new session? :"+aNew);

        // store data into session
        session.setAttribute("username", username);

    }
}
