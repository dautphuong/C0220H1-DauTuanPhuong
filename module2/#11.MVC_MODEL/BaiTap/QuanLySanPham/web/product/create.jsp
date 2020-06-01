<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/29/2020
  Time: 9:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Create new Product</h1>
<p>
    <c:if test="${requestScope['message']!=null}">
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="/products">Back to product list</a>
</p>
<form method="post">
    <table>
        <tr>
            <td>Name:</td>
            <td><input type="text" name="name" id="name"></td>
        </tr>
        <tr>
            <td>Type:</td>
            <td><input type="text" name="type" id="type"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Create Product"></td>
        </tr>
    </table>
</form>
</body>
</html>
