<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to Register page</h1>
	<form:form action="employees" method="post" modelAttribute="employee">
		<label>Employee ID</label>
		<form:input type="text" name="eid" id="eid" path="eid" placeholder="employe id.."/>
		<label>Employee Name</label>
		<form:input type="text" name="ename" id="ename" path="ename" placeholder="employe name.."/>
		<label>Employee Email</label>
		<form:input type="email" name="email" id="email" path="email" placeholder="employe email.."/>
		<label>Employee City</label>
		<form:input type="text" name="city" id="city" path="city" placeholder="employe city.."/>
		<button type="submit">Register</button>
	</form:form>
</body>
</html>