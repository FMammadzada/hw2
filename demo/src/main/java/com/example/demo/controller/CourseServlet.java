package com.example.demo.controller;

import com.example.demo.utils.DBUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CourseServlet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {

            ResultSet rt = DBUtils.listCourse().executeQuery();



            request.setAttribute("rt", rt);
            request.getRequestDispatcher("list.jsp").forward(request, response);


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
