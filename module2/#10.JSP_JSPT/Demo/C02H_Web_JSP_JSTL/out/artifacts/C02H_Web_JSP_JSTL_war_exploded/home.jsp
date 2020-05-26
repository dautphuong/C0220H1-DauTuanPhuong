<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1 style="color: red">
        <c:out value="${param.username}"></c:out>
    </h1>
<%--    <%--%>
<%--        if (username.equalsIgnoreCase("C02H")) {--%>
<%--    %>--%>
    <c:choose>
<%--        <c:when test="${param.username == 'C02H'}">--%>
        <c:when test="${param.username eq 'C02H'}">
            <h2>Chào mừng bạn đến với CodeGym</h2>
        </c:when>
<%--    <%--%>
<%--        } else {--%>
<%--    %>--%>
        <c:otherwise>
            <h2>Chào mừng khách hàng</h2>
        </c:otherwise>
    </c:choose>
<%--    <%--%>
<%--        }--%>
<%--    %>--%>
    <p><c:out value="${dataDB}"></c:out></p>

<%--    for (Student student : abc) {--%>
    <table>
    <c:forEach var="student" items="${abc}">
        <tr>
            <td><c:out value="student.getName()"></c:out></td>
            <td><c:out value="${student.getBirthday()}"></c:out></td>
        </tr>
    </c:forEach>
    </table>

<%--    <c:redirect url="/final.jsp"></c:redirect>--%>

</body>
</html>
