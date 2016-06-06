<%-- 
    Document   : login
    Created on : Jun 4, 2016, 10:23:04 AM
    Author     : John Agustin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" type="text/css" href="./css/style.css" />
    </head>
    <body>
        <h3>Please login to continue.</h3>
        <form action="LoginServlet" method="post">
            <table>
                <tr>
                    <td>Username: </td>
                    <td><input type="text" name="username"></td>
                    <td class="errMsg">${loginErrMsg.get(0)}</td>
                </tr>
                <tr>
                    <td>Password: </td>
                    <td><input type="password" name="password"></td>
                    <td class="errMsg" >${loginErrMsg.get(1)}</td>
                </tr>
            </table>
            <input type="submit" value="Login" class="buttonClass" />
        </form>
        <jsp:directive.include file="/template/footer.jsp" />
    </body>
</html>
