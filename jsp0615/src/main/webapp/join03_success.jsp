<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" type="text/css" href="css/style_header.css">
		<link rel="stylesheet" type="text/css" href="css/style_join03_success.css">
		<link rel="stylesheet" type="text/css" href="css/style_footer.css">
		<title>회원가입 - 회원가입완료</title>
	</head>
	<body>
		<%@include file="jtop.jsp" %>
		
		<section>
			<div id="subBanner"></div>
			<div id="locationN">
				<ul>
					<li>HOME</li>
					<li>회원가입</li>
					<li>회원가입완료</li>
				</ul>
			</div>
			
			<div id="sub_top_area">
				<h3>회원가입</h3>
			</div>
			
			<div id="join_step_div">
				<ul>
					<li>
						<span>STEP.1</span>
						<p>약관동의</p>
					</li>
					<li>
						<span>STEP.2</span>
						<p>회원정보</p>
					</li>
					<li>
						<span>STEP.3</span>
						<p>회원가입완료</p>
					</li>
				</ul>
			</div>
			
			<div id="join_success_div">
				<p>
					감사합니다.
					<strong>회원가입이 완료되었습니다.</strong>
					<strong>가입한 아이디 : <%= request.getParameter("userId") %></strong>
					<strong>이름 : <%= request.getParameter("name") %></strong>
				</p>
			</div>	
				
				
		</section>
		
		<%@include file="jfooter.jsp" %>
		
	</body>
</html>