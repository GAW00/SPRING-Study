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
		<tr>
			<td>상품번호</td>
			<td>카테고리 코드</td>
			<td>상품 이름</td>
			<td>상품 가격</td>
			<td>상품 정보</td>
		</tr>
		<c:forEach items="${list}" var="dto">
			<tr>
				<td>${dto.procode}</td>
				<td>${dto.catecode}</td>
<%-- 				<td>${dto.btitle}</td> --%>
				<td>
					<a href="content_view?procode=${dto.procode}">${dto.proname}</a>
				</td>
				<td>${dto.proprice}</td>
				<td>${dto.proinfo}</td>
			</tr>
		</c:forEach>
	</table>
	</body>
</html>