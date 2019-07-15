<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<style>

ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

li {
  float: left;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover:not(.active) {
  background-color: #111;
}

.active {
  background-color: #4CAF50;
}
</style>
  
  </style>
</head>
<body>
<ul>
  <li><a class="active" href="#home">Home</a></li>
   <li><a href="passbook">Passbook</a></li>
  <li><a href="transactionCall">Transactions</a></li>
  <li><a href="logout">Logout</a></li>
</ul>
<br>
<br>
<br>
<div align ="center">

<div class="card" style="max-width: 20rem;">
<div class="card-header">
Profile
</div>
<div class="card-body">
<h4 class="card-title">Name: &nbsp<s:property value="#session.User"/></h4>
<p class="card-text">Balance: &nbsp <s:property value="#session.balance"/> ₹</p>
</div>
</div>

</div>


</body>
</html>