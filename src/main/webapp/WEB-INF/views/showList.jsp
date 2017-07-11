<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
	#divProjectList{ width:1200px; margin: 0 auto; }
</style>

</head>
<body>
<a href="insert">[새 프로젝트 등록]</a>
	<div id="#divProjectList">
		<c:if test="${projectInfoList.size() == 0}">
			등록된 글이 없습니다.
		</c:if>
		<c:if test="${projectInfoList.size() > 0}">
			<table border="1">
				<tr>
					<td>프로젝트 이름	</td>
					<td>시작 날짜		</td>
					<td>종료 날짜		</td>
					<td>상태			</td>
				</tr>
				<c:forEach var="item" items="${projectInfoList}">
				<tr>
					<td><a href="listOne?pNo=${item.projectNo}"> ${item.projectName} </a></td>
					<td>${item.getProjectBeginDateToString() }</td>
					<td>${item.getProjectEndDateToString()   }</td>
					<td>${item.projectProgress  }</td>
				</tr>
				</c:forEach>
			</table>
		</c:if>
	</div>
</body>
</html>