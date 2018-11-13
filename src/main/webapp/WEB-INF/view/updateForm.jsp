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
	<f:form method="get" action="postupdate" modelAttribute="t" align="center"> 
	
	Trainee Id:
	<f:input type="number" path="traineeId" value="${key1}"/>
	<br>
	Trainee Name:
	<f:input type="text" path="traineeName" value="${key2}"/>
	<br>
	Location:
	<f:radiobutton name="location" value="chennai" path="traineeLocation" label="Chennai"></f:radiobutton>
	<f:radiobutton name="location" value="banglore" path="traineeLocation" label="Banglore"></f:radiobutton>
	<f:radiobutton name="location" value="mumbai" path="traineeLocation" label="Mumbai"></f:radiobutton>
	<f:radiobutton name="location" value="pune" path="traineeLocation" label="Pune"></f:radiobutton>
	<br>
	<f:select name="domain" path="traineeDomain"  value="${key4}">
    <f:option value="jee">JEE</f:option>
    <f:option value="sap">SAP</f:option>
    <f:option value="bi">Business Intelligence</f:option>
    
 	 </f:select>
	
	<input type="submit" value="Update a Trainee"/>
</f:form>
		
</body>
</html>