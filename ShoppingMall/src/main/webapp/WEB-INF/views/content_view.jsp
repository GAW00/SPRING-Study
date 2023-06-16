<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width="500" border="1">
		<form method="post" action="modify">
			<input type="hidden" name="bid" value="${content_view.bid}">
			<tr>
				<td>제품 번호</td>
				<td>${content_view.procode}</td>
			</tr>
			<tr>
				<td>카테고리 코드</td>
				<td>
					<c:if test="'${content_view.catecode} == 1">
						의자
					</c:if>
					<c:if test="'${content_view.catecode} == 2">
						침대
					</c:if>
					<c:if test="'${content_view.catecode} == 3">
						테이블/책상
					</c:if>
					<c:if test="'${content_view.catecode} == 4">
						소파
					</c:if>
						미등록
				</td>
			</tr>
			<tr>
				<td>이름</td>
<%-- 				<td>${content_view.bname}</td> --%>
				<td>
					<input type="text" name="bname" value="${content_view.bname}">
				</td>
			</tr>
			<tr>
				<td>제목</td>
<%-- 				<td>${content_view.btitle}</td> --%>
				<td>
					<input type="text" name="btitle" value="${content_view.btitle}">
				</td>
			</tr>
			<tr>
				<td>내용</td>
<%-- 				<td>${content_view.bcontent}</td> --%>
				<td>
					<input type="text" name="bcontent" value="${content_view.bcontent}">
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="수정">
					&nbsp;&nbsp;<a href="list">목록보기</a>
					&nbsp;&nbsp;<a href="delete?bid=${content_view.bid}">삭제</a>
				</td>
			</tr>
		</form>
	</table>
</body>
</html>












