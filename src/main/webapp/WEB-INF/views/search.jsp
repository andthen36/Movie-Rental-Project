<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		<h3>Search by:<h3>
		
			<input type = "radio" id="title" name="title" value="title">
			<lable for="title">Title</lable><br>
			
			<input type = "radio" id="description" name="description" value="description">
			<lable for="title">Description</lable><br><br>
			
			<input type="text" id="searchString" name="searchString"><br><br>
			<input type="submit" value="Search">
			
	</form>
	</div>
</body>
</html>