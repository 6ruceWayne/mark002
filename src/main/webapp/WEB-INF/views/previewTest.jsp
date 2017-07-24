<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	<form:form modelAttribute="ourTest" action="/testPassing/${ourTest.id}"
		method="POST">
		<table>
			<tr>
				<td><spring:message code="test.name" /></td>
				<td><form:input readonly="true" path="name" disabled="true" /></td>
			</tr>
			<tr>
				<td><spring:message code="test.author" /></td>
				<td><form:input readonly="true" path="tAuthor" disabled="true" /></td>
			</tr>
			<tr>
				<td><spring:message code="test.free" /></td>
				<td><form:input readonly="true" path="free" disabled="true" /></td>
			</tr>
			<tr>
				<td><spring:message code="test.description" /></td>
				<td><form:input readonly="true" path="description"
						disabled="true" /></td>
			</tr>
			<tr>
				<td><spring:message code="test.section" /></td>
				<td><form:input readonly="true" path="section" disabled="true" /></td>
			</tr>
			<tr>
				<td colspan="2"><input class="btn btn-success" type="submit"
					value="<spring:message code="test.start"/>" />
			</tr>
		</table>
	</form:form>
</body>
</html>