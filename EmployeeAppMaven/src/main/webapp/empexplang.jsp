
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Employee Details</h1>
	<!--  Expression Language -->
	Welcome ${employee.employeeName}
	<br> City ${employee.city}
	<br> EmployeeId ${employee.employeeId}
	<br> Salary ${employee.salary}
	<hr>
	Message ${message }
	<br> Message1 ${message1 }
	<br> In session scope message ${sessionScope.message1}
	<br>
</body>
</html>