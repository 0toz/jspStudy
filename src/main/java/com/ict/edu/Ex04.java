package com.ict.edu;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex04")
public class Ex04 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Ex04() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 응답에 대한 한글 처리.
		response.setContentType("text/html; charset=utf-8");
		//출력을 위한 처리.
		PrintWriter out = response.getWriter();
		// 프로젝트 / 서블릿 문서.
		out.println("<a href= '/0602_servlet/Ex03'> 문서 3</a>");
		out.println("<a href= '" + request.getContextPath() + "/Ex03'> 문서 3</a>");

	}
}
// 요청을 하면서 제공하는 정보 파라미터값.
// 클라이언트 > 서블릿에 요청 > 파라미터값 요구> 파라미터값에 따른 처리.