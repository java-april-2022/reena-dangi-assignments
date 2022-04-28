<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
	<h1>Edit Art</h1>
	<form:form action="/update/${editArt.id}" method="put" modelAttribute="editArt">
		<p>
			<form:label path="title">Title</form:label>
			<form:input path="title" />
			<form:errors class="text-danger" path="title" />
		</p>
		<p>
			<form:label path="description">Description</form:label>
			<form:textarea path="description" />
			<form:errors class="text-danger" path="description" />
		</p>
		<p>
			<form:label path="url">url</form:label>
			<form:textarea path="url" />
			<form:errors class="text-danger" path="url" />
		</p>
		<button>Update Art</button>

	</form:form>


</body>
</html>