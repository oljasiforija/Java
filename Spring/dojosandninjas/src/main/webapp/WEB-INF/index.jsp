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
        <h2>Hello!</h2>
        <h3>Please add a Ninja!</h3>
           <table class="table">
        	<tbody>
        	<tr>
        		<th> First Name: </th>
        		<th> Last Name: </th>
        		<th> Age: </th>
        		<th> Dojo Location: </th>
        	 </tr>
        	 <c:forEach var="i" items="${ninjas}">
        	 <tr>
        	 <td> <c:out value="${i.firstName}"> </c:out> </td>
        	 <td> <c:out value="${i.lastName}"> </c:out> </td>
        	 <td><c:out value="${i.age}"> </c:out> </td>
        	 <td> <a  href="/dojo/${i.dojo.id}"> ${i.dojo.name}</a> </td>
        	 </tr>
        	  </c:forEach>
        	</tbody>
        </table>
        
        <form:form action="/ninja/create" method="post" modelAttribute="ninja">
    <p>
    	<form:select path="dojo">
    		<c:forEach var="d" items="${dojos}">
    			<option value="${d.id}"> ${d.name} </option>
    		</c:forEach>
    	</form:select>
    </p>
    <p>
        <form:label path="firstName">First name:</form:label>
        <form:errors path="firstName"/>
        <form:input path="firstName"/>
    </p>
    <p>
        <form:label path="lastName">Last name: </form:label>
        <form:errors path="lastName"/>
        <form:textarea path="lastName"/>
    </p>
    <p>
        <form:label path="age">Age</form:label>
        <form:errors path="age"/>
        <form:input type="number" path="age"/>
    </p>
       
    <input type="submit" value="Submit"/>
</form:form>
	<a href="/dojos/new"> Add a dojo!</a>
    
    </div> <!-- End of Container -->
</body>
</html>