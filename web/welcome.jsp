<%-- 
    Document   : welcome
    Created on : Jun 4, 2016, 10:28:12 AM
    Author     : John Agustin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body>
        <jsp:directive.include file="header.jsp" />
        <h3>Please select an action to perform:</h3>
        <form action="ViewServlet" method="post"><input type="submit" value="View List"/></form>
        <form action="AddServlet" method="post"><input type="submit" value="Add"/></form>
        <form action="LogoutServlet" method="post"><input type="submit" value="Logout"/></form>
        <jsp:directive.include file="footer.jsp" />
    </body>
</html>
