<%-- 
    Document   : index
    Created on : Jun 4, 2016, 10:17:48 AM
    Author     : John Agustin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>This is the Midterm Programming Exam</h1>
        <h3>To start the web-application please click start.</h3>
        <h3>The number of current users currently logged in is: ${login.count}</h3>
        <form action="login.jsp" method="get">
            <input type="submit" value="Start"/>
        </form>
    </body>
</html>
