<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Doctor Registration</title>
</head>
<body>
	<form action="doctorServlet">
		Enter name <input type="text" name="doctorName"> <br>
		Enter DoctorId <input type="text" name="doctorId"> <br>
		Enter experience <input type="text" name = "experience"> <br>
		Enter Fees <input type="text" name = "fees"> <br>
		Enter Speciality 
		<select name="speciality" multiple size="5">
	       <option value="ORTHOPEDIATRICIAN"> ORTHOPEDIATRICIAN</option>
	       <option value="PAEDIATRICIAN"> PAEDIATRICIAN</option>
	       <option value="GYNAECOLOGIST"> GYNAECOLOGIST</option>
	       <option value="NEUROLOGY"> NEUROLOGY</option>
	       <option value="DERMATOLOGIST"> DERMATOLOGIST</option>
	    </select> <br>
	    <input type="submit" value="submit">
	</form>
</body>
</html>