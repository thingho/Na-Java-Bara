<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>쿠키저장</title>
	</head>
	<body>
		<!--아이디를 쿠키에 저장하기 cId, cPw  -->
		<%
			String id = request.getParameter("id");
		 	String pw = request.getParameter("pw");
		 	
		 	if(!(id.equals("admin") && pw.equals("1234"))){
		 		response.sendRedirect("login_cookie.jsp?=idCheck=0");
		 	}
		 	//쿠키저장
		 	Cookie cId = new Cookie("cId",id);
		 	cId.setMaxAge(60*60); //60초*60분
		    response.addCookie(cId);
		   
		    Cookie cPw = new Cookie("cPw",pw);
		    cPw.setMaxAge(60*60); //60초*60분
		    response.addCookie(cPw);
		      
		 	
			out.println("id : "+id+"<br>");
			out.println("pw : "+id+"<pw>");
		
		%>
		<a href="login_confirm.jsp">쿠키확인</a>

	</body>
</html>