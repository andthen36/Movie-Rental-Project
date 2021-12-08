<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/myStyle.css">
<head>
<meta charset="UTF-8">
<title>Order History</title>
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
<div class="form-style-2">
<h2>Check out for: ${customerName}</h2>

	<table>
					<tr>
						<th>Checkout Id</th>
						<th>Title</th>
						<th>Checkout Date</th>
						<th>Return Date</th>
					</tr>
		
	<c:forEach var="eachCheckout" items="${checkouts}">
					
						<tr>
							<td>${eachCheckout.id}</td>
							<td>${eachCheckout.movie.title}</td>
							<td>${eachCheckout.outDate}</td>
							<td>${eachCheckout.returnDate}</td>
							<td>
					<form action="returnMovie" method="post">
						<input type="hidden" name="checkoutId" value = "${eachCheckout.id}"/>
						<input type="hidden" name="movieId" value = "${eachCheckout.movie.id}"/>
						<input type="hidden" name="customerId" value = "${customerId}"/>
						<input type="submit" value="Return Movie">
					</form>
					</td>
						</tr>
					</c:forEach>

				</table>
				<br>
				
	<form action="list" method="post">
	<input type="hidden" name="customerId" value="${customerId}"/>
	<input type="submit" value="Browse All Movies"/>
	</form><br>
	<form action="search" method="post">
    <input type="submit" value="Search for a movie" />
    </form>
				<br>
				<br>
	<form action="${pageContext.request.contextPath}/">
    <input type="submit" value="Back to Home" />
    </form>
    </div>
</body>
</html>