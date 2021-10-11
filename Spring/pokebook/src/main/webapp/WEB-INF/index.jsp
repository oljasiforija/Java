<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <!-- c:out ; c:forEach ; c:if -->
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
   <!-- Formatting (like dates) -->
 <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
   <!-- form:form -->
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
   <!-- for rendering errors on PUT routes -->
 <%@ page isErrorPage="true" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Title Here</title>
  <!-- Bootstrap -->
  <link rel="stylesheet"
    href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
    integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
    crossorigin="anonymous">
</head>
<body>
    <div class="container"> <!-- Beginning of Container -->
        <h1>PokeBook</h1>
        <table class="table">
        	<tbody>
        	<tr>
        		<th> ID: </th>
        		<th> Expense Name: </th>
        		<th> Vendor: </th>
        		<th> Amount: </th>
        		<th> Actions: </th>
        	 </tr>
        	 <c:forEach var="e" items="${expenses}">
        	 <tr>
        	 <td> <c:out value="${e.id}"> </c:out> </td>
        	 <td> <a href="/${e.id}"><c:out value="${e.expenseName}"> </c:out></a> </td>
        	 <td> <c:out value="${e.vendor}"> </c:out> </td>
        	 <td> $ <c:out value="${e.amount}"> </c:out> </td>
        	 <td> <a class="btn btn" href="/edit/${e.id}"> Edit</a> </td>
        	 <td> <a class="btn btn-danger" href="/delete/${e.id}">Delete</a> </td>
        	 </tr>
        	  </c:forEach>
        	</tbody>
        </table>
        
        
        <form:form action="/expenses/create" method="post" modelAttribute="expense">
    <p>
        <form:label path="expenseName">Expense Name</form:label>
        <form:errors path="expenseName"/>
        <form:input path="expenseName"/>
    </p>
    <p>
        <form:label path="vendor">Vendor</form:label>
        <form:errors path="vendor"/>
        <form:textarea path="vendor"/>
    </p>
    <p>
        <form:label path="amount">Amount</form:label>
        <form:errors path="amount"/>
        <form:input type="number" path="amount"/>
    </p>
    <p>
        <form:label path="description">Description</form:label>
        <form:errors path="description"/>     
        <form:input path="description"/>
    </p>    
    <input type="submit" value="Submit"/>
</form:form>    
        
        
    </div> <!-- End of Container -->
</body>
</html>