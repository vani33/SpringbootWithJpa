<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="2">

		<c:forEach var="listEmp" items="${listOfEmployees}">
			<tr>
				<td><c:out value="${listEmp.id}"></c:out></td>
				<td><c:out value="${listEmp.name}"></c:out></td>
				<td><c:out value="${listEmp.city}"></c:out></td>
				<td><c:out value="${listEmp.phone}"></c:out></td>
				<td><a href="editEmployee?id=${listEmp.id}">Edit</a>
				<td><a href="deleteEmployee?id=${listEmp.id}">Delete</a>
			</tr>
		</c:forEach>

	</table>
</body>
</html>