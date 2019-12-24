<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<body>
<h2>Log In</h2>
<div style="width:80%">
<form:form method="POST" modelAttribute="admin" action="authenticate" class="form-horizontal">
			<div class="form-group">
			<form:label class="control-label col-xs-2" path="username">Username:</form:label>
			 <div class="col-xs-9">
			<form:input path="username" class="form-control"/> 
			</div>
			</div>
			<div class="form-group">
			<form:label class="control-label col-xs-2" path="password">Password:</form:label>
			 <div class="col-xs-9">
			<form:input path="password" class="form-control" type="password"/>
			</div>
			</div>
	<input type="submit" value="Log In" class="btn-dark"></input>
</form:form>
</div>

</body>