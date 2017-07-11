<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	fieldset {width: 700px;}
	label {display: inline-block; width: 200px;}
	.pBtnSubmit {text-align: center;}
</style>
<link rel="stylesheet" type="text/css" href="/project_erp/resources/css/common.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="/project_erp/resources/js/common.js"></script>  
<script>
$(document).ready(function(){
	$("select > option").each(function(){
		if($(this).val()=='${projectInfo.projectProgress }'){
			$(this).attr("selected","selected");
		}
	});
});
</script>

<script type="text/javascript">
	$(function() {
		$("form[name='f1']").submit(function() {
			if (checkInputEmpty($("input[name]")) == false) {
				return false;
			}
		});
	});
</script>

</head>
<body>
	<form action="update" method="post" name="f1">
		<fieldset><legend>프로젝트 등록</legend>
		<input type="hidden" name="projectNo" value="${projectInfo.projectNo }">
		<p>
			<label>제목</label>
			<input type="text" name="projectName" value="${projectInfo.projectName }">
			<span class="errorMsg"> 제목을 입력하세요 </span> 
		</p>
		
		<p>
			<label>내용</label><textarea rows="15" cols="30" name="projectContent">${projectInfo.projectContent }</textarea>
			<span class="errorMsg"> 내용을 입력하세요 </span> 
		</p>

		<p>
			<label>시작 날짜</label>
			<input type="date" name="startDate" value="${projectInfo.getProjectBeginDateToString()}">
			<span class="errorMsg"> 시작 날짜를 입력하세요 </span> 
		</p>
		
		<p>
			<label>마감 날짜</label>
			<input type="date" name="endDate" value="${projectInfo.getProjectEndDateToString() }">
			<span class="errorMsg"> 마감 날짜를 입력하세요 </span> 
		</p>

		<p>
			<label>상태</label>
			<select name="projectProgress">
			    <option value="준비" selected="selected">준비</option>
			    <option value="진행중">진행중</option>
			    <option value="종료">종료</option>
			    <option value="보류">보류</option>
			</select>
			<span class="errorMsg"> 상태를 선택해 주세요</span> 
		</p>
				
		<p class="pBtnSubmit">
			<input type="submit" value="수정">
		</p>
		</fieldset>
	</form>
</body>
</html>