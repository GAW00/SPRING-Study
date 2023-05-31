<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	</head>
	<body>
<!-- 	action="student" => 컨트롤러단에서 @RequestMapping 의 student 를 찾아감 -->
<!-- 	찾아가지 못하면 아래 오류 발생 -->
<!-- 	WARN : org.springframework.web.servlet.PageNotFound -  -->
<!-- 	No mapping found for HTTP request with URI [/spring_14_1_1/student]  -->
<!-- 	in DispatcherServlet with name 'appServlet' -->
<!-- 		<form method="get" action="student"> -->
		<form method="post" action="student">
			student id : <input type="text" name="id"><br>
			<input type="submit" value="전송">
		</form>
	</body>
</html>