<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
<link rel="stylesheet" type="text/css" href="/css/styles.css">
<title>Insert title here</title>
</head>
<body>
	<h2>This is going to GitHub using STS!!</h2>
	<h1>Dojo Form</h1>
	<form action="/results" method="POST">
		<div>
			<p>
				Name: <input type="text" name="firstName" class="form-control">
			</p>
			<p>
				Email: <input type="text" name="email" class="form-control">
			</p>
			<p>
				Program: <select name="program">
					<option value="java">Java</option>
					<option value="MERN">MERN</option>
					<option value="Azure">Azure</option>
				</select>
			</p>
			<p>
				<button>Submit</button>
			</p>
		</div>
	</form>
	<img alt="" src="/images/gray.jpg">
</body>
</html>