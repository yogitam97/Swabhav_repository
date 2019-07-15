<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>

<style>
.errorMessage{
color:red;
list-style-type:none;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:form action="validate" method="post">
<s:actionerror />
Username:<s:textfield  name="username" lable="Username"/>

Password:<s:password  name="password" lable="Password"/>

<s:submit type="validate"/>
</s:form>
</body>
</html>