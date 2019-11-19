<%@ page contentType = "text/html;charset=UTF-8" language = "java" %>
<%@ taglib prefix = "c" uri ="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<h2>All Patients</h2>

<form:form method="POST" modelAttribute="query" action="genSearch">
	<form:input path="notes" placeholder="Enter a Query"/>
	<input class="btn btn-secondary" type="submit" value="Search"/>
</form:form>

<form:form method="POST" modelAttribute="query" action="available">
	<form:input path="notes" placeholder="Enter a Time"/>
	<input class="btn btn-secondary" type="submit" value="Search"/>
</form:form>

<table class="table table-striped table-bordered table-hover table-sm table-dark">
	<tr>
		<th>Time Applied</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Birthday</th>
		<th>Phone Number</th>
		<th>Diagnosis</th>
		<th>Parent A</th>
		<th>Parent B</th>
		<th>Email</th>
		<th>Address</th>
		<th>Reason</th>
		<th>Funding</th>
		<th>Day Available</th>
		<th>Time Available</th>
		<th>Notes</th>
	</tr>
	
	<c:forEach var="clients" items="${clients}">
		<tr>
			<td>${clients.timeStamp}</td>
			<td>${clients.firstName}</td>
			<td>${clients.lastName}</td>
			<td>${clients.birthDate}</td>
			<td>${clients.phoneNumber}</td>
			<td>${clients.diagnosis}</td>
			<td>${clients.parent1}</td>
			<td>${clients.parent2}</td>
			<td>${clients.email}</td>
			<td>${clients.address}</td>
			<td>${clients.reason}</td>
			<td>${clients.funding}</td>
			<td>${clients.availableDay}</td>
			<td>${clients.availableTime}</td>
			<td>${clients.notes}</td>
		</tr>
	</c:forEach>
</table>