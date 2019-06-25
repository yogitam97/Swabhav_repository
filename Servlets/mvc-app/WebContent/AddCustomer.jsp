<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	String firstName, lastName, dob;

	String balance;

	firstName = request.getParameter("firstName");
	lastName = request.getParameter("lastName");
	dob = request.getParameter("dob");
	balance = request.getParameter("balance");
	String rad = request.getParameter("myRadio");
	if (firstName == null && lastName == null && dob == null) {
		firstName = "";
		lastName = "";
		dob = "";
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add customer</title>
</head>
<body>
	<form action="AddCustomer" method="POST">
		First Name:<input type="text" name="firstName" value="<%=firstName%>"><br>
		Last Name:<input type="text" name="lastName" value="<%=lastName%>"><br>
	
		Date of birth:<input type="text" name="dob" value="<%=dob%>"><br>
		Balance:<input type="number" name="balance" value="<%=balance%>"><br>
		Card type:<input type="radio" value="<%=rad%>" name="myRadio">DEBIT
		<input type="radio" value="<%=rad%>" name="myRadio">CREDIT<br>

		<button type="submit">Add</button>

	</form>
</body>
</html>