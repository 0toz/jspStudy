package com.ict.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex11")
public class Ex11 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset= utf-8");
		PrintWriter out = response.getWriter();
		
		
		// 페이지 이동( 리다이렉트, 포워딩)
		// => 현재 페이지에서 작업 한 후 다른 페이지로 이동.(현재 페이지는 보이지않음.) (공통사항)
		// 1. 리다이렉트: 다른페이지로 이동하면서. 기존의 request와 response의 정보가 사라진다.
		// 				새로운 request와 response가 만들어진다.
		// 				즉, 파라미터 값들이 사라진다.
		// 				주소창에 최종 주소가 보인다.
			// 서블릿에서 리다이렉트를 만나 웹브라우저로 돌아갔다가 다시 간다.
		
		// 사용 방법 :   response.sendRedirect("이동할 주소");
		// 이동할 주소가 servlet이면 확장자를 쓰지않고, html파일이면 확장자를 사용한다.
		
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		out.print("<h3> Ex11페이지이다.</h3>");
		out.println("<h3>");
		out.println("<li>이름: " + name + "</li>");
		out.println("<li>나이: " + age + "</li>");
		out.println("</h3>");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
