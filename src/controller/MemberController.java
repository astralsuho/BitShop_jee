package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;
import domain.AccountBean;
import domain.MemberBean;
import service.MemberService;
import service.MemberServiceImpl;

@WebServlet("/member.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		MemberBean member = null;
		MemberService memberService = MemberServiceImpl.getInstance();
		AccountBean acc = null;
		System.out.println("(1)멤버서블릿으로 들어옴!!");
		/**
		 * 디폴트 값
		 * cmd : move
		 * dir : member
		 * page : main
		 * dest : NONE
		 * */
		String cmd = request.getParameter("cmd");
		cmd = (cmd == null) ? "move": cmd;
		System.out.println("(2)cmd :"+ cmd);
		String dir = request.getParameter("dir");
		if(dir == null) {
			String sPath = request.getServletPath();
			sPath = sPath.replace(".do", "");
			dir = sPath.substring(1);
		}
		
		String page = request.getParameter("page");
		if(page == null) {page = "main";}
		String dest = request.getParameter("dest");
		if(dest == null) {page = "NONE";}
		
		switch(cmd) {
		case "login":
			String id = request.getParameter("uid");
			String pass = request.getParameter("upw");
			boolean loginOk = memberService.existMember(id, pass);
			
			if(loginOk) {
				dir = "";
				page = "index";
			}
			System.out.println("(3)dir :"+dir);
			System.out.println("(4)page :"+page);
			request.setAttribute("name", "test");
			request.setAttribute("compo", "login-success");
			
			break;
		case "move":
			request.setAttribute("dest", dest);
			break;
		case "join":
			member = new MemberBean();
			member.setId(request.getParameter("id"));
			member.setName(request.getParameter("name"));
			member.setPass(request.getParameter("pass"));
			member.setSsn(request.getParameter("ssn"));
			MemberServiceImpl.getInstance().createMember(member);
			member = MemberServiceImpl.getInstance().findMemberById(member.getId());
			System.out.println(">>>>>> 조회결과 "+member.toString());
			request.setAttribute("member", member);
			request.setAttribute("dest", dest);
			break;
		case "logout":
			dir = "";
			page = "index";
			dest = "";
			break;
		}
		Command.move(request, response, dir,page);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
