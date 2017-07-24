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
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${contextPath}/resources/css/common.css" rel="stylesheet">
<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<a href="${contextPath}/"><spring:message code="back" /></a>
	<br>
	<span style="float: right"><a href="?lang=ru">ru</a> | <a
		href="?lang=ua">ua</a> | <a href="?lang=en">en</a> </span>
	<br>
	<p>
		<spring:message code="label.registration" />
	</p>
	<br>
	<br>
	<h3 align="center">
		<spring:message code="test.list" />
	</h3>
	<c:if test="${!empty listTests}">
		<table class="table table-striped">
			<thead>
				<tr>
					<th width="25"><spring:message code="test.id" /></th>
					<th width="80"><spring:message code="test.name" /></th>
					<th width="80"><spring:message code="test.author" /></th>
					<th width="120"><spring:message code="test.description" /></th>
					<th width="60"><spring:message code="test.free" /></th>
					<th width="120"><spring:message code="test.comment.to.admin" /></th>
					<th width="120"><spring:message code="test.section" /></th>
					<th width="120"><spring:message code="test.status" /></th>
					<th width="60"><spring:message code="test.review" /></th>
					<th width="60"><spring:message code="test.delete" /></th>
				</tr>
			</thead>
			<c:forEach items="${listTests}" var="test">
				<tr>
					<td>${test.id}</td>
					<td>${test.name}</td>
					<td>${test.tAuthor}</td>
					<td>${test.description}</td>
					<td>${test.free}</td>
					<td>${test.commentToAdmin}</td>
					<td>${test.section}</td>
					<td>${test.status}</td>
					<td><a href="<c:url value='/tests/review/${test.id}' />"><spring:message
								code="test.review" /></a></td>
					<td><a href="<c:url value='/tests/remove/${test.id}' />"><spring:message
								code="test.delete" /></a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>

</body>
</html>