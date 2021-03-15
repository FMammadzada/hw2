package com.example.demo.controller;

import com.example.demo.utils.DBUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class EnrollServlet extends HttpServlet {


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        HttpSession session = request.getSession();
        String id = (String) session.getAttribute("user");
        String cID = request.getParameter("cID");

        DBUtils.enrollCourse(Integer.parseInt(id),Integer.parseInt(cID));

        response.sendRedirect("courses");


    }
}
