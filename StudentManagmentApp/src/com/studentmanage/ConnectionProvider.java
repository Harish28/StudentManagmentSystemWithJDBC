package com.studentmanage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	
//	private ConnectionProvider() {}
	static Connection conn;
	public static Connection createConn() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String u = "root";
			String pwd = "password";
			String url = "jdbc:mysql://localhost:3306/studentmanage";
			conn = DriverManager.getConnection(url, u, pwd);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

}
