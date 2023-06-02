<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	</head>
	<body>
<!-- 		파일 전송하기 위한 enctype -->
		<form method="post" action="uploadFormAction" enctype="multipart/form-data">
			<input type="file" name="uploadFile">
			<button>Submit</button>
		</form>
	</body>
</html>