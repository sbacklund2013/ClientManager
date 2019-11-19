<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<body>
	<h1 class="text-center">Current Client Availability</h1>
	<p class="text-center"><br>Choose a day of the week and time of day.<br><br></p>
	<p class="weekDays-selector">
	
	<form:form method="POST" modelAttribute="client" action="doReg">
		<div>
			<table>
				<tr> 
			  		<td>
			  			<form:checkbox path="availableDay" value="Mon" id="weekday-mon" class="weekday"/>Monday
			  			<form:checkbox path="availableDay" value="Tues" id="weekday-mon" class="weekday"/>Tuesday
			  			<form:checkbox path="availableDay" value="Wed" id="weekday-mon" class="weekday"/>Wednesday	
			  			<form:checkbox path="availableDay" value="Thur" id="weekday-mon" class="weekday"/>Thursday
			  			<form:checkbox path="availableDay" value="Fri" id="weekday-mon" class="weekday"/>Friday
			  			<br/><br/>
			  		</td>
			  	</tr>
			  	<tr>
			  		<td>Available Times</td>
			  	</tr>
			  	<tr>
			  		<td><form:checkbox path="availableTime" value="8:30-9:00" id="weekday-mon" class="weekday"/>8:30-9:00</td>
			  		
			  	</tr>
			  	<tr>
			  		<td><form:checkbox path="availableDay" value="9:00-9:30" id="weekday-mon" class="weekday"/>9:00-9:30</td>
			  		
			  	</tr>
			  	<tr>
			  		<td><form:checkbox path="availableDay" value="9:30-10:00" id="weekday-mon" class="weekday"/>9:30-10:00</td>
			  		
			  	</tr>
			  	<tr>
			  		<td><form:checkbox path="availableDay" value="10:00-10:30" id="weekday-mon" class="weekday"/>10:00-10:30</td>
			  		
			  	</tr>
			  	<tr>
			  		<td><form:checkbox path="availableDay" value="10:30-11:00" id="weekday-mon" class="weekday"/>10:30-11:00</td>
			  		
			  	</tr>
			  	<tr>
			  		<td><form:checkbox path="availableDay" value="11:00-11:30" id="weekday-mon" class="weekday"/>11:00-11:30</td>
			  		
			  	</tr>
			  	<tr>
			
			  		<td><form:checkbox path="availableDay" value="11:30-12:00" id="weekday-mon" class="weekday"/>11:30-12:00</td>
			  		
			  	</tr>
			  	<tr>
			  		<td><form:checkbox path="availableDay" value="12:00-12:30" id="weekday-mon" class="weekday"/>12:00-12:30</td>
			  		
			  	</tr>
			  	  	<tr>
			  		<td><form:checkbox path="availableDay" value="12:30-1:00" id="weekday-mon" class="weekday"/>12:30-1:00</td>
			  		
			  	</tr>
			  	  	<tr>
			  		<td><form:checkbox path="availableDay" value="1:00-1:30" id="weekday-mon" class="weekday"/>1:00-1:30</td>
			  		
			  	</tr>
			  	  	<tr>
			  		<td><form:checkbox path="availableDay" value="1:30-2:00" id="weekday-mon" class="weekday"/>1:30-2:00</td>
			  		
			  	</tr>
			  	  	<tr>
			  		<td><form:checkbox path="availableDay" value="2:00-2:30" id="weekday-mon" class="weekday"/>2:00-2:30</td>
			  		
			  	</tr>
			  	  	<tr>
			  		<td><form:checkbox path="availableDay" value="2:30-3:00" id="weekday-mon" class="weekday"/>2:30-3:00</td>
			  		
			  	</tr>
			  	  	<tr>
			  		<td><form:checkbox path="availableDay" value="3:00-3:30" id="weekday-mon" class="weekday"/>3:00-3:30</td>
			  		
			  	</tr>
			  	  	<tr>
			  		<td><form:checkbox path="availableDay" value="3:30-4:00" id="weekday-mon" class="weekday"/>3:30-4:00</td>
			  		
			  	</tr>
			  	  	<tr>
			  		<td><form:checkbox path="availableDay" value="4:00-4:30" id="weekday-mon" class="weekday"/>4:00-4:30</td>
			  		
			  	</tr>
			  	<tr>
			  		<td><form:checkbox path="availableDay" value="4:30-5:00" id="weekday-mon" class="weekday"/>4:30-5:00</td>
			  		
			  	</tr>
			  	<tr>
			  		<td><form:checkbox path="availableDay" value="5:00-5:30" id="weekday-mon" class="weekday"/>5:00-5:30</td>
			  		
			  	</tr>
			  	<tr>
			  		<td><form:checkbox path="availableDay" value="5:30-6:00" id="weekday-mon" class="weekday"/>5:30-6:00</td>
			  	</tr>
			</table>
			<input type="submit" value="Search"/>
		</div>
	</form:form>
</body>
