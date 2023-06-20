<%@page import="java.math.BigInteger"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="java.security.SecureRandom"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<script type="text/javascript" src="https://static.nid.naver.com/js/naverLogin_implicit-1.0.3.js" charset="utf-8"></script>
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
<!-- 		<!-- 네이버 로그인 버튼 노출 영역 --> -->
<!-- 		<div id="naver_id_login"></div> -->
<!-- 		<!-- //네이버 로그인 버튼 노출 영역 --> -->
		
		
<!-- 		<!-- 네이버아디디로로그인 초기화 Script --> -->
<!-- 		<script type="text/javascript"> -->
<!-- // 			var naver_id_login = new naver_id_login("tNUijpCv6Urpc1B3on2G", "http://localhost:8181/spring_test_member_std/login_ok.jsp"); -->
<!-- // 			var state = naver_id_login.getUniqState(); -->
<!-- // 			naver_id_login.setButton("white", 2,40); -->
<!-- // 			naver_id_login.setDomain(".service.com"); -->
<!-- // 			naver_id_login.setState(state); -->
<!-- // 			naver_id_login.setPopup(); -->
<!-- // 			naver_id_login.init_naver_id_login(); -->
<!-- <!-- 		</script> --> -->
<!-- 		// 네이버 로그인 초기화 Script -->
		  <%
		    String clientId = "tNUijpCv6Urpc1B3on2G";//애플리케이션 클라이언트 아이디값";
		    String redirectURI = URLEncoder.encode("http://localhost:8181/spring_test_member_std/login_ok.jsp", "UTF-8");
		    SecureRandom random = new SecureRandom();
		    String state = new BigInteger(130, random).toString();
		    String apiURL = "https://nid.naver.com/oauth2.0/authorize?response_type=code";
		    apiURL += "&client_id=" + clientId;
		    apiURL += "&redirect_uri=" + redirectURI;
		    apiURL += "&state=" + state;
		    session.setAttribute("state", state);
		 %>
		<a href="<%= apiURL %>"><img height="50" src="http://static.nid.naver.com/oauth/small_g_in.PNG"/></a>
	</body>
</html>