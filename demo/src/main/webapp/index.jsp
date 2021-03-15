<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Index</title>
</head>
<body>

<form action="doLogin" method="post">

    <table>
        <tr>
            <td>Enter info below</td>
        </tr>
    </table>

    <tr>
        <td><input name="email" type="email" style="float: left; color: blue;"></td>
        <td><input name="password" type="password" style="float: left; color: red; "></td>
        <td><button type="submit" style="font-size: 12px; color: green;">Login</button></td>
    </tr>
    </table>

</form>


<a href="registration.jsp">Register here</a>


</body>
</html>