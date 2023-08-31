<%@page import="com.java.www.Member"%>
<%@page import="com.java.www.MemberDao"%>
<%-- <%@page import="com.java.www.dao.MemberDao"%> --%>
<%-- <%@page import="com.java.www.dto.Member"%> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>doLogin</title>
	</head>
	<body>
	  <%
	  	String userId = request.getParameter("id"); 
	  	String userPw = request.getParameter("pw"); 
	  	MemberDao mdao = new MemberDao();
	  	Member member = mdao.selectLogin(userId, userPw);
	  	
	  	if(member!=null){
	  		session.setAttribute("sessionId", member.getId());
	  		session.setAttribute("sessionName", member.getName());
	  %>
	  <script>
	  	alert("로그인이 되었습니다.");
	  	location.href="main.jsp";
	  </script>		
	  <%}else{ %>
	  <script>
	  	alert("로그인에 실패하였습니다. 다시 해주세요.");
	  	//location.href="login.jsp";
	  	history.back();
	  </script>
	  <%}%>
	
	</body>
</html>