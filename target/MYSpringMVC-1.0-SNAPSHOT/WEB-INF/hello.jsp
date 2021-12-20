<%@ page language="java" isELIgnored="false" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="bootstrap" uri="http://www.springframework.org/tags" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello Renchuan</title>
</head>
<body>
<h1>This is demo </h1>
<form method="post" action="login">
    <table>
        Username <input type="text" id="name" name="name" value="">
        Password <input type="text" id="password" name="password" value="">
        <br><br>
        submit
        <button type="submit" id="submit" value=""></button>
    </table>
</form>
</body>
</html>
