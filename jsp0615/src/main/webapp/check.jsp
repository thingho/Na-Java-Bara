<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	  <%
	    String id = request.getParameter("id");
	    String name = request.getParameter("name");
	   
	    if(id.equals("aaa")){   //aaa아이디가 존재할시
	    	response.sendRedirect("jsp0615_08.jsp");
	    }else{
	    	response.sendRedirect("join03_success.jsp?userId="+id+"&name="+name);
	    }
	  %>
	
	</body>
</html>







