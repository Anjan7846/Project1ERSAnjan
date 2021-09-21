<!DOCTYPE html>
<html lang="en">
<head>
<style>
 body {
  background-image: url("loginimage.jpg");
  background-size: cover;
 
}

 </style>
  <title>Bootstrap Example for ERS application xxxxx</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  
  <script >
     function validate() {
    	 alert("submit is selected...")
    	 
    	
     }
  
  </script>
</head>
<body>
    
<div class="container">
  <h2> Login Form  :Welcome to Employee Reimbursment Application  </h2>
  
 
 

  <form action="http://localhost:8686/ERSSystem/EmployeeLoginController" method="post">     
  <table class="table table-hover">
    <thead>
      <tr>
        <td>ID</td>
        <td><Input id="Employee ID" type="text" name="empid"></td>
       
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>Password</td>
        <td><input id="Employee Password" type="password" name="emppassword"></td>
      
      </tr>
     
     <tr>
        <td>type</td>
        <td><select name="emptype"> <option value="manager">Manager
                     <option value="employee">Employee
                     
             </select>   
           
                     </td>
      
      </tr>
      <tr>
      <button type="submit" class="btn btn-success" >Submit Details</button>
     
        <td><input type="reset" value="Cancel"></td>
      
      </tr>
    </tbody>
  </table>
  </form>
</div>

</body>
</html>