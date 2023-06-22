<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width="500" border="1">
		<form method="post" action="noticeModify">
			<input type="hidden" name=noticode value="${content_view.noticode}">
			<tr> 
				<td>번호</td>
				<td>${content_view.noticode}</td>
			</tr>
			<tr> 
				<td>이름</td>
<%-- 				<td>${content_view.bname}</td> --%>
				<td> 
					<input type="text" name="notiauth" value="${content_view.notiauth}">
				</td>
			</tr>
			<tr> 
				<td>제목</td>
<%-- 				<td>${content_view.btitle}</td> --%>
				<td>
					<input type="text" name="notititle" value="${content_view.notititle}">	
				</td>
			</tr>
			<tr> 
				<td>내용</td>
<%-- 				<td>${content_view.bcontent}</td> --%>
				<td>
					<input type="text" name="noticont" value="${content_view.noticont}">
				</td>
			</tr>
			<tr> 
				<td colspan="2"> 
					<input type="submit" value="수정">
					&nbsp;&nbsp;<a href="list">목록보기</a>
					&nbsp;&nbsp;<a href="noticeDelete?noticode=${content_view.noticode}">삭제</a>
				</td>
			</tr>
		</form>
	</table>
</body>
</html>