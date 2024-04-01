<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Language</title>
</head>
<body>
	<% 
	out.println("Session Id = "+session.getId()+"<br>");
	out.println("Max session intervel  = "+session.getMaxInactiveInterval()+"<br>");
	String username = (String)session.getAttribute("username");
	session.setMaxInactiveInterval(1);
	out.println("Welcome "+ username);
	%>
	<fieldset>
		<form action="movieservlet">
			Select Category 
			<select name="language">
				<option value="telugu">telugu</option>
	            <option value="english">english</option>
	            <option value="tamil">tamil</option>
	            <option value="kannada">kannada</option>
            </select>
            <br>
            <input type="submit" value="show movies">
		</form>
	</fieldset>

</body>
</html>