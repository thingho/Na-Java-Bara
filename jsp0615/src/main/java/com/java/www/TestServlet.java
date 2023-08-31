package com.java.www;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8"); //한글처리
		
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String[] hobbys = request.getParameterValues("hobbys"); //여러개를 선택하기 때문에 배열로 받음
		
		System.out.println("name : "+name);
		System.out.println("gender : "+gender);
		//for문 
		for(int i=0; i<hobbys.length;i++) {
			System.out.println("hobbys : "+hobbys[i]);
		}
		response.setContentType("text-html; charset=utf-8");
		PrintWriter writer = response.getWriter();
		
		writer.println("<html><head><title>Insert title here</title></head></html>");
		writer.println("<body>");
		writer.println("<h2>hello~~~~~~ Servlet</h2>");
		writer.println("</body>");
		writer.println("</html>");
		
		writer.close();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get방식으로 접근할 때 - url직접 접근, form-method:get
		System.out.println("doGet");
		doAction(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//form-post 접근할 때
		System.out.println("doPost");
		doAction(request,response);
	}

}
