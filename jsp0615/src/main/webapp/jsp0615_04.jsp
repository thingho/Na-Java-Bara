<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import = "java.util.Arrays" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<style>
		  * {padding:0; margin:0;}
		  table{width:550px; margin:30px auto; text-align: center; }
		  table,td{border:1px solid black; border-collapse: collapse;}
		  td{height:35px; width:100px; }
		</style>
	</head>
	<body>
		<%! //servlet, class
		  int num=1;
		  int num2=10;
		  private int sum(int a, int b){ //1~10까지 숫자 합 구하기
			int total=0;
			for(int i=a;i<=b;i++){
				total += i;
			}
			return total;
		}
		%>
		
		<%
			int[] arr = {10,20,30}; // 상단에 작성 -> page import = "java.util.Arrays"
		%>
		<table>
			<tr>
			  <td><%= num %></td>
			  <td><%= num2 %></td>
			  <td><%= sum(num, num2) %></td>
			</tr>
		</table>
	
	</body>
</html>