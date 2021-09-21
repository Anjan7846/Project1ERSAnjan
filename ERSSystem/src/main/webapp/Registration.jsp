<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <style>
  body {
  background-image: url("EmployeeImage.jpg");
  background-size: cover;
 
  
}
  </style>
</head>
<body>
<div class="container">
  <h2> Registration Form  :Employee Reimbursment Application  </h2>
  
 
<form action="http://localhost:8686/ERSSystem/EmployeeRegistrationController" method="post">
            
  <table class="table table-hover">
    <thead>
      <tr>
        <td>Employee ID</td>
        <td><Input  type="text" name="empid" required></td>
       
      </tr>
      <tr>
        <td>Employee Password</td>
        <td><Input  type="password" name="emppassword" required></td>
       
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>Name</td>
        <td><input  type="text" name="empname" required></td>
      
      </tr>
      <tr>
        <td>Employee Department</td>
        <td><input  type="text" name="empldept" required></td>
      
      </tr>
       <tr>
        <td>Employee Designation</td>
        <td><input  type="text" name="empdesignation" required></td>
      
      </tr>
      <tr>
        <td>Employee DOB</td>
        <td><input  type="text" name="empdob" required></td>
      
      </tr>
   
      <tr>
        <td>Employee PhoneNumber</td>
        <td><input  type="text" name="empphoneno" required></td>
      
      </tr>
      <tr>
        <td>Employee Address</td>
        <td><input  type="text" name="empaddress" required></td>
      
      </tr>
       <tr>
        <td>Employee Email</td>
        <td><input  type="email" name="empemail" required></td>
      
      </tr>
      <tr>
        <td>Your Gender</td>
        <td><input  type="text" name="empgender" required></td>
      
      </tr>
      <tr>
        <td>Employee Type</td>
        <td>Employee<input  type="radio" name="emptype" value="Employee" ></td>
        <td>Manager<input  type="radio" name="emptype" value="Manager" ></td>
      
      </tr>
      <tr>
        <td><input type="submit" value="submit"   ></td>
        <td><input type="reset" value="Cancel"></td>
      
      </tr>
    </tbody>
  </table>
  </form>
</div>

</body>
</html>