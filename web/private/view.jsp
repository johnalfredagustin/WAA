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
        <link rel="stylesheet" type="text/css" href="./css/style.css" />
    </head>
    <body>
        <jsp:directive.include file="/template/header.jsp" />
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
                        
                        <td><a href="${ pageContext.request.contextPath.concat('/ModifyServlet?index=').concat(prod.index) }">Edit</a></td>
                        <td><a href="${ pageContext.request.contextPath.concat('/DeleteServlet?index=').concat(prod.index) }">Delete</a></td>
                        <td></td>
                    </tr>
                </c:forEach>
            </table>
            
        </form>
        <form action="<%= request.getContextPath().concat("/private/welcome.jsp")%>"><input type="submit" value="Cancel" class="buttonClass"/></form>
        <jsp:directive.include file="/template/footer.jsp" />
    </body>
</html>
