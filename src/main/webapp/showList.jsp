<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Faculty</th>
		</tr>
		<c:forEach var="student" items="${students}">
			<tr>
				<td style="text-align: center"><c:out value="${student.id}" />
				</td>
				<td style="text-align: center"><c:out value="${student.name}" />
				</td>
				<td style="text-align: center"><c:out
						value="${student.faculty}" /></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>