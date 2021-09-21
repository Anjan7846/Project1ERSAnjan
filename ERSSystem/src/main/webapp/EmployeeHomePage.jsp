<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
 <style>
 body {
  background-image: url("employeebackground.jpg");
  background-size: cover;
 
}

 </style>
<meta charset="ISO-8859-1">
<title>Employee</title>
</head>
<body>
<h1>Hello Employee, Welcome to your homepage.....</h1>
<form action="http://localhost:8686/ERSSystem/EmployeeApplication.jsp"  method="post">
<input type="submit" value="Apply for Reimbursment Request">
</form>
<form action="http://localhost:8686/ERSSystem/EmployeeUpdatejsp.jsp"  method="post">
<input type="submit" value="Update your details...">
</form>
<form action="http://localhost:8686/ERSSystem/Reimforpartemployee"  method="post">
<input type="submit" value="Display your reimbursement details......">
</form>
<form action="http://localhost:8686/ERSSystem/EmployeeProfileDetails"  method="post">
<input type="submit" value="Display your profile details...">
</form>


</body>
</html>