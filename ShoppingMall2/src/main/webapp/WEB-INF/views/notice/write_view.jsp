<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
	.box{
            border: hidden;
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
	<h3 align="center">Notice</h3>
	<table class="box" width="500" border="1" align="center">
		<form method="post" action="write">
			<tr  align="left">
				<td>제목</td>
			</tr>
			<tr>
				<td>
					<input type="text" name="notititle" size="95">
				</td>
			</tr>
			<tr align="left">
				<td>내용</td>
			</tr>
			<tr>
				<td>
					<textarea  cols="100" rows="20" name="noticont"></textarea>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="right">
					<input type="submit" value="Write">
				</td>
			</tr>
		</form>
	</table>
</body>
</html>