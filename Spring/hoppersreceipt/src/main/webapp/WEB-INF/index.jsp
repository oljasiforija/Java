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
	<h1>Hello</h1>
	<h3>
		<c:out value="${name}"></c:out>
	</h3>
	<p>
		<c:out value="${itemName}"></c:out>
	</p>
	<p> $
		<c:out value="${price}"></c:out>
	</p>
	<p>
		<c:out value="${description}"></c:out>
	</p>
	<p>
		<c:out value="${vendor}"></c:out>
	</p>
</body>
</html>