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
                    <td></td>
                    <td><input type="text" name="index" value="${prod.index}" hidden="true"/></td>
                    <td></td>
                </tr>
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
                    <td><input type="text" name="description" value='${prod.description}'/></td>
                    <td></td>
                </tr>
            </table>
            
            
        
    </body>
</html>
