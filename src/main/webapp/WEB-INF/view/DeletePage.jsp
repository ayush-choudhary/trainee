<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h1 align="center">Delete Operation</h1>
		<f:form method="post" action="deleteInfo" modelAttribute="t" align="center">
		Please Enter the Trainee ID:
				<f:input type="number" path="traineeId"/>
				<input type="submit" value="Delete"/>
		</f:form>
		
		
		<h3 align="center">${key}</h3>
		
</body>
</html>