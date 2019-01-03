package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;

@WebServlet("/member.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(" 멤버서블릿으로 들어옴!!");
		String action = request.getParameter("cmd");
		switch((action == null) ? "move": action) {
		case "login":
			String id = request.getParameter("id");
			String pass = request.getParameter("pass");
			String dir = request.getParameter("dir");
			String page = request.getParameter("page");
			if(id.equals("test") && pass.equals("test")) {
				Command.move(request, response, dir+"/"+page);
			}else {
				Command.move(request, response, "index");
			}
			break;
		case "move":
			Command.move(request, response, "member/main");
			break;
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
