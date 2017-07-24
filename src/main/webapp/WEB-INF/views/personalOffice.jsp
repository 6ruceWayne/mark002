<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
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
	<a href="${contextPath}/"><spring:message code="back" /></a>
	<br>
	<span style="float: right"><a href="?lang=ru">ru</a> | <a
		href="?lang=ua">ua</a> | <a href="?lang=en">en</a> </span>
	<br>
	<div class="btn-group">
		<button type="button" class="btn btn-primary">My results</button>
		<button type="button" class="btn btn-primary">My tests</button>
	</div>
	<c:if test="${!empty listTests}">
		<table class="table table-striped">
			<thead>
				<tr>
					<th width="25"><spring:message code="test.id" /></th>
					<th width="80"><spring:message code="test.name" /></th>
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
					<td>${test.description}</td>
					<td>${test.free}</td>
					<td>${test.commentToAdmin}</td>
					<td>${test.section}</td>
					<td>${test.status}</td>
					<td><a href="<c:url value='/changeTest/${test.id}' />"><spring:message
								code="test.review" /></a></td>
					<td><a href="<c:url value='/deleteTest/${test.id}' />"><spring:message
								code="test.delete" /></a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
	<c:url var="create" value="/createTest" />
	<a href="${create}" class="btn btn-success" role="button"><spring:message
			code="test.new" /></a>
</body>
</html>