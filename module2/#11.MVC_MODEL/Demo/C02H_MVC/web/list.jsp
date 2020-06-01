<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List student</title>
</head>
<body>
    <table>
        <c:forEach var="student" items="${listStudent}">
            <tr>
                <td><c:out value="${student.getId()}"></c:out></td>
                <td><c:out value="${student.getName()}"></c:out></td>
                <td><c:out value="${student.getBirthday()}"></c:out></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
