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
        <h1>Welcome ${currentUser.name}</h1>
        <h3>Please select an action to perform:</h3>
        <form action="view.jsp" method="get"><input type="submit" value="View List"/></form>
        <form action="add.jsp" method="get"><input type="submit" value="Add"/></form>

    </body>
</html>
