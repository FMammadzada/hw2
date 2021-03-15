<%@ page import="java.sql.ResultSet" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
</head>
<body>
<table border="1" cellpadding="3" width="300px" height="300px" style="background-color: black;  color: #7fffd4; margin: auto; text-align: center ">
    <caption><h4>List of Courses</h4></caption>
    <%
        ResultSet resultSet=(ResultSet) request.getAttribute("rt");

        while(resultSet.next()){
    %>
    <tr style="padding: 20px">
        <th style="color: beige">ID</th>
        <th style="color: beige">Course Name</th>
        <th style="color: skyblue">Enroll</th>

    </tr>

    <tr>
        <td><%=resultSet.getString("id") %></td>
        <td><%=resultSet.getString("name") %></td>

        <td>
            <form action="doEnroll" method="post">

                <input type="hidden" value="<%=resultSet.getString("id") %>" name="cID">
                <button type="submit" style="border-radius: 20px">Enroll</button>

            </form>
        </td>
    </tr>
    <%}%>
</table>


</body>
</html>
