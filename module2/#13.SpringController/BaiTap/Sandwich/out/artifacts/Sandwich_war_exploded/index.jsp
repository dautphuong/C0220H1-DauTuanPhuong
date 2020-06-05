<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/4/2020
  Time: 9:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<label>Sandwich Condiments</label>
<form action="/choose" method="post">
    <label>Lettuce</label>
    <input type="checkbox" name="condiment" value="Lettuce"><br/>
    <label>Tomato</label>
    <input type="checkbox" name="condiment" value="Tomato"><br>
    <label>Mustard</label>
    <input type="checkbox" name="condiment" value="Mustard"><br>
    <label>Sprouts</label>
    <input type="checkbox" name="condiment" value="Sprouts"><br>
    <input type="submit" value="save">
    <h1>Result: ${result}</h1>
</form>
</body>
</html>
