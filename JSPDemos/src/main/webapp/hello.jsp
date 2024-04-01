<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="errorHandler.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<H1>Welcome to JSP</H1>
	<% String name = "nithin";	%>
	<%= "Welcome "+ name %>

	<% int x=10;
	int y =20;	%>
	<%="Sum "+(x+y)%>
	
	<%int counter=0; %>
	You are visitor number : <%= ++counter %>
	<br>
	<%! String greet(){
		return "Come back";
	}
		%>
</body>
</html>