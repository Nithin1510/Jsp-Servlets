<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee registration</title>
</head>
<body>
<form action="employeeServlet">
	Enter name <input type="text" name="employeeName"> <br>
	Enter employeeId <input type="text" name="employeeId"> <br>
	Enter Salary <input type="text" name = "salary"> <br>
	Enter City <input type="text" name = "city"> <br>
	Enter Course 
	<select name="Course" multiple size="4">
       <option value="Java"> Java</option>
       <option value="Spring"> Spring</option>
       <option value="Html"> Html</option>
       <option value="Node"> Node</option>
    </select> <br>
    <input type="submit" value="submit">
	</form>
</body>
</html>