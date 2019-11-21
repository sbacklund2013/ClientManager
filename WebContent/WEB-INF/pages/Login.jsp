<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<body style="background:black;">
<div style="background-color:black; width: 50%; padding:10px; margins:auto; height:40%;">
<h2 style="color:white;">Log In</h2>
<form:form method="POST" modelAttribute="admin" action="authenticate">
	
			<form:label style="color:white; padding:15px; font-size:25px;" path="username">Username:</form:label>
			<form:input path="username" /> </br>
		
			<form:label style="color:white; padding:15px;font-size:25px;" path="password">Password:</form:label>
			<form:input path="password" type="password"/> </br>
	<input type="submit" value="Log In"></input>
</form:form>
</div>
</body>