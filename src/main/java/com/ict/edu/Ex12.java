package com.ict.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex12")
public class Ex12 extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		
		// 페이지 이동(리다이렉트, 포워드)
		// 현재 페이지에서 작업 한 후 다른 페이지로 이동(현재 페이지는 보이지 않는다.)
		// 2. 포워드 : 다른 페이지로 이동하면서 기존의 request와 response를 그대로 가져간다.
		// 				즉, 파라미터 값들이 사라지지 않는다.
		//				주소창에 최초 주소가 보인다.
		
		// 사용 방법 : request.getRequestDispatcher("이동할 주소").forword(request, response);
		//			이동할 주소가 servlet이면 확장자를 사용 하지 않는다.
		//			이동할 주소가 html이면 확장자를 사용한다.
		
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		out.println("<h2> Ex12 페이지 이다. </h2>");
		out.println("<h3>");
		out.println("<li>이름 : "+name+"</li>");
		out.println("<li>나이 : "+age+"</li>");
		out.println("</h3>");
		
		request.getRequestDispatcher("Ex13").forward(request, response);
		
		
		
		
		
	}

	
	
	
	
}






