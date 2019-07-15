<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
#customers {
	font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

#customers td, #customers th {
	border: 1px solid #ddd;
	padding: 8px;
}

#customers tr:nth-child(even) {
	background-color: #f2f2f2;
}

#customers tr:hover {
	background-color: #ddd;
}

#customers th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #4CAF50;
	color: white;
}

ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
	background-color: #333;
}

li {
	float: left;
}

li a {
	display: block;
	color: white;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
}

li a:hover:not (.active ) {
	background-color: #111;
}

.active {
	background-color: #4CAF50;
}
</style>
<meta charset="UTF-8">
<title></title>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
	<ul>
		<li><a href="#home">Home</a></li>
		 <li><a href="#" class="active">Passbook</a></li>
		<li><a href="transactionCall">Transactions</a></li>
		<li><a href="logout">Logout</a></li>
	</ul>
	<br>
	<br>
	<br>
	<div align="center">

		<div align="center">
			<button type="button" class="btn btn-danger">
				Passbook <span class="badge"></span>
				<div>

					<table id="customers">
						<tr>
							<th>Date</th>
							<th>Type</th>
							<th>Amount</th>
						</tr>
						<s:iterator status="stat" value="customer">
							<tr>
								<td><s:property value="date" /></td>
								<td><s:property value="type" /></td>
								<td><s:property value="amount" /></td>

							</tr>
						</s:iterator>
					</table>
				</div>
			</div>
</body>
</html>