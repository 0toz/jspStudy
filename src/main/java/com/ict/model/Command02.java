package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Command02 implements Command {
	public String exec(HttpServletRequest request, HttpServletResponse response) {

		// 계산 결과 구하기.
		int result = 0;
		String s1 = request.getParameter("s1");
		String s2 = request.getParameter("s2");
		String op = request.getParameter("op");
		int su1 = Integer.parseInt(s1);
		int su2 = Integer.parseInt(s2);
		switch (op) {
		case "+":
			result = su1 + su2;
			break;
		case "-":
			result = su1 - su2;
			break;
		case "*":
			result = su1 * su2;
			break;
		case "/":
			result = su1 / su2;
			break;
		}

		String msg = s1 + op + s2 + "=" + result;
		return msg;
	}
}
