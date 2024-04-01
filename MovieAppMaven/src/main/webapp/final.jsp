<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Movies list</title>
</head>
<body>
<h1> Movies list</h1>
<%
	out.println("Session Id = "+session.getId()+"<br>");
	out.println("Max seession intervel  = "+session.getMaxInactiveInterval()+"<br>");
	String username = (String)session.getAttribute("username");
	out.println("Welcome "+ username); 
	List<String> movies = (List<String>)request.getAttribute("movies");
	for(String movie: movies){
		out.println(movie+"<br>");
	}
%>
</body>
</html>