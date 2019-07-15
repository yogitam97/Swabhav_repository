
    <%@ page import="java.util.*" %>
    <%@page import="com.techlabs.model.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
List<Employee> emps=(List)request.getAttribute("Employees");
out.println("<table>");
out.println("<tr><th>ID</th><th>Name</th><th>Job</th><th>ManagerId</th><th>Date</th><th>Salary</th><th>Commision</th><th>Dept no</th></tr>");
for(Employee e:emps){
	out.println("<tr>");
	out.println("<td>"+e.getEmployeeID());
	out.println("<td>"+e.getEmployeeName());
	out.println("<td>"+e.getDesignation());
	out.println("<td>"+e.getManagerID());
	out.println("<td>"+e.getDateOfJoining());
	out.println("<td>"+e.getSalary());
	out.println("<td>"+e.getCommision());
	out.println("<td>"+e.getDept_no()+"</td></tr>");
}
out.println("</table>");


%>
</body>
</html>