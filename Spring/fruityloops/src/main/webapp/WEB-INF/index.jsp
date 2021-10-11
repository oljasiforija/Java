<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>Fruit Store</h1>
		<table class="table">
			<tbody>
				<tr>
					<th>Name</th>
					<th>Price </th>
				</tr>
				<c:forEach var ="fruit" items="${fruits}">
				<tr>
					<td>
					<c:out value="${fruit.name}"> </c:out>
					</td>
					<td>
					<c:out value="${fruit.price}"> </c:out>
					</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>