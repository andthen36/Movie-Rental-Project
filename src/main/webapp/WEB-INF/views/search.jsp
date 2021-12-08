<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/myStyle.css">
</head>
<meta charset="UTF-8">
<title>Search</title>
<body>
	<div class="form-style-2">
	<form action="searchMovie" modelAttribute = "searchString" method="post">
	<form hidden = "customerId">
		<h3>Search by:</h3>
		
		
			
			<input type="text" id="searchString" name="searchString"><br><br>
			<input type="submit" value="Search">
	
	</form>	
	</form>
	</div>
</body>
</html>