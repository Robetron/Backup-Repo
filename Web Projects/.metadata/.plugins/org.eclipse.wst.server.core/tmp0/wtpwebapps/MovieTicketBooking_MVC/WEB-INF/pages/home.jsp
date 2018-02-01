<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Movie Ticket Booking</title>
</head>
<body>
	<p style="align=center;"><b>Welcome to Movie Ticket Booking System</b></p> <br>
	<br>
	<sf:form modelAttribute="movie" method="POST">
		City:<sf:input path="city"/>
	<input type="submit" value="Search">
	</sf:form>
</body>
</html>