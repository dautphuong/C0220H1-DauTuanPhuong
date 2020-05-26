<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/26/2020
  Time: 9:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<label >Result :</label>
<c:out value="${firstOperand}${param.operator}${secondOperand}=${result}"></c:out>
</body>
</html>
