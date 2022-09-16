package br.com.SystemLogin.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionCreateClass {
	public static Connection getConnectionClass() throws SQLException{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connected!");
			
			return DriverManager.getConnection("jdbc:mysql://localhost/SystemLogin","fabio","mysql2021");
			
		} catch (SQLException e) {
			throw new SQLException(e);
		} catch(ClassNotFoundException e1) {
			throw new SQLException(e1);
		}
	} 
}
