<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	<table class="box" width="500" border="1">
		<tr>
			<td width="70" align="center">No</td>
			<td width="650" align="center">Subject</td>
			<td width="90" align="center">Writer</td>
			<td width="50" align="center">Date</td>
		</tr>
		<c:forEach items="${list}" var="dto">
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