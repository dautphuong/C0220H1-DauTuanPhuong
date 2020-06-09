<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/4/2020
  Time: 9:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form action="/calculate" method="post">
    <input type="text" name="num1">
    <input type="text" name="num2"><br/>
    <input type="submit" value="addition" name="choose">
    <input type="submit" value="subtraction" name="choose">
    <input type="submit" value="multiplication" name="choose">
    <input type="submit" value="division" name="choose"><br/>
    <label>Result</label>
    <input type="text" value="${result}" disabled>
</form>
</body>
</html>
