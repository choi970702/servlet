package com.ict.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex08")
public class Ex08 extends HttpServlet 
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
		response.setContentType("text/html; charset=utf8");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		int kor = Integer.parseInt(request.getParameter("kor"));
		int eng = Integer.parseInt(request.getParameter("eng"));
		int math = Integer.parseInt(request.getParameter("math"));
		int sum = kor + eng + math;
		int avg = sum / 3;
		String hak;
		if (avg >= 90) 
		{
			hak = "A";
		}else if(avg >= 80)
		{
			hak = "B";
		}else if(avg >= 70)
		{
			hak = "C";
		}else
		{
			hak = "F";
		}
		
		out.println("<h3>");
		out.println("<p>이름 : "+name+"</p>");
		out.println("<p>총점 : "+sum+"</p>");
		out.println("<p>평균 : "+avg+"</p>");
		out.println("<p>학점 : "+hak+"</p>");
		out.println("</h3>");
		
		
	}

}
