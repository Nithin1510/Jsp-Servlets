<%@page import="com.doctorapp.model.Doctor"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>doctor details</title>
</head>
<body>
	<h1>Doctor details</h1>
	<%
		Doctor doctor = (Doctor) request.getAttribute("doctor");
		out.println("Welcome : "+ doctor.getDoctorName() +"<br>");
		out.println("Doctor Id : "+ doctor.getDoctorId() +"<br>");
		out.println("Speciality : "+doctor.getSpeciality()+"<br>");
		out.println("Experience : "+ doctor.getExperience()+"<br>");
		out.println("Fees : "+ doctor.getFees()+"<br>");
	%>
</body>
</html>