package com.ict.edu;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex14_1
 */
@WebServlet("/Ex14_2")
public class Ex14_2 extends HttpServlet 
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
		
		out.println("<h2> Ex14_2 페이지 오늘 운세 </h2>");
		Calendar now = Calendar.getInstance();
		int lucky = (int)(Math.random()*101);
		
		out.println("<h3>오늘 운세 : "+lucky+"%입니다."+"</h3>");
	}

}
