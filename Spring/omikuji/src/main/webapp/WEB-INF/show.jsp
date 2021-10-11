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
	<h1>Here's your Omikuji!</h1>
	<p>In <c:out value="${number}"></c:out> years, you will live in <c:out value="${city}"></c:out> with
	<c:out value="${name}"></c:out> as your roomate, selling <c:out value="${hobby}"> </c:out> for a living.
	The next time you see a <c:out value="${animal}"> </c:out>, you will have a good luck. Also,
	 <c:out value="${comment}"></c:out>.
	</p>
	<a href="/">Go back!</a>
</body>
</html>