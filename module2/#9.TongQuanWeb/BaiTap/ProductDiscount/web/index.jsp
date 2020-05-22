<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/22/2020
  Time: 9:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h2>Product Discount Calculator</h2>
<form action="/discount" method="post">
    <label>Product Description :</label>
    <input type="text" name="product"/><br/>
    <label>List Price:</label>
    <input type="text" name="list"/><br/>
    <label>Discount Percent:</label>
    <input type="text" name="percent">%<br/>
    <input type="submit" value="Caculate Discount"/>
</form>
</body>
</html>
