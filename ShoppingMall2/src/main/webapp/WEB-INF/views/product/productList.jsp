<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.box{
            border: 1px solid black;
            border-collapse: collapse;
        }
</style>
</head>
<body>
  <h1>제품관리</h1>
	<table class="box" width="500" border="1">
		<tr>
			<td width="50" align="center">번호</td>
			<td width="90" align="center">제품코드</td>
			<td width="150" align="center">제품명</td>
			<td width="90" align="center">이미지</td>
			<td width="90" align="center">가격</td>
			<td width="90" align="center">카테고리</td>
			<td width="90" align="center">수량</td>
			<td width="90" align="center">등록일</td>
			<td width="90" align="center">삭제</td>
		</tr>
		<c:forEach items="${productlist}" var="dto">
			<tr>
				<td>${dto.noticode}</td>
				<td>
<!-- 				content_view : 컨트롤러단 호출 -->
					<a href="content_view?noticode=${dto.noticode}">${dto.notititle}</a>
				</td>
				<td>${dto.notiauth}</td>
				<td>${dto.notidate}</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="5">
				<a href="write_view">글작성</a>
			</td>
		</tr>
	</table>
</body>
</html>