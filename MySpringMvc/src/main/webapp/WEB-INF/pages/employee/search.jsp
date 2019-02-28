<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Login</title>
</head>
<body>
<%@include file="../partials/header.html" %>
	<form action="searchBy" method="post">
		SearchBy
		<select name="searchEmployeeBy">
		  <option value="FIRST_NAME">First Name</option>
		  <option value="LAST_NAME">Last Name</option>
		  <option value="EMAIL">Email</option>
		  <option value="CONTACT">Phone Number</option>
		  
		</select>
		<input  name="EmployeeInfo" placeholder="Enter selected Employee Info" type="text"/>
		<input type="submit" value="submit"/>
	</form>
</body>
</html>