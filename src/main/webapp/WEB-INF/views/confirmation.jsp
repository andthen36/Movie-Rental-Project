<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Confirmation</title>
</head>
<body>
	<h2>${order.customer.firstName}&nbsp; ${order.customer.lastName}'s cart:</h2>
	<table>
		<c:forEach var="eachPizza" items="${order.pizzaList}" varStatus="theCount">
		<tr>
			<td>Pizza ${theCount.count}</td>
			<td>Size:</td>
			<td>${eachPizza.size}</td>
			<td>Toppings:</td>
			<td><c:forEach var = "eachTopping" items="${eachPizza.toppings}">
			${eachTopping}&emsp;
			</c:forEach>
			<td><form action="deletePizza" method="post">
				<input type="hidden" name="pizzaId" value="${theCount.count}"/>
				<input type="submit" value="Delete pizza">
				</form></td>
		</tr>
		</c:forEach>
		<div>
			<form action="orderPizza" method="post">
				<input type = "hidden" name = "customerId" value = "${order.customer.id}"/>
				<input type="submit" value="Add more pizza">
			</form>
			<form action="placeOrder" method="post">
				<input type = "hidden" name = "customerId" value = "${order.customer.id}"/>
				<input type="submit" value="Place order">
			</form>
		</div>
	</table>
	
	<a href = ${pageContext.request.contextPath}/pizza/list>Back to Customer List</a>
</body>
</html>