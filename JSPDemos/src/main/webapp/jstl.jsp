<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL</title>/title>
</head>
<body>
	<% request.setAttribute("message", "Great Day");%>
	
	<c:out value="Today is a ${message }"></c:out>
	<c:set var="mess" value="Good Day" scope="session"></c:set>
	<c:out "Today is a ${mess}"> </c:out> <br>
	
	<% List<String> fruits= Arrays.asList("apple","guava", "orange");
	session.setAttribute("friuitsList", fruits);
	%>
	
	<c:forEach items="${friuitsList}" var="fruit" step="1">
	${fruit}<br>
	</c:forEach>
	
</body>
</html>