<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<title>Examination</title>
</head>

<body>

	<div class="container">
    <h1>Congrats!!! You did it!</h1>
    <form action="/auth/logout" method="POST">
        <button type="submit">Logout</button>
    </form>
</div>
	
</body>
</html>