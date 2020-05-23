<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>STUDENT REGISTRATION</title>
<link href="css/main.css" rel="stylesheet">
</head>
<body>
	<form:form method="POST" modelAttribute="student" action="save">
		<table>
			<tr>
				<td><label for="rollnumber">ROLL NUMBER</label></td>
				<td><form:input type="text" path="rollnumber" id="rollnumber" />
					<form:errors path="rollnumber" style="color:red;"/></td>
			</tr>
			<tr>
				<td><label for="name">NAME</label></td>
				<td><form:input type="text" path="name" id="name" /> <form:errors
						path="name" style="color:red;"/></td>
			</tr>
			<tr>
				<td><label for="branch">BRANCH</label></td>
				<td><form:input type="text" path="branch" id="branch" /> 
				<form:errors path="branch" style="color:red;"/></td>
			</tr>
			<tr>
				<td><label for="semester">SEMESTER</label></td>
				<td><form:input type="text" path="semester" id="semester" /> <form:errors
						path="semester" style="color:red;"/></td>
			</tr>

			<tr>
				<td><label for="email">@EMAIL</label></td>
				<td><form:input type="text" path="email" id="email" /> <form:errors
						path="email" style="color:red;"/></td>
			</tr>

			<tr>
				<td><label for="contect">CONTECT DETAIL</label></td>
				<td><form:input type="text" path="contect" id="contect" /> <form:errors
						path="contect" style="color:red;"/></td>
			</tr>


			<tr>
				<td colspan="3"><input type="submit" value="submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>