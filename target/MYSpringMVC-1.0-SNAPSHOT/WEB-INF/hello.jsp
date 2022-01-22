<%@ page language="java" isELIgnored="false" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="bootstrap" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello Renchuan</title>
    <link href="<c:url value="/resources/styles/bootstrap.css" />" rel="stylesheet">
    <script src="<c:url value="/resources/javascript/example.js" />"></script>
</head>
<body>
<h1>Log In 欢迎董凯月小朋友！</h1>

<form method="post" action="login">
    <div class="mb-3">
        <label for="Username" class="form-label" name="Username">UserName</label>
        <input type="account" class="form-control" id="Username" aria-describedby="emailHelp" name="Username">
    </div>
    <br>
    <div class="mb-3">
        <label for="Password" class="form-label" name="Password">Password</label>
        <input type="password" class="form-control" id="Password" name="Password">
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
</body>
</html>
