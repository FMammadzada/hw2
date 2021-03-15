<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Settings</title>
</head>
<body>
<%
    String id=(String)session.getAttribute("user");
    request.setAttribute("userID", id);


%>



    <table width="100%" border="4px" style="border-color: green; border-radius: 20px;">
        <table>
            <tr style="width: 100%">
                <td >Please fulfill the necessary info below :)</td></tr>
        </table>

        <tr>
            <form action="doUpdate" method="post">
                <td>    <input name="id" type="hidden" value="${userID}"></td>
            <td><input name="email" type="email" value="Email" style="background-color: darkkhaki"></td>
            <td><input name="password" type="password" value="" style="background-color: darkgoldenrod"></td>
            <td><input name="fName" type="text"value="Enter your name" style="background-color: skyblue"></td>
            <td><input name="lName" type="text"value="Enter your surname" style="background-color: blanchedalmond"></td>
            <td><input name="country" type="text"value="Country" style="background-color: chartreuse"></td>
            <td><input name="city" type="text"value="City" style="background-color: azure"></td>
            <td><input name="gender" type="text"value="Choose Gender" style="background-color: chocolate"></td>
            <td><input name="age" type="number" value="Your Age" style="background-color: cornflowerblue"></td>
            <td><button type="submit" style="background-color: red;">Registration</button></td>
            </form>

        </tr>

    </table>



</body>
</html>
