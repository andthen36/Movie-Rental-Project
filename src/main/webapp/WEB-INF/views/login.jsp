<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/myStyle.css">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta charset="UTF-8">
<title>Log In</title>
</head>
<body>
<div class="form-style-2">
	<h3>Log In</h3>
		<c:forEach var="eachCustomer" items="${customers}">
				<form:form action="loginCustomer" method="post">
					<input type="hidden" name="customerId" value="${eachCustomer.id}"/>
					<input type="submit" value="Log in as: ${eachCustomer.name}"/> 
				</form:form>
				<br>
		</c:forEach>
	<form action="${pageContext.request.contextPath}/">
    <input type="submit" value="Back to Home" />
</form>
</div>
</body>

</html>