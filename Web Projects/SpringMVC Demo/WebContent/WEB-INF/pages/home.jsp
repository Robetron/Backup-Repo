<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
	<h1>${message}</h1>
	<a href="http://localhost:8080/SpringMVC_Demo/Vishal?param_dept=IT">Vishal</a>
	<br>
	<a href="http://localhost:8080/SpringMVC_Demo/Lerisa?param_dept=IBM">Lerisa</a>
	<br>
	<a href="http://localhost:8080/SpringMVC_Demo/Yvens">Yvens</a>
	<br>

	<br>
	<br>
	<b>Employee Registration Form</b>
	<sf:form modelAttribute="employee" method="POST">
		ID: <sf:input path="id" /><sf:errors path="id"/>
		<br> 
		Name: <sf:input path="name" /><sf:errors path="name"/>
		<br> 
		Email:  <sf:input path="email" /><sf:errors path="email"/>
		<br>
		<input type="submit" value="Register">
	</sf:form>
	${list}
	<br>
	<br>
	<c:forEach items="${list}" var="e">
		${e.id}  -  ${e.name}  -  ${e.email}  <br>
	</c:forEach>
</body>
</html>