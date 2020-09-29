<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>

<head>
<title>Examination</title>
</head>

<body>

	<form:form method="post" modelAttribute="cost">
		<form:errors path="*" element="div" />
		<fieldset>
			<legend>New Cost</legend>

			<div>
				<label>Food</label>
				<form:input id="food" path="food" type="text" />
				<form:errors path="food" />
			</div>
			<div>
				<label>Health care</label>
				<form:input id="healthCare" path="healthCare" type="text" />
				<form:errors path="healthCare" />
			</div>
			<div>
				<label>Equipment</label>
				<form:input id="equipment" path="equipment" type="text" />
				<form:errors path="equipment" />
			</div>
			<div>
				<label>Toys</label>
				<form:input id="toys" path="toys" type="text" />
				<form:errors path="toys" />
			</div>
			<div>
				<label>Other</label>
				<form:input id="other" path="other" type="text" />
				<form:errors path="other" />
			</div>

			<input type="submit" value="Done" />


		</fieldset>

	</form:form>

	<div>
		<c:forEach items="${costList}" var="costList">
		<p> ${costList.getDate()}</p>
		<p> ${costList.getTotal()}</p>
		
		

		</c:forEach>
	</div>

</body>
</html>