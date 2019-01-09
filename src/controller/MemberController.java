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
import service.MemberServiceImpl;

@WebServlet("/member.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		MemberBean member = null;
		AccountBean acc = null;
		System.out.println("(1)멤버서블릿으로 들어옴!!");
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
		
		switch(cmd) {
		case "login":
			String id = request.getParameter("uid");
			String pass = request.getParameter("upw");
			if(!(id.equals("test") && pass.equals("test"))) {
				dir = "";
				page = "index";
			}
			System.out.println("(3)dir :"+dir);
			System.out.println("(4)page :"+page);
			request.setAttribute("name", "test");
			request.setAttribute("compo", "login-success");
			Command.move(request, response, dir,page);
			break;
		case "move":
			String dest = request.getParameter("dest");
			if(dest == null) {
				dest = "NONE";
			}
			request.setAttribute("dest", dest);
			Command.move(request, response, dir,page);
			break;
		case "join":
			acc = new AccountBean();
			member = new MemberBean();
			member.setId(request.getParameter("id"));
			member.setName(request.getParameter("name"));
			member.setPass(request.getParameter("pass"));
			member.setSsn(request.getParameter("ssn"));
			MemberServiceImpl.getInstance().createMember(member);
			request.setAttribute("dest", "mypage");
			request.setAttribute("member",  
					MemberServiceImpl.getInstance().findMemberById(member.getId()));
			break;
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
