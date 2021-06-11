package com.ict.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.model.Command;
import com.ict.model.Command01;
import com.ict.model.Command02;
import com.ict.model.Command03;


@WebServlet("/Ex16")
public class Ex16 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		// 하나의 서블릿에 많은 양을 처리하느 ㄴ단점이 생긴다.
		// 이것을 해결하기 위해서 별도의 일처리하는 자바 클래스를 만들어서 호출한다.
		
		//일처리가 많아지므로 담당 일처리를 할 자바 클래스를 만든다.
		String cmd = request.getParameter("cmd");
		Command comm =null;
		//커맨드 1,2,3이 모두 같은 형태의 메소드를 사용하므로 커맨드라는 인터페이스를 만들어서 사용해보자.
		switch(cmd) {
		case "1" :
			comm = new Command01();
			
			break;
		case "2" :
			comm = new Command02();
			break;
		case "3" :
			comm = new Command03();
			break;
		}
		String msg = comm.exec(request, response);
		out.print("<h2>결과보기 </h2>");
		out.print("<h3>"+ msg + "</h3>");
		
		
		/*
		 * 일처리에 맞는 로직을 코딩한다. 비즈니스로직 너무많은 내용을
		 *  여기서 정하면 너무 길어진다. 일처리하는 클래스를 따로만든다.
		 */
		
	}

}
