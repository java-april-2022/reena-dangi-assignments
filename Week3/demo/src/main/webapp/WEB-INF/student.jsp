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
<h1>Hello Java students!!!</h1>
<%-- <%=2+189 %>
 --%>
Name: <c:out value="${studentName}"></c:out>
<br>
City: <c:out value="${city}"></c:out>

<a href="/stacks">Stacks</a>

</body>
</html>