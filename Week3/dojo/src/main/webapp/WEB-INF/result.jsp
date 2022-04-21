<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Student Info:</h1>

<p>
Name: <c:out value="${firstName}"></c:out>
</p>
<p>
Email:<c:out value="${email}"></c:out>
</p>
<p>
Program: <c:out value="${program}"></c:out>
</p>

</body>
</html>