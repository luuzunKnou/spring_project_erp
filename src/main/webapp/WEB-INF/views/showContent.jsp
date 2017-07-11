<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
	#divProjectContent { width:802px; margin: 0 auto; }
	.attr {width:200px;}
	.val {width:600px;}
	#pButton {text-align: center;}
</style>

</head>
<body>
	<div id="divProjectContent">
		<table border="1">
			<tr>
				<td class="attr">프로젝트 이름		</td>
				<td class="val">${projectInfo.projectName }	</td>
			</tr>
			
			<tr>
				<td class="attr">프로젝트 내용</td>
				<td class="val">${projectInfo.projectContent }</td>
			</tr>
			
			<tr>
				<td class="attr">시작 날짜</td>
				<td class="val">${projectInfo.getProjectBeginDateToString() }</td>
			</tr>
			
			<tr>
				<td class="attr">종료 날짜</td>
				<td class="val">${projectInfo.getProjectEndDateToString() }</td>
			</tr>
			
			<tr>
				<td class="attr">상태</td>
				<td class="val">${projectInfo.projectProgress }</td>
			</tr>
		</table>
		<p id="pButton">
		<a href="update?pNo=${projectInfo.projectNo}">[수정]</a>
		<a href="delete?pNo=${projectInfo.projectNo}">[삭제]</a>
		<a href="listAll">[돌아가기]</a>
		</p>
	</div>
</body>
</html>