<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>

<s:form action="loginForm" method="post">
<s:actionerror/>
<s:textfield name="model.username" label="UserName"/>
<s:password name="model.password" label="Password"/>
<s:submit type="loginForm"/>
</s:form> 

</body>
</html>