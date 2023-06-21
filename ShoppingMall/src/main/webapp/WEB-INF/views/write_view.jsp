<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
	.box{
            border: 1px solid black;
            border-collapse: collapse;
        }
</style>
<script src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
<script type="text/javascript">
	function fn_submit() {
// 		form 요소 자체
		var formData = $("#frm").serialize();
		
		$.ajax({
			type:"post"
			,data:formData
			,url:"write"
			,success: function(data) {
				alert("저장완료");
				location.href="list";
			}
			,error: function() {
				alert("오류발생")
			}
		});
	}
</script>
</head>
<body>
	<table width="500" border="1">
		<form method="post" action="write">
			<tr>
				<td>이름</td>
				<td>
					<input type="text" name="notiauth" size="50">
				</td>
			</tr>
			<tr>
				<td>제목</td>
				<td>
					<input type="text" name="notititle" size="50">
				</td>
			</tr>
			<tr>
				<td>내용</td>
				<td>
					<textarea rows="10" name="noticont"></textarea>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="입력">
				</td>
			</tr>
		</form>
	</table>
</body>
</html>