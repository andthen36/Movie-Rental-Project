<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer List</title>
</head>

<body>
<div class="form-style-2">
	<h1>Customer List</h1>

	<table>
		<tr>
			<th> First Name </th>
			<th> Last Name </th>
			<th> Street </th>
			<th> City </th>
			<th> State </th>
			<th> Zip </th>
		</tr>
		
	<c:forEach var="eachCustomer" items="${customers}">
		
		<tr>
			<td>${eachCustomer.firstName}</td>
			<td>${eachCustomer.lastName}</td>
			<td>${eachCustomer.street}</td>
			<td>${eachCustomer.city}</td>
			<td>${eachCustomer.state}</td>
			<td>${eachCustomer.zip}</td>
			
			<td><form:form action="updateCustomer" method="post">
				<input type="hidden" name="customerId" value="${eachCustomer.id}"/>
				<input type="submit" value="Update Customer"/>
				</form:form></td>
				
			<td><form:form action="orderHistory" method="post">
				<input type="hidden" name="customerId" value="${eachCustomer.id}"/>
				<input type="submit" value="Order History"/>
				</form:form></td>
				
			<td><form:form action="orderPizza" modelAttribute="newPizza" method="post">
				<input type="hidden" name="customerId" value="${eachCustomer.id}"/>
				<input type="submit" value="Order Pizza"/>
				</form:form></td>
		</tr>
	</c:forEach>
	</table>
		<form action="addCustomer" method = "post">
	<input type = "submit" value = "Add Customer" />
	</form>
	<a href = ${pageContext.request.contextPath}/>Back to Home Page</a>
	</div>
</body>
</html>