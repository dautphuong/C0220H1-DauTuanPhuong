<jsp:useBean id="number2" scope="request" type=""/>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/1/2020
  Time: 9:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/VND" method="post">
    <input type="text" name="number1" />
    <input type="text" value="${number2}" disabled/>
    <input type="submit" name="submit" />
  </form>
  </body>
</html>
