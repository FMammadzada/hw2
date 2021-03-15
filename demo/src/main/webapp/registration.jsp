<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>

<form action="doRegistration" method="post">

    <table width="100%" border="4px" style="border-color: yellow; border-radius: 20px;">

        <table>
            <tr>
                <td>Enter info below</td>
            </tr>
        </table>

        <tr>
            <td><input name="email" type="email" style="float: left;"></td>
            <td><input name="password" type="password" style="float: left;"></td>

            <td> <button type="submit" style="">Registration</button></td>
        </tr>
    </table>

</form>

</body>
</html>
