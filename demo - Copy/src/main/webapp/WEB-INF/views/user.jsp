<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:th="https://www.thymeleaf.org"
	xmlns:sec="https://www.thymeleaf.org/thymeleaf-extras-springsecurity3">

<head>
<title>Examination</title>
</head>

<body>
	<div>
		<a href="/user/pet_registration">Register your pet</a> <br>
	</div>

	<div>
		<c:forEach items="${petList}" var="petList">
		<a href=" <spring:url value="/user/pet/?name=${petList.petName}" /> ">${petList.petName}</a>
		
		<br>

		</c:forEach>
	</div>



</body>
</html>