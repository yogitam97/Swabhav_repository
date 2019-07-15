<%@ page import="java.util.*" %>
<%@ page import="com.techlabs.model.Customer" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
<title>Insert title here</title>
</head>
<body>
<%
List<Customer> list=(List)request.getAttribute("customers");
out.println("<center><h3>Customers</h3></center>");
out.println("<table class='table table-striped table-dark'>");
out.println("<tr><th>ID</th><th>Name</th><th>Balance</th><th>DOB</th><th>Edit</th><th>Delete</th></tr>");
for(Customer cust:list){
	out.println("<tr>");
	out.println("<td>"+cust.getId());
	out.println("<td>"+cust.getFirstName()+" "+cust.getLastName());
	out.println("<td>"+cust.getBalance());
	out.println("<td>"+cust.getDob());
	out.println("<td><a href='EditCustomer?Id="+cust.getId()+"' id='edit_id'"+cust.getId()+">Edit</a></td>");
	out.println("<td><a href='DeleteController?Id="+cust.getId()+"' id='del_id'"+cust.getId()+">Delete</a></td>");
}
out.println("</table>");
out.println("<center><a class='btn btn-info' href='LogoutController' role='button'>Logout</a></center><br>");
for(Customer cust:list){
	out.println("<center><div class='card bg-dark text-white' style='width:400px;height:190px'>");
	out.println(" <div class='card-body'>");
	out.println("<h4 class='card-title'>"+cust.getFirstName().toUpperCase()+" " +cust.getLastName().toUpperCase()+"</h4>");
	out.println("<p class='card-text'>Balance :"+cust.getBalance()+"<br>DOB :"+cust.getDob()+"</p>");
	out.println("<a class='btn btn-success ' href='EditCustomer?Id="+cust.getId()+"' id='edit_id'"+cust.getId()+">Edit</a>");
	out.println("<a class='btn btn-danger ' href='DeleteController?Id="+cust.getId()+"' id='del_id'"+cust.getId()+">Delete</a></center>");
}

%>
</body>
</html>