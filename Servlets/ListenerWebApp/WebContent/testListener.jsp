<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
 
    System.out.println("Adding attribute to Session...");
    request.getSession().setAttribute("test", "test");
    System.out.println("Adding attribute to Session completed!");
         
    System.out.println("Removing Session...");
    request.getSession().invalidate();
    System.out.println("Removing Session completed!");      
         
    out.println("Successfully adding and removing attributes from Session");    
%>
</body>
</html>