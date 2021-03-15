package com.example.demo.utils;

import java.sql.*;

public class DBUtils {

    public static Connection makeConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");

        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/assignment2", "postgres", "postgres");


        return connection;
    }


    public static void addStudent(String firstName, String email, String password, String lastName, String county, String city, String gender, Integer age) {
        try {
            Connection connection = makeConnection();
            PreparedStatement st = connection.prepareStatement("INSERT INTO STUDENTS (firstName, lastName, age, country,city,gender,email,password) VALUES (?, ?, ?, ?,?, ?, ?, ?)");
            st.setString(1, firstName);
            st.setString(2, lastName);
            st.setInt(3, age);
            st.setString(4, county);
            st.setString(5, city);
            st.setString(6, gender);
            st.setString(7, email);
            st.setString(8, password);
            st.executeUpdate();
            st.close();


        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void updateStudent(int id, String firstName, String email, String password, String lastName, String county, String city, String gender, Integer age) {
        try {
            Connection connection = makeConnection();
            PreparedStatement st = connection.prepareStatement("update students set firstname=?,lastname=?,country=?,city=?,age=?,gender=?,email=?,password=? where id=?;");
            st.setString(1, firstName);
            st.setString(2, lastName);
            st.setString(3, county);
            st.setString(4, city);
            st.setInt(5, age);
            st.setString(6, gender);
            st.setString(7, email);
            st.setString(8, password);
            st.setInt(9, id);

            st.executeUpdate();
            st.close();


        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    public static PreparedStatement findByEmail(String email, String password) throws SQLException {

        Connection connection;

        PreparedStatement st = null;
        try {
            connection = makeConnection();
            st = connection.prepareStatement("SELECT * FROM students WHERE email = ? AND password=?");
            st.setString(1, email);
            st.setString(2, password);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        return st;
    }

    public static PreparedStatement listCourse() throws SQLException {

        Connection connection;

        PreparedStatement st = null;
        try {
            connection = makeConnection();
            st = connection.prepareStatement("SELECT * FROM courses");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        return st;
    }

    
    public static void enrollCourse(int sID, int cID) {
        try {
            Connection connection = makeConnection();
            PreparedStatement st = connection.prepareStatement("INSERT INTO enrollcourses (student_id, course_id) VALUES (?, ?)");
            st.setInt(1, sID);
            st.setInt(2, cID);

            st.executeUpdate();
            st.close();


        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

}
