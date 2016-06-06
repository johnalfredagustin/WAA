<%-- 
    Document   : header
    Created on : Jun 4, 2016, 10:57:31 AM
    Author     : John Agustin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>Welcome ${currentUser.name}</h1>
        <form action="${ pageContext.request.contextPath.concat('/LogoutServlet') }" method="post"><input type="submit" value="Logout"/></form>
    </body>
</html>
