<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ page session="false" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spittr</title>
<link rel="stylesheet" type="text/css"
href="<c:url value="/resources/style.css" />" >
</head>
<body>
<h1>Register</h1>



<sf:form method="POST" commandName="spitter">
First Name: <sf:input type="text" path="firstName" />
<sf:errors path="firstName" /><br/>
Last Name: <sf:input type="text" path="lastName" />
<sf:errors path="lastName" /><br/>
User name: <sf:input type="text" path="username" />
<sf:errors path="username" /><br/>
Email: <sf:input path="email" />
<sf:errors path="email" /><br/>
Password: <sf:input type="password" path="password" />
<sf:errors path="password" /><br/>
<input type="submit" value="Register" />
</sf:form>

</body>
</html>