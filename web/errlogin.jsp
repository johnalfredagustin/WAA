<%-- 
    Document   : errlogin
    Created on : Jun 4, 2016, 2:57:45 PM
    Author     : John Agustin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>Sorry you are not are not authorized to view this page.</h3>
        <h3>Please login first.</h3>
        <form action="login.jsp">
            <div><input type="submit" value="Go to Login Page"></div>
        </form>
        <jsp:directive.include file="/template/footer.jsp" />
    </body>
</html>
