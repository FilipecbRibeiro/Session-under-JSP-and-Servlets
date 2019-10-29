package org.light.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.light.bean2.UserMember;

/**
 * Servlet implementation class WebControllerServlet
 */
@WebServlet("/WebControllerServlet") // url pattern is /WebcontrollerServlet
public class WebControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public WebControllerServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String passw = request.getParameter("password");
		

		if (name.equals("Filipe") && passw.equals("Ribeiro")) {
			UserMember usermember=new UserMember();
			usermember.setName(name);
			usermember.setPassWord(passw);
			
			request.getSession().invalidate();
			//returns the HttpSession associated with this request and invalidate if any 
			HttpSession newSession= request.getSession(true);
			newSession.setAttribute("ref", usermember);
			
			//creating here a new session 			
			newSession.setMaxInactiveInterval(300);
			//setting here the max inactivity to 300  
			//response.sendRedirect("memberList.jsp");
			//we will redirect the response to that list!

			request.getRequestDispatcher("/memberList.jsp").forward(request, response);	
			//we will redirect the request to member list in order to use setPropriety and getPropriety
		}else {
		response.sendRedirect("login.jsp");
			//if login incorrect than we redirect to login
		}

	}

}
