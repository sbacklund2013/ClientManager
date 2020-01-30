<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<body>
	<h1 class="text-center">Current Client Availability</h1>
	<p class="text-center"><br>Choose a day of the week and time of day.<br><br></p>
	<p class="weekDays-selector">
	
	<form:form method="POST" modelAttribute="client" action="available">
		<div>
			<table>
				<tr> 
			  		<td>
			  			<form:checkbox path="availableDay" value="Mon" class="weekday"/>Monday
			  			<form:checkbox path="availableDay" value="Tues" class="weekday"/>Tuesday
			  			<form:checkbox path="availableDay" value="Wed" class="weekday"/>Wednesday	
			  			<form:checkbox path="availableDay" value="Thur" class="weekday"/>Thursday
			  			<form:checkbox path="availableDay" value="Fri" class="weekday"/>Friday
			  			<br/><br/>
			  		</td>
			  	</tr>
			  	<tr>
			  		<td>Available Times</td>
			  	</tr>
			  	<tr>
			  		<td><form:checkbox path="availableTime" value="8:30-9:00" class="weekday"/>8:30-9:00</td>
			  		
			  	</tr>
			  	<tr>
			  		<td><form:checkbox path="availableDay" value="9:00-9:30" class="weekday"/>9:00-9:30</td>
			  		
			  	</tr>
			  	<tr>
			  		<td><form:checkbox path="availableDay" value="9:30-10:00" class="weekday"/>9:30-10:00</td>
			  		
			  	</tr>
			  	<tr>
			  		<td><form:checkbox path="availableDay" value="10:00-10:30" class="weekday"/>10:00-10:30</td>
			  		
			  	</tr>
			  	<tr>
			  		<td><form:checkbox path="availableDay" value="10:30-11:00" class="weekday"/>10:30-11:00</td>
			  		
			  	</tr>
			  	<tr>
			  		<td><form:checkbox path="availableDay" value="11:00-11:30" class="weekday"/>11:00-11:30</td>
			  		
			  	</tr>
			  	<tr>
			
			  		<td><form:checkbox path="availableDay" value="11:30-12:00" class="weekday"/>11:30-12:00</td>
			  		
			  	</tr>
			  	<tr>
			  		<td><form:checkbox path="availableDay" value="12:00-12:30" class="weekday"/>12:00-12:30</td>
			  		
			  	</tr>
			  	  	<tr>
			  		<td><form:checkbox path="availableDay" value="12:30-1:00" class="weekday"/>12:30-1:00</td>
			  		
			  	</tr>
			  	  	<tr>
			  		<td><form:checkbox path="availableDay" value="1:00-1:30" class="weekday"/>1:00-1:30</td>
			  		
			  	</tr>
			  	  	<tr>
			  		<td><form:checkbox path="availableDay" value="1:30-2:00" class="weekday"/>1:30-2:00</td>
			  		
			  	</tr>
			  	  	<tr>
			  		<td><form:checkbox path="availableDay" value="2:00-2:30" class="weekday"/>2:00-2:30</td>
			  		
			  	</tr>
			  	  	<tr>
			  		<td><form:checkbox path="availableDay" value="2:30-3:00" class="weekday"/>2:30-3:00</td>
			  		
			  	</tr>
			  	  	<tr>
			  		<td><form:checkbox path="availableDay" value="3:00-3:30" class="weekday"/>3:00-3:30</td>
			  		
			  	</tr>
			  	  	<tr>
			  		<td><form:checkbox path="availableDay" value="3:30-4:00" class="weekday"/>3:30-4:00</td>
			  		
			  	</tr>
			  	  	<tr>
			  		<td><form:checkbox path="availableDay" value="4:00-4:30" class="weekday"/>4:00-4:30</td>
			  		
			  	</tr>
			  	<tr>
			  		<td><form:checkbox path="availableDay" value="4:30-5:00" class="weekday"/>4:30-5:00</td>
			  		
			  	</tr>
			  	<tr>
			  		<td><form:checkbox path="availableDay" value="5:00-5:30" class="weekday"/>5:00-5:30</td>
			  		
			  	</tr>
			  	<tr>
			  		<td><form:checkbox path="availableDay" value="5:30-6:00" class="weekday"/>5:30-6:00</td>
			  	</tr>
			</table>
			<input type="submit" value="Search"/>
		</div>
	</form:form>
</body>
