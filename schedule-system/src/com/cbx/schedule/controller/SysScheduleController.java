package com.cbx.schedule.controller;

import com.cbx.schedule.pojo.SysSchedule;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.lang.reflect.Method;

/**
 * ClassName: SysScheduleController
 * Package: com.cbx.schedule.controller
 * Description:
 *
 * @Author CBX
 * @Create 31/8/24 12:42
 * @Version 1.0
 */
//增 /user/add
//删 /user/remove
//改 /user/update
//查 /user/query

@WebServlet("/schedule/*")
public class SysScheduleController extends BaseController {
    protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("add");
    }

    protected void remove(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("remove");
    }

    protected void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("update");
    }

    protected void query(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("query");
    }
}
