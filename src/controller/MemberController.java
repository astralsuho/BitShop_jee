package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/member.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	@SuppressWarnings("unused")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(" 멤버서블릿으로 들어옴!!");
		String action = request.getParameter("action");
		switch((action == null) ? "move": action) {
		case "login":
			System.out.println("액션이 로그인");
			String id = request.getParameter("id");
			String pass = request.getParameter("pass");
			System.out.println("아이디: "+ id);
			System.out.println("비번: "+ id);
			if(id.equals("test") && pass.equals("test")) {
				RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/home/main.jsp");
				rd.forward(request, response);
			}else {
				RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
				rd.forward(request, response);
			}
			break;
		case "move":
			System.out.println("액션이 이동");
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/member/main.jsp");
			rd.forward(request, response);
			break;
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
