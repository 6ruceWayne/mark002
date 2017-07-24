<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="${contextPath}/resources/css/bootstrap.min.css">
<script src="${contextPath}/resources/js/jquery-3.2.1.min.js"></script>
<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<span style="float: right"> <c:url var="formPerson"
			value="/personalOffice" /> <a href="${formPerson}"> personal
			account</a>
	</span>
	<br>
	<span style="float: right"><a href="?lang=ru">ru</a> | <a
		href="?lang=ua">ua</a> | <a href="?lang=en">en</a> </span>
	<br>
	<form:form modelAttribute="testForm" method="POST">
		<table>
			<tr>
				<td><spring:message code="test.author" /></td>
				<td><form:input path="name" disabled="true"
						value="${pageContext.request.userPrincipal.name}" /></td>
			</tr>

			<tr>
				<td><spring:message code="test.name" /></td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td><spring:message code="test.free" /></td>
				<td><form:input type="text" path="free" /></td>
			</tr>
			<tr>
				<td><spring:message code="test.description" /></td>
				<td><form:input type="text" path="description" /></td>
			</tr>
			<tr>
				<td><spring:message code="test.comment.to.admin" /></td>
				<td><form:input type="text" path="commentToAdmin" /></td>
			</tr>
			<tr>
				<td><spring:message code="test.section" /></td>
				<td><form:input type="text" path="section" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit"
					value="<spring:message text="test.save"/>" />
			</tr>
		</table>
	</form:form>
</body>
</html>