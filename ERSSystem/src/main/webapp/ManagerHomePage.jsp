<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
 body {
  background-image: url("ManagerImage.jpg");
  background-size: cover;
 
}

 </style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello Manager, Welcome to your homepage.....</h1>
<form action="http://localhost:8686/ERSSystem/DisplayEmployees"  method="post">
<input type="submit" value="Display all employees details">
</form>
<form action="http://localhost:8686/ERSSystem/DisplayAllReimbursement"  method="post">
<input type="submit" value="View all reimbursement details..">
</form>
<form action="http://localhost:8686/ERSSystem/UpdateReim"  method="post">
<input type="submit" value="Update the reimbursement status...">
</form>
<form action="http://localhost:8686/ERSSystem/AllAcceptedReim"  method="post">
<input type="submit" value="View all accepted requests..">
</form>
<form action="http://localhost:8686/ERSSystem/AllRejectedReim"  method="post">
<input type="submit" value="View all rejected requests...">
</form>

</body>
</html>