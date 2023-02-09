package com.studentmanage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDao {
	
	public static boolean insertIntoDB(Student s) {
		boolean flag = true;
		Connection conn = ConnectionProvider.createConn();
		
		String query = "insert into student(sname,sphone,scity) values(?,?,?)";
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setString(1, s.getSname());
			stmt.setString(2, s.getsNumber());
			stmt.setString(3, s.getScity());
			
			stmt.executeUpdate();
			return flag;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	public static boolean deleteStudentFromDB(int id) {
		boolean flag = true;
		Connection conn = ConnectionProvider.createConn();
		
		String query = "delete from student where sid = ?";
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setString(1, Integer.toString(id));
			stmt.executeUpdate();
			return flag;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	public static ResultSet findAllStudents() {
		boolean flag = true;
		Connection conn = ConnectionProvider.createConn();
		
		String query = "select * from student";
		try {
			Statement stmt = conn.createStatement();
			return stmt.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
