<%-- 
    Document   : view
    Created on : Jun 4, 2016, 10:58:16 AM
    Author     : John Agustin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View</title>
    </head>
    <body>
        <jsp:directive.include file="header.jsp" />
        <form action="" method="post">
            <table>
                <tr>
                    <th>Index</th>
                    <th>Name</th>
                    <th>Price</th>
                    <th>Description</th>
                    <th>Edit Link</th>
                    <th>Delete Link</th>
                </tr>
                <c:forEach items="${productList}" var="prod">
                    <tr>
                        <td>${prod.index}</td>
                        <td>${prod.name}</td>
                        <td>${prod.price}</td>
                        <td>${prod.description}</td>
                        <td><a href="${'ModifySevlet?index='.concat(prod.index)}">Edit</a></td>
                        <td><a href="${'DeleteServlet?index='.concat(prod.index)}">Delete</a></td>
                        <td></td>
                    </tr>
                </c:forEach>
            </table>
            
        </form>
        <form action="welcome.jsp"><input type="submit" value="Cancel"/></form>
        <jsp:directive.include file="footer.jsp" />
    </body>
</html>
