<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<br>
	<br>
	<form action="addStudent">
		<table>
			<tr>
				<td></td>
				<td align="center"><b>Save Student:</b></td>
			<tr>
				<td align="left">ID:</td>
				<td align="left"><input type="text" name="id" /></td>
			</tr>
			<tr>
				<td align="left">Name:</td>
				<td align="left"><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td align="left">Faculty:</td>
				<td align="left"><input type="text" name="faculty" /></td>
			</tr>
			<tr>
				<td></td>
				<td align="center"><input type="submit"></td>
			</tr>
		</table>
	</form>
	<br>

	<form action="getStudent">
		<b>Find student:</b> <br> 
		<input type="text" name="id"><br>
		<input type="submit">
	</form>
	<br>

	<form action="deleteStudent">
		<b>Delete Student:</b><br> 
		<input type="text" name="id"><br>
		<input type="submit">
	</form>
	<br>
	
	<form action="findByFaculty">
		<b>Find By Faculty:</b><br> 
		<input type="text" name="faculty"><br>
		<input type="submit">
	</form>
	
	<form action="findByIdGreaterThan">
		<b>Find By ID Greater Than:</b><br> 
		<input type="text" name="id"><br>
		<input type="submit">
	</form>


</body>
</html>
