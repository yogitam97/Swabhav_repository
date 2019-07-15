<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" >
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div align="center">
<button class="btn btn-danger">
Number of contacts <span class="badge"><s:property
				value="sizeOfList" /></span>
</button>
<button type="button" class="btn btn-default"><a href="add">
	  Add to Contact</a>
	</button>
</div><br>
<table class="table table-striped">
<tr>
<th>ID</th>
<th>Name</th>
<th>Number</th>
<th>Address</th>
<th>Email</th>
<th>Edit</th>
<th>Delete</th>
</tr>
<s:iterator status="stat" value="contact">
<tr>
<td><s:property value="id"/></td>
<td><s:property value="name"/></td>
<td><s:property value="number"/></td>
<td><s:property value="address"/></td>
<td><s:property value="email"/></td>
<td><s:a href="edit?id=%{id}"><span class="btn btn-success glyphicon glyphicon-pencil"></s:a></span></td>
<td><s:a href="delete?id=%{id}"><span class="btn btn-danger glyphicon glyphicon-trash"></s:a></span></td>
</tr>
</s:iterator>

</table>
</body>
</html>