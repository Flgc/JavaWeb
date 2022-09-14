package br.com.SystemLogin.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.SystemLogin.exception.InvalidUserException;

@WebServlet("/Login")
public class LoginControllers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		processRequest(request, response);
		
	}

	private void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {		
		DataValidationReceived(req);
		RequestDispatcher rd = req.getRequestDispatcher("logged.jsp");
		rd.forward(req, resp);
	}

	private void DataValidationReceived(HttpServletRequest req) throws ServletException {
		String userName = req.getParameter("txtUser");
		String userPassword = req.getParameter("txtPassword");
		
		if(!userName.trim().equals("fabio") || !userPassword.trim().equals("123")) {
			throw new InvalidUserException("Invalid login or password!");
			
			}
		
		 HttpSession session = req.getSession();
		 session.setAttribute("UserAuthentication", userName);		
				
	}

}
