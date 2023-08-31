<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>쿠키확인</title>
	</head>
	<body>
		<!--모든 쿠키확인 -->
		<%
			Cookie[] cookies = request.getCookies();
			if(cookies != null){
				for(int i=0;i<cookies.length;i++){
					out.println("name : "+cookies[i].getName()+"<br>");
					out.println("value : "+cookies[i].getValue()+"<br>");
				}
			}
		%>

	
	</body>
</html>