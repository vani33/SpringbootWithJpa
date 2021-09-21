<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<form:form method="post" action="saveEmployee" modelAttribute="employee">
	<h1>Add New Employee</h1>
	<table>




		<tr>
			<form:hidden path="id"></form:hidden>
			<td>Name :</td>
			<td><form:input path="name" id="name" /></td>
			<form:errors path="name" cssClass="error" />
			<br>
			<br>
		</tr>

		<tr>
			<td>City :</td>
			<td><form:input path="city" id="city" /></td>
			<form:errors path="city" cssClass="error" />
			<br>
			<br>
		</tr>
		<tr>
			<td>Phone :</td>
			<td><form:input path="phone" id="phone" value="" /></td>
			<form:errors path="phone" cssClass="error" />
			<br>
			<br>

		</tr>
		<tr>
			<td><br /></td>
			<td><input type="submit" value="Save" /></td>
		</tr>
	</table>

</form:form>
