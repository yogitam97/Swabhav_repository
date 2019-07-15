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
int length=emps.size();
out.print("<h3>Count is:"+length);
%>
</body>
</html>