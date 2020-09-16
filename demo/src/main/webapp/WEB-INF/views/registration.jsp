<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">


<title>Registration</title>
</head>

<body>


	<form:form method="post" modelAttribute="user">
		<form:errors path="*" element="div" />
		<fieldset>
			<legend>New User:</legend>

			<div>
				<label for="username">Login</label>
				<form:input id="username" path="username" type="text" />
				<form:errors path="username" />
			</div>

			<div>
				<label for="email">Email</label>
				<form:input id="email" path="email" type="text" />
				<form:errors path="email" />
			</div>

			<div>
				<label for="password">Password</label>
				<form:input id="password" path="password" type="text" />
				<form:errors path="password" />
			</div>

			<input type="submit" value="Done" />


		</fieldset>

	</form:form>
</body>
</html>