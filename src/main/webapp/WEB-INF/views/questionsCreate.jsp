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
				<td><spring:message code="test.name" /></td>
				<td><form:input readonly="true" path="name" disabled="true" /></td>
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
				<td><spring:message code="test.comment.to.admin" /></td>
				<td><form:input readonly="true" path="commentToAdmin"
						disabled="true" /></td>
			</tr>
			<tr>
				<td><spring:message code="test.section" /></td>
				<td><form:input readonly="true" path="section" disabled="true" /></td>
			</tr>
		</table>
	</form:form>

	<h3>Questions List</h3>

	<c:url var="createQuestion" value="/createQuestions" />

	<form:form modelAttribute="questionForm" action="${createQuestion}"
		method="POST">
		<table>
			<tr>
				<td><spring:message code="question.text" /></td>
				<td><form:input path="text" /></td>
			</tr>
			<tr>
				<td><spring:message code="question.text" /></td>
				<td><form:hidden path="qTest.id" value="${testId}" /></td>
			</tr>
			<tr>
				<td colspan="2"><input class="btn btn-success" type="submit"
					value="<spring:message code="question.add"/>" />
			</tr>
		</table>
	</form:form>

	<c:forEach items="${questionList}" var="questions">
		<table class="table table-striped">
			<tr>
				<td>${questions.text}</td>
			</tr>
		</table>
	</c:forEach>
</body>
</html>