package com.example.demo.controller;

import com.example.demo.utils.DBUtils;
import com.example.demo.utils.MD5;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegistrationServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        DBUtils.addStudent("", email, MD5.hashing(password), "", "", "", "", 0);
        request.getRequestDispatcher("/").forward(request, response);



    }


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("/registration.jsp");
        rd.forward(request, response);

    }

}
