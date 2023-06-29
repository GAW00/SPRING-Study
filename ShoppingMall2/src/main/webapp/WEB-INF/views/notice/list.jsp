<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
   table {
   margin: 5px auto;
   border: 1px solid rgb(207, 207, 207);
   width: auto;
   border-collapse: collapse;
   margin-top: 30px;
}

</style>
</head>
<body align="center">
	<h1 align="center">NOTICE 관리</h1>
		<a href="write_view"><input type="button" value="공지사항 작성"></a>
		
	<table width="500" border="1" align="center">
		<tr>
			<td width="50" align="center">No</td>
			<td width="530" align="center">Subject</td>
			<td width="70" align="center">Writer</td>
			<td width="110" align="center">Date</td>
		</tr>
		<c:forEach items="${list}" var="dto">
			<tr>
				<td align="center">${dto.noticode}</td>
				<td>
<!-- 				content_view : 컨트롤러단 호출 -->
					<a href="content_view?noticode=${dto.noticode}">${dto.notititle}</a>
				</td>
<%-- 				<td>${dto.notiauth}</td> --%>
				<td align="center">admin</td>
				<td align="center">${dto.notidate}</td>
			</tr>
		</c:forEach>
<!-- 		<tr> -->
<!-- 			<td colspan="5"> -->
<!-- 				<a href="write_view">글작성</a> -->
<!-- 			</td> -->
<!-- 		</tr> -->
	</table>
</body>
</html>