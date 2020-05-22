<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/22/2020
  Time: 8:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Currency Converter</title>
  <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
//form action có nhiều button
<script>
    function changeConvert(actionName,methodName) {
        document.getElementById("formConvert").action = actionName;
        document.getElementById("formConvert").method =methodName;
        document.getElementById("formConvert").submit();
    }
</script>
<h2>Currency Converter</h2>
<form action="" method="" id="formConvert">
  <label>Rate: </label><br/>
  <input type="text" name="rate" placeholder="RATE" value="22000"/><br/>
  <label>USD: </label><br/>
  <input type="text" name="usd" placeholder="USD" value="0"/><br/>
  <input type = "button" value = "Converter" onclick="changeConvert('/convert','post')"/>
    <input type = "button" value = "Converter2" onclick="changeConvert('/convert2','get')"/>
</form>
</body>
</html>

