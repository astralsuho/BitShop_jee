<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
#wrapper{
	width: 100%;
	height: 100%;
	border: 3px solid gray;
}
#wrapper tr{
	border: 1px solid gray;
}
#wrapper tr td{
	border: 1px solid gray;
}
</style>
</head>
<body>
<table id="wrapper">
	<tr>
		<td colspan="2">
			<h1>비트 쇼핑몰</h1>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<ul id="navi-bar">
				<li>홈</li>
				<li><a href="member.do">회원관리</a></li>
				<li><a href="account.do">계좌관리</a></li>
				<li><a href="article.do">게시판</a></li>
				<li><a href="admin.do">관리자</a></li>
			</ul>
		</td>
	</tr>
	<tr  style="height: 300px">
		<td></td>
		<td></td>
	</tr>
</table>
</body>
</html>