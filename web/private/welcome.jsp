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
        <link rel="stylesheet" type="text/css" href="./css/style.css" />
    </head>
    <body>
        <jsp:directive.include file="/template/header.jsp" />
        <h3>Please select an action to perform:</h3>
        <form action="<%= request.getContextPath().concat("/ViewServlet") %>" method="post"><input type="submit" value="View List" class="buttonClass"/></form>
        <form action="<%= request.getContextPath().concat("/private/add.jsp") %>" method="get"><input type="submit" value="Add" class="buttonClass"/></form>
        
        <jsp:directive.include file="/template/footer.jsp" />
    </body>
</html>
