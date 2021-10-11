<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Send an Omikuji!</h1>
<form action="/action" method="POST">
<p> Pick any number from 5 to 25: </p>
<input type="number" name="number">
<p>Enter the name of any city. </p>
<input type="text" name="city">
<p>Enter the name of any real person. </p>
<input type="text" name="name">
<p>Enter proffesional endeavor or hobby. </p>
<input type="text" name="hobby">
<p>Enter any type of living thing.</p>
<input type="text" name="animal">
<p>Say something nice to someone: </p>
<input type="text" name="comment">
<p>Send and show a friend</p>
<input type="submit">


</form>
</body>
</html>