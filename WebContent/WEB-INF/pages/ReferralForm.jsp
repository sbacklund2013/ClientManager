
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<body>
	<h1 class="text-center">NMTSA Refferal</h1>
	<p class="text-center">
		<br>In order to better understand your therapy and scheduling
		needs, please fill out the following information. Should you have
		further questions, please feel free to contact us at <a
			href="mailto:info@nmtsa.org">info@nmtsa.org</a>. <br> <br>
	</p>

	<div class="form-group" style="width: 60%">
		<form:form method="POST" modelAttribute="client" action="reg">
			<div class="form-row">
				<div class="col">
					<form:label style="font: 18px Roboto, sans-serif;" path="firstName">Client First Name:</form:label>
					<form:input class="form-control" path="firstName" />
					<form:errors path="firstName" />
				</div>
				<div class="col">
					<form:label style="font: 18px Roboto, sans-serif;" path="lastName">Client Last Name:</form:label>
					<form:input class="form-control" path="lastName" />
					<form:errors path="lastName" />
				</div>
			</div>
			<div class="form-row">
				<div class="col">
					<form:label style="font: 18px Roboto, sans-serif;" path="parent1">Parent 1 Full Name:</form:label>
					<form:input class="form-control" path="parent1" />
					<form:errors path="parent1" />
				</div>
				<div class="col">
					<form:label style="font: 18px Roboto, sans-serif;" path="parent2">Parent 2 Full Name:</form:label>
					<form:input class="form-control" path="parent2" />
					<form:errors path="parent2" />
				</div>
			</div>
			<div class="form-row">
				<div class="col">
					<form:label style="font: 18px Roboto, sans-serif;" path="birthDate">Birth Date:</form:label>
					<form:input class="form-control" path="birthDate" />
					<form:errors path="birthDate" />
				</div>
				<div class="col">
					<form:label style="font: 18px Roboto, sans-serif;"
						path="phoneNumber">Phone Number:</form:label>
					<form:input class="form-control" path="phoneNumber" />
					<form:errors path="phoneNumber" />
				</div>
			</div>
			<div class="form-row">
				<div class="col">

					<form:label style="font: 18px Roboto, sans-serif;" path="diagnosis">Diagnosis:</form:label>
					</br>
					<form:checkboxes class="checkbox" path="diagnosis"
						items="${diagnosisList}" />

				</div>
			</div>
			<div class="form-row">
				<div class="col">
					<form:label style="font: 18px Roboto, sans-serif;" path="email">Email Address:</form:label>
					<form:input class="form-control" path="email" />
					<form:errors path="email" />
				</div>
				<div class="col">
					<form:label style="font: 18px Roboto, sans-serif;" path="reason">Reason:</form:label>
					<form:input class="form-control" path="reason" />
					<form:errors path="reason" />
				</div>
			</div>
			<div class="form-row">
				<div class="col">
					<form:label style="font: 18px Roboto, sans-serif;" path="funding">Funding Source:</form:label>
					<form:input class="form-control" path="funding" />
					<form:errors path="funding" />
				</div>
				<div class="col">
					<form:label style="font: 18px Roboto, sans-serif;" path="address">Home Address:</form:label>
					<form:input class="form-control" path="address" />
					<form:errors path="address" />
				</div>
			</div>
			<div class="form-row">
				<div class="col">
					<form:label style="font: 18px Roboto, sans-serif;"
						path="availableDay">Days Available:</form:label>
					</br>
					<form:checkboxes class="checkbox" path="availableDay"
						items="${availableDay}" />
				</div>
			</div>
			
			<div class="form-row">
				<div class="col">

					<form:label style="font: 18px Roboto, sans-serif;"
						path="availableTime">Times Available:</form:label>
					</br>
					<form:checkboxes class="checkbox" path="availableTime"
						items="${availableTime}" />

				</div>
			</div>
			<div class="form-row">
				<div class="col">
					<form:label style="font: 18px Roboto, sans-serif;" path="notes">Additional Notes:</form:label>
					<form:textarea id="msg" path="notes" />
					<form:errors path="notes" />
				</div>
			</div>

			<input type="submit" class="btn btn-primary" value="Create Referral" />

		</form:form>
	</div>
</body>
