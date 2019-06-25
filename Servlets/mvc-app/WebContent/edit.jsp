<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page import="com.techlabs.model.Customer" %>
<%
	Customer cust=(Customer)request.getAttribute("customerOBJ");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Customer Details</title>
</head>
<body>
	<form action="EditCustomer" method="POST">
		First Name:<input type="text" name="firstName" value="<%=cust.getFirstName()%>"><br>
		Last Name:<input type="text" name="lastName" value="<%=cust.getLastName()%>"><br>
		Id:<input type="text" name="id" value="<%=cust.getId()%>"><br>
		Date of birth:<input type="text" name="dob" value="<%=cust.getDob()%>"><br>
		Balance:<input type="number" name="balance" value="<%=cust.getBalance()%>"><br>
		Card type:<input type="radio" value="<%=cust.getCard()%>" name="myRadio">DEBIT
		<input type="radio" value="<%=cust.getCard().toString()%>" name="myRadio">CREDIT<br>

		<button type="submit">Edit</button>

	</form>
</body>
</html>