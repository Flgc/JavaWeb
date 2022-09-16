package br.com.SystemLogin.connection;

import java.sql.SQLException;
import com.mysql.jdbc.Connection;

import br.com.SystemLogin.login.DAOLogin;
import br.com.SystemLogin.login.Login;

public class Main {
	public static void main(String[] args) throws SQLException{
		Connection con = (Connection) ConnectionCreateClass.getConnectionClass();
		
		Login newLogin = new Login();
		newLogin.setLogUser("carla");
		newLogin.setLogpass("123");
		
		DAOLogin dao = new DAOLogin(con);
		dao.addLogin(newLogin);
	}
}
