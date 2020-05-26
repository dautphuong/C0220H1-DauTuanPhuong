<%--
  Created by IntelliJ IDEA.
  User: pato2
  Date: 05/25/20
  Time: 10:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        request.setCharacterEncoding("UTF-8");
        request.setAttribute("dataDB", "thong tin gia dinh");
        request.getRequestDispatcher("/home.jsp").forward(request, response);
    %>
</body>
</html>
