<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
<link href="${contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${contextPath}/resources/css/common.css" rel="stylesheet">
<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="${contextPath}/"><spring:message code="back" /></a>
	<br>
	<span style="float: right"><a href="?lang=ru">ru</a> | <a
		href="?lang=ua">ua</a> | <a href="?lang=en">en</a> </span>
	<br>
	<div class="container">
		<p>
			<spring:message code="rules" />
		</p>
		<p>
			<spring:message code="rules.1" />
		</p>
		<p>
			<spring:message code="rules.2" />
		</p>
		<p>
			<spring:message code="rules.3" />
		</p>
		<p>
			<spring:message code="rules.4" />
		</p>
	</div>
</body>
</html>