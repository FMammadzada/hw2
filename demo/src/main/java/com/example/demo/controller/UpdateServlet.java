package com.example.demo.controller;

import com.example.demo.utils.DBUtils;
import com.example.demo.utils.MD5;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateServlet extends HttpServlet {


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        String email = request.getParameter("email");
        String firstName = request.getParameter("fName");
        String lastName = request.getParameter("lName");
        String country = request.getParameter("country");
        String city = request.getParameter("city");
        String gender = request.getParameter("gender");
        String age = request.getParameter("age");
        System.out.println(firstName);


        String password = request.getParameter("password");
        String id = request.getParameter("id");
        DBUtils.updateStudent(Integer.parseInt(id), firstName, email, MD5.hashing(password), lastName, country, city, gender, Integer.parseInt(age));


    }

}
