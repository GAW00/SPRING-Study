<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	</head>
	<body>
		<form method="post" action="login_yn">
			<center>
				<table border="1" align="center">
					<tr height="30">
						<td with="100" align="center">사용자 ID</td>
						<td with="100">
							<input type="text" name="mem_uid">
						</td>
					</tr>
					<tr height="30">
						<td with="100" align="center">비밀번호</td>
						<td with="100">
							<input type="password" name="mem_pwd">
						</td>
					</tr>
					<tr>
						<td colspan="2" align="center">
							<input type="submit" value="로 그 인">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<!-- 							controller 의 'register' 찾아감 -->
							<a href="register">회원가입</a>
						</td>
					</tr>
				</table>
			</center>
		</form>
	</body>
</html>