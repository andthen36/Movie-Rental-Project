<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Order Pizza</title>
</head>
<body>
	<h2>
		${customerName}<br>Please customize your pizza:
	</h2>
	<form:form action="addOrder" modelAttribute="newPizza">
		
		<table>
			<tr>
				<td>Pick your size:</td>
				<td><form:radiobuttons path="size" items="${sizeList}"/> <br>
				</td>
			</tr>
			<tr>
				<td>Pick the topping:</td>
				<td><form:checkboxes path="toppings" items="${toppingList}"/> <br>
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="Add pizza to cart" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>