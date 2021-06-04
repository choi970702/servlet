package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Command03 implements Command
{
	// 성적 구하는 메소드
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response)
	{
		String msg = "";
		// 성적 구하기
		String name = request.getParameter("name");
		String kor = request.getParameter("kor");
		String eng = request.getParameter("eng");
		String math = request.getParameter("math");
		
		int k = Integer.parseInt(kor);
		int e = Integer.parseInt(eng);
		int m = Integer.parseInt(math);
		int sum = k + e + m;
		int avg = Math.round(sum/3);
		String hak = "";
		
		if (avg >= 90) 
		{
			hak = "A";
		}else if (avg >= 80)
		{
			hak = "B";
		}else if (avg >=70)
		{
			hak = "C";
		}else
		{
			hak = "F";
		}
		msg = "이름 : "+name+"/t총점 : "+Integer.toString(sum)+
				"/t평균 : "+Integer.toString(avg)+"/t학점 : "+hak;
		return msg;
	}
}
