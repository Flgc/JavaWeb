package br.com.SystemLogin.login;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;

import br.com.SystemLogin.connection.ConnectionCreateClass;

@WebServlet("/LoginRegistration")
public class ServletLoginRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletLoginRegistration() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName = request.getParameter("txtUser");
		String userPassword = request.getParameter("txtPassword");
		
		Connection con;
		try {
			con = (Connection) ConnectionCreateClass.getConnectionClass();

			Login newLogin = new Login();
			newLogin.setLogUser(userName);
			newLogin.setLogpass(userPassword);
			
			DAOLogin dao = new DAOLogin(con);
			dao.addLogin(newLogin);		 
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
