<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	</head>
	<body>
		<table border="1" align="center">
			<form method="post" action="login_yn"> <!-- login_yn 도 컨트롤러에서 만들어야 함 -->
				<tr height="30">
					<td width="100">
						사용자ID
					</td>
					<td width="100">
						<input type="text" name="mem_uid">
					</td>
				</tr>
				<tr height="30">
					<td width="100">
						비밀번호
					</td>
					<td width="100">
						<input type="password" name="mem_pwd">
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="로그인">
					</td>
				</tr>
			</form>
		</table>
	</body>
</html>

<!-- String mId = request.getParameter("mem_uid"); input의 name이 mem_uid와 일치해야 함-->
<!-- String mPw = request.getParameter("mem_pwd"); -->