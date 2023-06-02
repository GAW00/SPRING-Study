<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function(){
// 			확장자가 exe|sh|js 인 파일 업로드 금지하기 위한 정규식
			var regex = new RegExp("(.*?)\.(exe|sh|js)$");
			var maxSize = 5242880; // 5MB
			
			function checkExtension(fileName, fileSize){
				if(fileSize > maxSize){
					alert("파일 사이즈 초과");
					return false;
				}
				if(regex.test(fileName)){
					alert("해당 종류의 파일은 업로드할 수 없습니다.");
					return false;
				}
				return true;
			}
			
			$("#uploadBtn").on("click",function(){
				var formData = new FormData();
				
				var inputFile = $("input[name='uploadFile']");
// 				files : 파일 정보
				var files = inputFile[0].files;
				console.log(files);
				
				for(var i = 0; i < files.length; i++){
// 					파일 크기와 종류 중 거짓있으면 리턴
					if(!checkExtension(files[i].name, files[i].size)){
						return;
					}
					
// 					파일 정보를 formData에 추가
					formData.append("uploadFile", files[i]);
				}
				
				$.ajax({
// 					컨트롤러단 호출
					url:"uploadAjaxAction",
// 					processData : 기본은 key/value 를 Query String 으로 전송하는게 true
// 					(파일 업로드는 false)
					processData:false,
// 					contentType : 기본값 = "application / x-222-form-urlencoded; charset = UTF-8"
// 					첨부파일은 false : multipart/form-data로 전송됨
					contentType:false,	
					data:formData,
					type:"POST",
					success:function(result){
						alert("Uploaded")
						console.log(result);
					}
				});
			});
		});
	</script>
	</head>
	<body>
		<h1>Upload with Jquery</h1>
		<div class="uploadDiv">
			<input type="file" name="uploadFile" multiple>
		</div>
		<button id="uploadBtn">Upload</button>
	</body>
</html>