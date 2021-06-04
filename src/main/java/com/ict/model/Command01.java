package com.ict.model;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Command01 implements Command
{
	
	// 오늘의 날짜와 운세를 구하는 메소드
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response)
	{
		String msg = "";
		// 날짜와 운세 구하기
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int date = now.get(Calendar.DATE);
		msg = year + ". "+ month+"."+date;
		
		return msg;
	}
}
