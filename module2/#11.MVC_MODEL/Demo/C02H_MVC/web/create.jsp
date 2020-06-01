<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create student</title>
</head>
<body>
    <c:out value="${message}"></c:out>
    <form method="post">
<%--        <input type="hidden" name="action" value="create" />--%>
        <input type="text" name="name" />
        <input type="text" name="birthday" />
        <input type="submit" value="Register" />
    </form>
</body>
</html>
