<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.net.HttpURLConnection"%>
<%@page import="java.net.URL"%>
<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<script type="text/javascript" src="https://static.nid.naver.com/js/naverLogin_implicit-1.0.3.js" charset="utf-8"></script>
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
	</head>
	<body>
		<h1>login ok!</h1>
		<!-- 네이버 로그인 버튼 노출 영역 -->
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
<!-- <!-- 		//네이버아디디로로그인 초기화 Script --> -->
		
		
<!-- <!-- 		네이버아디디로로그인 Callback페이지 처리 Script --> -->
<!-- <!-- 		<script type="text/javascript"> --> -->
<!-- // 			// 네이버 사용자 프로필 조회 이후 프로필 정보를 처리할 callback function -->
<!-- // 			function naverSignInCallback() { -->
<!-- // 				// naver_id_login.getProfileData('프로필항목명'); -->
<!-- // 				// 프로필 항목은 개발가이드를 참고하시기 바랍니다. -->
<!-- // 				alert(naver_id_login.getProfileData('email')); -->
<!-- // 				alert(naver_id_login.getProfileData('nickname')); -->
<!-- // 				alert(naver_id_login.getProfileData('age')); -->
<!-- // 			} -->
		
		
<!-- // 			// 네이버 사용자 프로필 조회 -->
<!-- // 			naver_id_login.get_naver_userprofile("naverSignInCallback()"); -->
<!-- 		</script> -->
		<!-- //네이버아디디로로그인 Callback페이지 처리 Script -->
<%-- <%-- <% --%> --%>
<!-- //     String clientId = "tNUijpCv6Urpc1B3on2G";//애플리케이션 클라이언트 아이디값"; -->
<!-- //     String clientSecret = "GV98Xrwi8z";//애플리케이션 클라이언트 시크릿값"; -->
<!-- //     String code = request.getParameter("code"); -->
<!-- //     String state = request.getParameter("state"); -->
<!-- //     String redirectURI = URLEncoder.encode("http://localhost:8181/spring_test_member_std/login_ok.jsp", "UTF-8"); -->
<!-- //     String apiURL; -->
<!-- //     apiURL = "https://nid.naver.com/oauth2.0/token?grant_type=authorization_code&"; -->
<!-- //     apiURL += "client_id=" + clientId; -->
<!-- //     apiURL += "&client_secret=" + clientSecret; -->
<!-- //     apiURL += "&redirect_uri=" + redirectURI; -->
<!-- //     apiURL += "&code=" + code; -->
<!-- //     apiURL += "&state=" + state; -->
<!-- //     String access_token = ""; -->
<!-- //     String refresh_token = ""; -->
<!-- //     System.out.println("apiURL="+apiURL); -->
<!-- //     try { -->
<!-- //       URL url = new URL(apiURL); -->
<!-- //       HttpURLConnection con = (HttpURLConnection)url.openConnection(); -->
<!-- //       con.setRequestMethod("GET"); -->
<!-- //       int responseCode = con.getResponseCode(); -->
<!-- //       BufferedReader br; -->
<!-- //       System.out.print("responseCode="+responseCode); -->
<!-- //       if(responseCode==200) { // 정상 호출 -->
<!-- //         br = new BufferedReader(new InputStreamReader(con.getInputStream())); -->
<!-- //       } else {  // 에러 발생 -->
<!-- //         br = new BufferedReader(new InputStreamReader(con.getErrorStream())); -->
<!-- //       } -->
<!-- //       String inputLine; -->
<!-- //       StringBuffer res = new StringBuffer(); -->
<!-- //       while ((inputLine = br.readLine()) != null) { -->
<!-- //         res.append(inputLine); -->
<!-- //       } -->
<!-- //       br.close(); -->
<!-- //       if(responseCode==200) { -->
<!-- //         out.println(res.toString()); -->
<!-- //       } -->
<!-- //     } catch (Exception e) { -->
<!-- //       System.out.println(e); -->
<!-- //     } -->
<%-- <%--   %> --%> --%>
	</body>
</html>