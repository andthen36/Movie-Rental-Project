<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Movie List</title>
</head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/myStyle.css">
<style>
table {
  border-collapse: collapse;
  width: 100%;
  border: 1px solid #ddd;
}

th, td {
  text-align: left;
  padding: 16px;
}
</style>
<body>
<div class="form-style-2">
	<h1>Movie List</h1>
	<table style="width:100%">
		<tr>
			<th> Title</th>
			<th> Description</th>
			<th> Length </th>
			<th> Year </th>
			<th> Release </th>
			<th> Genre </th>

			<th> Rating </th>

			<th> Total Copies </th>
			<th> Available Copies </th>
		</tr>
		
	<c:forEach var="eachMovie" items="${movies}">
	
	
		
		<tr>
		
			<td>${eachMovie.title}</td>
			<td>${eachMovie.description}</td>
			<td>${eachMovie.length}</td>
			<td>${eachMovie.year}</td>
			<td>${eachMovie.release}</td>
			<td>${eachMovie.genre}</td>
			<td>${eachMovie.rating}</td>
			<td>${eachMovie.totalCopies}</td>
			<td>${eachMovie.availableCopies}</td>
			<td><form action="rentMovie" modelAttribute = "checkout" method="post">
					<input type="hidden" name="customerId" value="${customerId}"/>
					<input type="hidden" name="movieId" value="${eachMovie.id}"/>
					<input type="submit" value="Rent Movie"/> 
				</form><td>
			
		</tr>
	</c:forEach>
	
	</table>
	<br>
	<form action="${pageContext.request.contextPath}/">
    <input type="submit" value="Back to Home" />
	</div>
</body>
</html>