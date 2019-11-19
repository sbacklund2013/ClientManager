<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<h2>Log In</h2>

<form:form method="POST" modelAttribute="admin" action="authenticate">
	<table>
		<tr>
			<td><form:label path="username">Username:</form:label></td>
			<td><form:input path="username" /></td>
		</tr>
		
		<tr>
			<td><form:label path="password">Password:</form:label></td>
			<td><form:input path="password" type="password"/></td>
		</tr>
	</table>
	<input type="submit" value="Log In"></input>
</form:form>