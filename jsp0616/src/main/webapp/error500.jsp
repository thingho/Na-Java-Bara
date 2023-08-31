<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<% response.setStatus(200);%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>error500</title>
		<style>
			*{margin:0; padding:0;}
			div{width:266px; height:189px; padding:30px; margin:50px auto; border:1px solid #efefef;}
			img{width:300px; }
		</style>
	</head>
	<body>
		<div onclikc="javascript:history.back();">
			<a href="main.jsp"><img src="images/error500.jpg"></a>
		</div>
	</body>
</html>