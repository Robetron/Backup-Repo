<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ticket Booking</title>
</head>
<body>

	<br>
	<p>
		<b>Book Tickets Here</b>
	</p>
	<br>
	<br>
	<sf:form modelAttribute="booking" method="POST">
		Username:<sf:input path="username" />
		<br>
		<sf:errors path="username" cssStyle="color:red" />
		<br>
		Cinema Hall:<sf:input path="hallname" />
		<br>
		Number of Tickets:<sf:input path="numoftickets" />
		<br>
		<sf:errors path="numoftickets" cssStyle="color:red" />
		<br>
		Movie ID:<sf:input path="id" value="${id}" />
		<br>
		Movie Name:<sf:input path="moviename" value="${moviename}" />
		<br>
		Movie City:<sf:input path="city" value="${city}" />
		<br>
		<input type="submit" value="Book">
	</sf:form>

</body>
</html>