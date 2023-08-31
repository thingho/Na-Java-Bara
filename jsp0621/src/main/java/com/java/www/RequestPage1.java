package com.java.www;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/r1")
public class RequestPage1 extends HttpServlet {
       
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction");
		request.setCharacterEncoding("utf-8");
		
		//request에 객체를 태워서 보냄
		request.setAttribute("id", "admin");
		request.setAttribute("pw", "1234");
		
		//request를 사용해 데이터를 페이지로 넘겨준다. (parameter는 데이터 제한이 있음)
//		response.sendRedirect("jsp0621_01.jsp");
		RequestDispatcher rd = request.getRequestDispatcher("jsp0621_01.jsp");
		rd.forward(request, response);
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		doAction(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		doAction(request, response);
	}

}
