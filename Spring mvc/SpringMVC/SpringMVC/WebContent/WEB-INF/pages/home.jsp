<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="sf"  uri="http://www.springframework.org/tags/form"%>
<%@ taglib  prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <h1><em>Hi How are you Sruthi?? :-)</em></h1> <br>
      ${message }<br>
      
      <a href="http://localhost:8080/SpringMVC/Sruthi?dept=abc">Sruthi</a>
            <a href="http://localhost:8080/SpringMVC/Madhushree?dept=pgt"">Madhushree</a>
                  <a href="http://localhost:8080/SpringMVC/Namrata">Namrata</a>
   <br>
   <br>
   <b>Employee registeration form</b>
   <sf:form modelAttribute="employee" method="POST">
             ID:<sf:input path="id"/><sf:errors path="id"/><br>
             Name:<sf:input path="name"/><sf:errors path="name"/><br>
             Email:<sf:input path="email"/><sf:errors path="email"/><br>
             <input type="submit" value="Register"> 
   </sf:form>
   
   
<!--    <${list}>
 -->   
   Employee registered<br>
   
    <c:forEach items="${list }" var="e">
   ${e.id }~ ${e.name }~ ${e.email }<br>
   </c:forEach>
</body>
</html>