<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% pageContext.setAttribute("message", "Welcome");
	request.setAttribute("message", "Good Day in requests");
	session.setAttribute("message", "Great day in session");
	application.setAttribute("message", "Fun day in application");
%>
<h2>Using Scripting</h2>
<%  
String msg1 = (String)request.getAttribute("message");
String msg2 = (String)session.getAttribute("message");
String msg3 = (String)application.getAttribute("message");
%>
<%=msg1%> <br>
<%=msg2%> <br>
<%=msg3%> <br>

<h2>Using Expression Language</h2>
${message } <br>
${requsetScope.message } <br>
${sessionScope.message } <br>
${applicationScope.message } <br>
</body>
</html>