<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error</title>
</head>
<body>
  <p>
  <%
  String value=(String)request.getAttribute("errMsg");
  out.println("<p style='color:red'>Error occured!!<br>"+value);
  %>
          
        </p>
</body>
</html>