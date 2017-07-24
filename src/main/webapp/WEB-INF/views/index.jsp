<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${contextPath}/resources/css/common.css" rel="stylesheet">
<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>

	<div class="container">

		<c:if test="${pageContext.request.userPrincipal.name != null}">
			<form id="logoutForm" method="POST" action="${contextPath}/logout">
				<input type="hidden" name="${_csrf.parameterName}"
					value="${_csrf.token}" />
			</form>

			<h2>
				Welcome ${pageContext.request.userPrincipal.name} | <a
					onclick="document.forms['logoutForm'].submit()">Logout</a>
			</h2>

		</c:if>

	</div>
	<br>
	<span style="float: right"> <c:url var="formPerson"
			value="/personalOffice" /> <a href="${formPerson}"> personal
			account</a>
	</span>
	<br>
	<span style="float: right"> <c:url var="formRegistrationUrl"
			value="/registration" /> <a href="${formRegistrationUrl}">
			registration</a>
	</span>
	<br>
	<span style="float: right"> <c:url var="formRulesUrl"
			value="/rules" /> <a href="${formRulesUrl}"> <spring:message
				code="rules" /></a>
	</span>
	<br>

	<span style="float: right"><a href="?lang=ru">ru</a> | <a
		href="?lang=ua">ua</a> | <a href="?lang=en">en</a> </span>
	<p>
		<spring:message code="label.registration" />
	</p>


	<p>
		<spring:message code="label.login" />
	</p>
	<h1 align="center">
		<c:url var="formTestUrl" value="/tests/list" />
		<a href="${formTestUrl}">Test proposals</a>
	</h1>
	<h3 align="center">
		<c:url var="formLoginUrl" value="/login" />
		<a href="${formLoginUrl}">Test login</a>
	</h3>

	<h3 align="center">
		<c:url var="logout" value="/logout" />
		<a href="${logout}">Test logout</a>
	</h3>

	<h4 align="center">
		<c:url var="pass" value='/tests/previewTest/1' />
		<a href="${pass}">Start test</a>
	</h4>


	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>