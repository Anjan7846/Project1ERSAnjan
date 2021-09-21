<!DOCTYPE html>
<html>
<head>
<style>
 body {
  background-image: url("EmployeeApplicationImage.jpg");
  background-size: cover;
 
}

 </style>

<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {
  box-sizing: border-box;
}

input[type=text], select, textarea {
  width: 100%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  resize: vertical;
}

label {
  padding: 12px 12px 12px 0;
  display: inline-block;
}

input[type=submit] {
  background-color: #04AA6D;
  color: black;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  float: right;
}

input[type=submit]:hover {
  background-color: #1f7a1f;
}

.container {
  border-radius: 5px;
  background-color: #66ffff;
  padding: 20px;
}

.col-25 {
  float: left;
  width: 25%;
  margin-top: 6px;
}

.col-75 {
  float: left;
  width: 75%;
  margin-top: 6px;
}

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}

/* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */
@media screen and (max-width: 600px) {
  .col-25, .col-75, input[type=submit] {
    width: 100%;
    margin-top: 0;
  }
}
</style>
</head>
<body>

<h2>Welcome to Employee Application :) </h2>
<p>Hello Employee, good to have you back. Please enter all the mentioned details below.... </p>

<div class="container">
  <form action="http://localhost:8686/ERSSystem/ReimbursementServlet" method="post">
    <div class="row">
      <div class="col-25">
        <label for="empid">Employee ID</label>
      </div>
      <div class="col-75">
        <input type="text" id="empid" name="empid" placeholder="Your ID..">
      </div>
    </div>
    <div class="row">
      <div class="col-25">
        <label for="empname">Employee Name</label>
      </div>
      <div class="col-75">
        <input type="text" id="empname" name="empname" placeholder="Please Enter your Name: ">
      </div>
    </div>
    <div class="row">
      <div class="col-25">
        <label for="reim_type">Type of Reimburment:</label>
      </div>
      <div class="col-75">
        <select id="reim_type" name="reim_type">
          <option value="Travel Expenses">Travel Expenses</option>
          <option value="Health Expenses">Health Expenses</option>
          <option value="Accomodation Expenses">Accomodation Expenses</option>
          <option value="Other Expenses">Other Expenses</option>
        </select>
      </div>
    </div>
    <div class="row">
      <div class="col-25">
        <label for="reim_ammount">Ammount you want to enter</label>
      </div>
      <div class="col-75">
        <input type="text" id="reim_ammount" name="reim_ammount" placeholder="Amount...">
      </div>
    </div>
    <div class="row">
      <div class="col-25">
        <label for="reim_dateofrequest">Date of request</label>
      </div>
      <div class="col-75">
        <input type="text" id="reim_dateofrequest" name="reim_dateofrequest" placeholder="Todays Date...">
      </div>
    </div>
    <div class="row">
      <div class="col-25">
        <label for="subject">Description of Reimbursment</label>
      </div>
      <div class="col-75">
        <textarea id="subject" name="subject" placeholder="Write something about your reimbursment type.." style="height:200px"></textarea>
      </div>
    </div>
    <div class="row">
      <input type="submit" value="Submit">
    </div>
  </form>
</div>

</body>
</html>