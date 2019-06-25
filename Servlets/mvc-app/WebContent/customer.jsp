<%@ page import="java.util.*" %>
<%@ page import="com.techlabs.model.Customer" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
List<Customer> list=(List)request.getAttribute("customers");
out.println("<table>");
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
out.println("<a href='LogoutController'>Logout</a>");
%>

</body>
</html>