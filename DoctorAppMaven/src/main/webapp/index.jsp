<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Doctor</title>
<style>
div {
	display: flex;
	text-align: right;
}
</style>
</head>
<body>
	<div>
		<a href="login.jsp">
			<button>Admin</button>
		</a>
	</div>
	<h3>Search doctor by speciality</h3>
	<form action="searchServlet">
		Search by speciality<input type="text" name="speciality" placeholder="speciality">
		<br> <hr>
		<input type="submit" value="search">
	</form>
</body>
</html>
