<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/25/2020
  Time: 11:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form action="/display" method="post">
    <label>Danh sách khách hàng</label>
    <table>
        <tr>
            <th>Tên</th>
            <th>Ngày Sinh</th>
            <th>Địa chỉ</th>
            <th>Ảnh</th>
        </tr>
        <c:forEach var="customer" items="${list}">
            <tr>
                <td>${customer.getFullname()}</td>
                <td><c:out value="${customer.getBirthday()}"></c:out></td>
                <td><c:out value="${customer.getAddress()}"></c:out></td>
                <td><img src='image/${customer.image}' style="height: 50px; width: 50px"></td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>
