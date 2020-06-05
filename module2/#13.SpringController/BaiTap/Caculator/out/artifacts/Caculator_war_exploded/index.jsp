<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/4/2020
  Time: 9:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form action="/caculation" method="post" id="formCaculation">
    <input type="text" name="num1">
    <input type="text" name="num2"><br/>
    <input type="submit" value="addition" name="submit">
    <input type="submit" value="subtraction" name="submit">
    <input type="submit" value="multiplication" name="submit">
    <input type="submit" value="division" name="submit"><br/>
    <label>Result</label>
    <input type="text" value="${result}" disabled>
</form>
<script>
  function changeAction(actionName) {
    document.getElementById("formCaculation").action=actionName;
    document.getElementById("formCaculation").submit();
  }
</script>
</body>
</html>
