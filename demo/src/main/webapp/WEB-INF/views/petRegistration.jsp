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


	<form:form method="post" modelAttribute="pet">
		<form:errors path="*" element="div" />
		<fieldset>
			<legend>New Pet:</legend>

			<div>
				<label for="name">Login</label>
				<form:input id="name" path="name" type="text" />
				<form:errors path="username" />
			</div>

			<div>
				<label for="petType">Type</label>
				<form:input id="petType" path="petType" items="${petType}" />
				<form:errors path="petType" />
			</div>


			<input type="submit" value="Done" />


		</fieldset>

	</form:form>
</body>
</html>