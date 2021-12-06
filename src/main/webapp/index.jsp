<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/myStyle.css">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="form-style-2">

<h1>Home Page</h1>
<body>
<form action="${pageContext.request.contextPath}/newMovie">
    <input type="submit" value="Add a new movie" />
</form>
<form action="${pageContext.request.contextPath}/list">
    <input type="submit" value="Browes movies" />
</form>
<form action="${pageContext.request.contextPath}/login">
    <input type="submit" value="Log in" />
</form>
    </body>
</div>