<%-- 
    Document   : addeditTemplate
    Created on : Jun 4, 2016, 11:54:10 AM
    Author     : John Agustin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        
            <table>
                <tr>
                    <td>Name:</td>
                    <td><input type="text" name="name" value="${prodName}"/></td>
                    <td>${addErrMsg.get(0)}</td>
                </tr>
                <tr>
                    <td>Price:</td>
                    <td><input type="text" name="price" value="${prodPrice}"/></td>
                    <td>${addErrMsg.get(1)}</td>
                </tr>
                <tr>
                    <td>Description:</td>
                    <td><input type="text" name="description" value="${prodDescription}"/></td>
                    <td></td>
                </tr>
            </table>
            <input type="submit" name="submit" value="Cancel" />
            
        
    </body>
</html>
