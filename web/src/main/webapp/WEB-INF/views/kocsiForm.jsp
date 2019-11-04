<%--
  Created by IntelliJ IDEA.
  User: judit
  Date: 2019. 11. 04.
  Time: 13:03
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="form"
          uri ="http://www.springframework.org/tags/form"%>
<%@page isELIgnored="false"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Kocsi hozzaadasa</title>
</head>
<body>
<h2>Kocsi adatai:</h2>
<form:form method="post" action="addKocsi">
    <form:label path="rendszam">Rendszam</form:label>
    <form:input path="rendszam"/>
    <br>
    <input type="submit" value="Küldés">
</form:form>

</body>
</html>
