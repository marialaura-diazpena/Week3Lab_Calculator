<%-- 
    Document   : arithmeticCalculator
    Created on : Jan 26, 2021, 8:33:27 AM
    Author     : 807930
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First: <input type="text" name="firstValue" value="${firstValue}"><br>
            Second: <input type="text" name="secondValue" value="${secondValue}"><br>
            <input type="submit" name="plus" value="+"> <input type="submit" name="minus" value="-">
            <input type="submit" name="multiply" value="*"> <input type="submit" name="modulus" value="%">
        </form>
            
            <% String message = "---"; %>
            <p>Result: ${message}<br>
            <a href="age">Age Calculator</a></p>
    </body>
</html>
