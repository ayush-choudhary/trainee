<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body >
	<f:form method="post" action="display" modelAttribute="adm" >
	<table align="center">
	<tr><td>Username</td>
	
	<td><f:input type="text" path="username" /></td>
	<f:errors path = "username"/></tr>
	
	<tr><td>Password</td>
	<td><f:input type="password" path="password"/></td>
	<f:errors path = "password"/></tr>
	<tr><td><input type="submit" value="Login"/></td></tr>
	</table>

</f:form>
	
</body>
</html>