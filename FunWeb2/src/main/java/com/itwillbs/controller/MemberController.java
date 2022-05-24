package com.itwillbs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberController extends HttpServlet{
	//서블릿(처리담당자) 파일 상속=> 주소매핑
	// 서블릿이 처리를 하기위해서 doGet() doPost() service().. 메서드 자동으로 호출
	// 메서드오버라이딩
	
// http://localhost:8080/FunWeb2/join.me
	
	protected void doPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 데이터 전송방식 get,post 상관없이 호출
		System.out.println("MemberController doGet()");
		// 가상주소 => 실제주소 매핑
		// /join.me => join.jsp 매핑
		// join. me 뽑아오기
		// URL : http://localhost:8080/FunWeb2/member/join.me 
		// URI /FunWeb2/join.me
		// 프로젝트 경로 /FunWeb2
		// 찾는 주소 /join.me
		String uri = request.getRequestURI();
		System.out.println(uri);
		String projectPath = request.getContextPath();
		System.out.println("프로젝트경로의 길이 :" + projectPath.length());
		// 가상주소/join.me uri 문자열에서 8번째부터 끝까지 뽑아오기
		String path = uri.substring(projectPath.length());
		System.out.println(path);
		if(path.equals("/join.me")) {
			// join.jsp 매핑 => 이동
			// jsp 명령 이동
			// 1. 주소줄에 보이면서 이동방식(하이퍼링크, location.href, sendRedirect())
//			response.sendRedirect("member/join.jsp");
			// 2. 주소줄에 안보이면서(안 바뀌면서, request모든내용가지고 감) 이동하는 방식(forward액션), 
			RequestDispatcher dispatcher = request.getRequestDispatcher("member/join.jsp");
			dispatcher.forward(request, response);
			
		}else if(path.equals("/joinPro.me")) {
			System.out.println("/joinPro.me 매핑");
			// 디비 insert 
			// 로그인 페이지 주소줄이 변경되면서 이동 /login.me
			response.sendRedirect("login.me");
		}else if(path.equals("/login.me")) {
//		가상주소	/login.me  => member/login.jsp 이동
			RequestDispatcher dispatcher = request.getRequestDispatcher("member/login.jsp");
			dispatcher.forward(request, response);
		}else if(path.equals("/loginPro.me")) {
			
			response.sendRedirect("main.me");
		}else if(path.equals("/main.me")) {
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("main/main.jsp");
			dispatcher.forward(request, response);
		}
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//데이터 전송방식이 post 방식이면 자동호출
		System.out.println("MemberController doPost()");
		doPro(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 데이터 전송방식 get방식이면 자동호출
		System.out.println("MemberController doGet()");
		doPro(request, response);
	}
}
