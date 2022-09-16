package br.com.SystemLogin.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAOLogin {
	private Connection con;

	public DAOLogin(Connection con) {
		this.con = con;
	}
	
	public void addLogin(Login newLogin) throws SQLException{
		String sql = "insert into tb_login(log_user, log_pass) values(?,?)";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, newLogin.getLogUser());
			stmt.setString(2, newLogin.getLogpass());
			
			stmt.execute();
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();			
		}finally {
			con.close();
		}
	}  	
}

