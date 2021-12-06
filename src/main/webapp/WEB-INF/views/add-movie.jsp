<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/myStyle.css">
<meta charset="UTF-8">
<title>New Movie</title>
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

</head>
<body>
	<div class = "form-style-2">
	<b>Please enter the movie info:</b>
		<form:form action = "processMovie" modelAttribute = "movie" method="post">
		<form:hidden path="id"/>
			<table>
				<tr>
					<td>Title:</td>
					<td><form:input path="title"/></td>
				</tr>
				<tr>
					<td>Description:</td>
					<td><form:input path="description"/></td>
				</tr>
				<tr>
					<td>Length:</td>
					<td><form:input path="length"/></td>
				</tr>
				<tr>
					<td>Year Made:</td>
					<td><form:input path="year"/></td>
				</tr>
				<tr>
					<td>Release Date:</td>
					<td><form:input path="release"/></td>
				</tr>
				<tr>
					<td>Rating:</td>
					<td><form:select path="rating">
						<form:options items="${ratingList}" />
						</form:select ></td>	
				</tr>
				<tr>
					<td>Available Copies:</td>
					<td><form:input path="availableCopies"/></td>
				</tr>
				<tr>
					<td>Number of Copies:</td>
					<td><form:input path="totalCopies"/></td>
				</tr>
				<tr>
					<td>Genre:</td>
					<td><form:select path="genre">
						<form:options items="${genreList}"/>
						</form:select></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value = "Add Movie"/></td>
				</tr>
			</table>
<a href = ${pageContext.request.contextPath}/>Back to Menu</a>
		</form:form>
		</div>
</body>
</html>