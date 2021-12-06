<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Order</title>
</head>
<body>
	<b>Please customize your pizza:</b>
		<form:form action = "addOrder" modelAttribute = "newPizza" method="post">
		<form:hidden path="customerId"/>
			<table>
				<tr>
					<td>Pick a size:</td>
					<td><form:radiobuttons path="size">
						<form:options items="${sizeList}" />
						</form:radiobuttons></td>
				</tr>
				<tr>
					<td>Pick your toppings:</td>
					<td><form:checkbockes path="topping">
						<form:options items="${toppingList}" />
						</form:checkbockes></td>
				</tr>
					<td></td>
					<td><input type="submit" value = "Add pizza to cart"/></td>
				</tr>
			</table>
<a href = ${pageContext.request.contextPath}/pizza/list>Back to Customer List</a>
		</form:form>
</body>
</html>