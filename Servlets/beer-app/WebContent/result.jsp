<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Beer Recommendations JSP</title>
</head>
<body>
<%
List styles=(List)request.getAttribute("styles");
Iterator it=styles.iterator();
while(it.hasNext()){
	out.print("<br>try :"+it.next());
}
%>
</body>
</html>