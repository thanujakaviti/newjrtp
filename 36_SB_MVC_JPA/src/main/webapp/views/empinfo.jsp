<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor='orange'>
	<h1>EMPLOYEE  DETAILS</h1></HR>
	<h2>${emp}</h2>
	<h3>EMPLOYEE ID: ${employee.getEid() }</h3>
	<h3>EMPLOYEE NAME: ${employee.getEname() }</h3>
	<h3>EMPLOYEE AGE: ${employee.getEage() }</h3>
	<h3>EMPLOYEE SALARY: ${employee.getEsal() }</h3>
	<a href='./curdoperations'>HOME</a><br/>
</body>
</html>