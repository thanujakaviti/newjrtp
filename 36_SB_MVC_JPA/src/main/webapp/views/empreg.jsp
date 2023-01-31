<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor='yellow'>
	<form:form action="/saveEmployee" method="post"    modelAttribute="employee">
		<table border='6'>
			<tr>
				<th>EMPLOYEE REGISTRATION FORM</th>
			</tr>
			<tr>
				<td>EMPLOYEE ID: </td>
				<td><form:input path="eid" /> </td>
			</tr>
			<tr>
				<td>EMPLOYEE NAME: </td>
				<td><form:input path="ename" /> </td>
			</tr>
			<tr>
				<td>EMPLOYEE AGE: </td>
				<td><form:input path="eage" /> </td>
			</tr>
			<tr>
				<td>EMPLOYEE SALARY: </td>
				<td><form:input path="esal" /> </td>
			</tr>
			<tr>
				<td><input type="submit" value="REGISTER" /> </td>
			</tr>
		
		</table>
	
	
	</form:form>
</body>
</html>