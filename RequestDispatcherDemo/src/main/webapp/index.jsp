<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration form</title>
</head>
<body>
	<form action="request">
	Enter employeeName <input type="text" name="name"> <br>
	Enter City <input type="text" name = "city"> <br>
	Enter Salary <input type="text" name = "salary"> <br>
	Enter Mobile number <input type="number" name = "mobile"> <br>
	Select Course 
	<select name="Course" multiple size="3">
       <option value="Java"> Java</option>
       <option value="Spring"> Spring</option>
       <option value="Html"> Node</option>
    </select> <br>
    Select Hobby
    <input type="checkbox" name="hobbies" value="sports"> sports 
    <input type="checkbox" name="hobbies" value="music"> Music 
    <input type="checkbox" name="hobbies" value="dance"> dance 
    <input type="checkbox" name="hobbies" value="travel"> travel  <br>
	<input type="submit" value="submit"> <br>
	</form>
</body>
</html>