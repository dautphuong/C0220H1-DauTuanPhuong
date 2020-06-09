<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <form:form action="/create" method="post" modelAttribute="student">
        <form:input path="name" />
        <form:input path="birthday" />
        <form:button>Register</form:button>
    </form:form>

</body>
</html>
