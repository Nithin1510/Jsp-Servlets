<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<form action="employeeServlet">
			Enter name <input type="text" name="employeeName"> <br>
			Enter employeeId <input type="text" name="employeeId"> <br>
			Enter Salary <input type="text" name = "salary"> <br>
			Enter City <input type="text" name = "city"> <br>
		    <input type="submit" value="submit">
		</form>
	</fieldset>
</body>
</html>