package com.example.demo.controller;

import com.example.demo.utils.DBUtils;
import com.example.demo.utils.MD5;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class LoginServlet extends HttpServlet {


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        System.out.println(email);
        ResultSet rs;
        PrintWriter out = response.getWriter();


        try {
            rs = DBUtils.findByEmail(email, MD5.hashing(password)).executeQuery();
            if (rs.next()) {
                HttpSession session = request.getSession();
                session.setAttribute("user",rs.getString("id"));

                request.setAttribute("userID",rs.getString("id"));
                request.getRequestDispatcher("dashboard.jsp").forward(request, response);

            }
            else {
                out.println("Incorrect login credentials");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }




    }


}
