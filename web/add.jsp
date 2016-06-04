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
    </head>
    <body>
        <jsp:directive.include file="footer.jsp" />
        <h3>Enter new Product info</h3>
        <form action="AddServlet" method="get">
            <table>
                <tr>
                    <td>Name:</td>
                    <td><input type="text" name="name" value="${prod.name}"/></td>
                    <td>${addErrMsg.get(0)}</td>
                </tr>
                <tr>
                    <td>Price:</td>
                    <td><input type="text" name="price" value="${prod.price}"/></td>
                    <td>${addErrMsg.get(1)}</td>
                </tr>
                <tr>
                    <td>Description:</td>
                    <td><input type="text" name="description" value="${prod.description}"/></td>
                    <td></td>
                </tr>
            </table>
            <input type="submit" name="submit" value="Cancel" />
            <input type="submit" name="submit" value="Add" />
        </form>
        <jsp:directive.include file="footer.jsp" />
    </body>
</html>
