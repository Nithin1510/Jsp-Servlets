<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
</head>
<body>
	<h2>Update Doctor Details</h2>
	<form action="updateServlet">

		Enter Doctor Id <input type="text" name="doctorId"
			value="${doctor.doctorId}" readonly> <br> <br>

		Enter Doctor Name <input type="text" name="doctorName"
			value="${doctor.doctorName}" readonly> <br> <br>
		Enter Doctor Speciality <select name="speciality" readonly>
			<option>${doctor.speciality}</option>
		</select> <br> <br> Enter Doctor Fees <input type="text"
			name="doctorFees" value="${doctor.fees}"> <br> <br>
		Enter Doctor Ratings <input type="text" name="doctorRatings"
			value="${doctor.ratings}" readonly> <br> <br> Enter
		Doctor Experience <input type="text" name="doctorExperience"
			value="${doctor.experience}" readonly> <br> <br> <input
			type="submit" value="Submit">
	</form>
</body>
</html>