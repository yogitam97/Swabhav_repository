<html> 
<head>
<title>Output page: Fetching the value from session</title>
</head>
<body> 
<% 
Object value=session.getAttribute("count"); 
int old=(int)value;
out.print("The value of session was: "+old); 

Object applicationValue=application.getAttribute("count"); 
int oldVal=(int)applicationValue;
out.print("<br>The value of application was: "+oldVal); 
%> 
</body> 
</html>