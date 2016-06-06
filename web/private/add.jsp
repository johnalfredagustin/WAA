<%-- 
    Document   : add
    Created on : Jun 4, 2016, 10:54:32 AM
    Author     : John Agustin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add</title>
        <link rel="stylesheet" type="text/css" href="./css/style.css" />
    </head>
    <body>
        <jsp:directive.include file="/template/header.jsp" />
        <h3>Enter new Product info</h3>
        <form action="<%= request.getContextPath().concat("/AddServlet")%>" method="post">
            <jsp:directive.include file="addmodifyTemplate.jsp" />
            <input type="submit" name="submit" value="Cancel" class="buttonClass" />
            <input type="submit" name="submit" value="Add" class="buttonClass" />
        </form>
        <jsp:directive.include file="/template/footer.jsp" />
    </body>
</html>
