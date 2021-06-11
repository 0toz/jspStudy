package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Command03 implements Command {
	public String exec(HttpServletRequest request, HttpServletResponse response) { // 다 스트링을 통해서 리턴한다. 이유는 mvc패턴할때 스트링으로
																					// 넘긴다.
		String msg = "";

		String name = request.getParameter("name");
		int kor = Integer.parseInt(request.getParameter("kor"));
		int eng = Integer.parseInt(request.getParameter("eng"));
		int math = Integer.parseInt(request.getParameter("math"));
		int sum = kor + eng + math;
		double avg = (int) (sum / 3.0 * 10) / 10.0;
		String hak = "";
		if (avg >= 90) {
			hak = "A학점";
		} else if (avg >= 80) {
			hak = "B학점";
		} else if (avg >= 70) {
			hak = "C학점";
		} else {
			hak = "F학점";
		}
		msg = "이름: " + name + "총점 : " + sum + "평균 : " + avg + "학점 " + hak;
		return msg;
	}
}
