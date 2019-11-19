<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>NMTSA</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<spring:url value="/resources/css/main.css" var="mainCss" />
	<spring:url value="/resources/js/main.js" var="mainJs" />
	
	<spring:url value="/resources/bootstrap/css/bootstrap.css" var="bootstrapCss"/>
	<spring:url value="/resources/bootstrap/js/bootstrap.js" var="bootstrapJs" />
	
	 
	<link href="${bootstrapCss}" rel="stylesheet" />
	<script src="${bootstrapJs}"></script>
</head>

<body>

	<tiles:insertAttribute name="header" />

	<div align="center">
		<tiles:insertAttribute name="body" />
	</div>

	<tiles:insertAttribute name="footer" />
</body>

</html>