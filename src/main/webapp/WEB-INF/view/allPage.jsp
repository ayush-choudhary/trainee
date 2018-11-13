<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Trainees Details</h1>
<table border="2" align="center" >
<tr><td>TRAINEE ID</td><td>TRAINEE NAME</td><td>TRAINEE DOMAIN</td><td>TRAINEE LOCATION</td></tr>
		<c:forEach items="${key1}" var="tr">
        <tr>
            <td> <c:out value="${tr.traineeId}"/></td>
            <td><c:out value="${tr.traineeName}"/></td>
              <td><c:out value="${tr.traineeDomain}"/></td>
              <td><c:out value="${tr.traineeLocation}"/></td>    
        </tr>
    </c:forEach>
</table>
</body>
</html>