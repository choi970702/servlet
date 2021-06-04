package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Command02 implements Command
{
	// 계산기 구하는 메소드
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response)
	{
		String msg = "";
		// 계산결과 구하기
		String s1 = request.getParameter("s1");
		String s2 = request.getParameter("s2");
		String op = request.getParameter("op");
		int su1 = Integer.parseInt(s1);
		int su2 = Integer.parseInt(s2);
		int res = 0;
		
		switch (op) 
		{
		case "+": 
		{
			res = su1 + su2;break;
		}
		case "-": 
		{
			res = su1 - su2;break;
		}
		case "*": 
		{
			res = su1 * su2;break;
		}
		case "/": 
		{
			res = su1 / su2;break;
		}

		}
		msg = Integer.toString(res);
		return msg;
	}
}


