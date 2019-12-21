<%@ page contentType = "text/html;charset=UTF-8" language = "java" %>
<%@ taglib prefix = "c" uri ="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<script type="text/javascript">
	function getClients()
	{
		$.ajax(
		{
			type:"POST",
			url:"/ClientManager/clientAPI/getAll",
			dataType:"json",
			success: function(data)
			{
				$("#clients").dataTable({
					"responsive": true,
					"searching": true,
					"info": false,
					"data" : data,
					"columns" : [{"data":"timeStamp"},
								 {"data":"firstName"},
								 {"data":"lastName"},
								 {"data":"birthDate"},
								 {"data":"phoneNumber"},
								 {"data":"diagnosis"},
								 {"data":"parent1"},
								 {"data":"parent2"},
								 {"data":"email"},
								 {"data":"address"},
								 {"data":"reason"},
								 {"data":"funding"},
								 {"data":"availableDay"},
								 {"data":"availableTime"},
								 {"data":"notes"}
								]
				});
			},
			error: function(xhr,ajaxOptions,thrownError)
			{
				alert(xhr.status);
				alert(thrownError);
			}
		})
	}
	
	$(document).ready(getClients);
</script>

<h2>All Patients</h2>

<form:form method="POST" modelAttribute="query" action="genSearch">
	<form:input path="notes" placeholder="Enter a Query"/>
	<input class="btn btn-secondary" type="submit" value="Search"/>
</form:form>

<form:form method="POST" modelAttribute="query" action="available">
	<form:input path="notes" placeholder="Enter a Time"/>
	<input class="btn btn-secondary" type="submit" value="Search"/>
</form:form>

<div class="table-responsive">
	<table id="clients" class="table table-striped" width="75%" border="1" align="center">
	<thead class="thead-dark">
		<tr>
			<th >Time Applied</th>
			<th >First Name</th>
			<th >Last Name</th>
			<th >Birthday</th>
			<th >Phone Number</th>
			<th >Diagnosis</th>
			<th >Parent A</th>
			<th >Parent B</th>
			<th >Email</th>
			<th >Address</th>
			<th >Reason</th>
			<th >Funding</th>
			<th >Day Available</th>
			<th >Time Available</th>
			<th >Notes</th>
		</tr>
	</thead>
	
	<tbody>
	</tbody>
	
	</table>
</div>

