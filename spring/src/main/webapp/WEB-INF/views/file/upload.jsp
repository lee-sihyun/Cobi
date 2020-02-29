<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring</title>
</head>
<body>
	<h1>파일 업로드</h1>
	<hr>
	<%-- 파일 입력을 위한 form 태그는 method 속성값을 반드시 "POST"로  
	설정하며 enctype 속성값을 "multipart/form-data"로 설정 --%>
	<form method="post" enctype="multipart/form-data">
	<table>
		<tr>
			<td>업로더</td>
			<td><input type="text" name="uploader"></td>
		</tr>
		<tr>
			<td>업로드 파일</td>
			<td><input type="file" name="uploadFile"></td>
		</tr>
		<tr>
			<td colspan="2"><button type="submit">업로드</button>
		</tr>
	</table>	
	</form>
</body>
</html>






