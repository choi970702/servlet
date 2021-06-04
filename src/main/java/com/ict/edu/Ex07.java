package com.ict.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex07")
public class Ex07 extends HttpServlet 
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
		
		try 
		{
			
			String s1 = request.getParameter("s1");
			String s2 = request.getParameter("s2");
			String op = request.getParameter("op");
			int su1 = Integer.parseInt(s1);
			int su2 = Integer.parseInt(s2);
			int result = 0;
			
			
			
			out.println("<h3>");
			switch (op) 
			{
			case "+": result = su1 + su2; break;
			case "-": result = su1 - su2; break;
			case "*": result = su1 * su2; break;
			case "/": result = su1 / su2; break;
			}
			out.println("<p>결과 : "+s1+op+s2+" = "+result+"</p>");
			out.println("</h3>");
			
		} catch (Exception e) 
		{
			out.println("0을 사용할 수는 없습니다.");
		}
		
	}

}



