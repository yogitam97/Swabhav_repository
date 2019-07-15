<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<style>
td.tdErrorMessage{
  background-color:#FF0000;
}

</style>
<meta charset="UTF-8">
<title>register</title>
</head>
<body>

<s:form action="register" method="post">
<s:actionerror/>
<s:textfield name="name" label="Name"/>
<s:password name="password" label="Password"/>
<s:password name="confirmPassword" label="Confirm Password"/>
<s:textfield name="balance" label="Balance"/>
<s:submit type="register"/>
</s:form> 

</body>
</html>