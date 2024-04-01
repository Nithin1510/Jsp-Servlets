<%@page import="com.employeeapp.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee details</title>
</head>
<body>
	<h1>Employee Details</h1>
	<%
		Employee employee = (Employee) request.getAttribute("employee");
		out.println("Welcome : "+ employee.getEmployeename() +"<br>");
		out.println("Employee Id : "+ employee.getEmployeeId() +"<br>");
		out.println("City : "+employee.getCity()+"<br>");
		out.println("Course : "+employee.getCourse()+"<br>");
		out.println("Salary : "+employee.getSalry()+"<br>");
	%>
	
</body>
</html>