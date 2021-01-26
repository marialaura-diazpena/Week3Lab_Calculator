<%-- 
    Document   : ageCalculator
    Created on : Jan 25, 2021, 5:23:12 PM
    Author     : 807930
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            Enter your age: <input type="text" name="ageEntered" value="${ageEntered}"><br>
            <input type="submit" value="Age next birthday">
        </form>
        
        <p>${message}</p>
        
        <a href="/WEB-INF/arithmeticCalculator.jsp" action="arithmetic"> Arithmetic Calculator</a>
            
    </body>
</html>
