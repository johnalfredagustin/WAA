<%-- 
    Document   : edit
    Created on : Jun 4, 2016, 11:53:05 AM
    Author     : John Agustin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modify Product Info</title>
    </head>
    <body>
        <h3>Modify Product Info</h3>
        <form action="<%= request.getContextPath().concat("/ModifyServlet")%>" method="post">
            <jsp:directive.include file="addmodifyTemplate.jsp" />
            <input type="submit" name="submit" value="Cancel" />
            <input type="submit" name="submit" value="Modify" />
        </form>
        <jsp:directive.include file="/template/footer.jsp" />
    </body>
</html>
