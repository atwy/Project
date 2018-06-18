package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Dao {

	static Connection conn;
	
	public static Connection Connect() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_demo","root","wwnnrr");
			conn = connection;
			return connection;
		} catch (SQLException e) {
			
			e.printStackTrace();
			System.out.println("failed to connect");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	public ArrayList<String> select(String u, String p) {
		Connection conn = Connect();
		try {
			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery("select username,password from profile where username = '"+u+"' and password = '"+p+"'");
			ArrayList<String> info = new ArrayList<>();
			
			if(rs.next()) {
				info.add(rs.getString("username"));
				info.add(rs.getString("password"));
			}
			return info;
			
		} catch (SQLException e) {
			
			//e.printStackTrace();
			//System.out.println("failed to connect");
		}
		return null;
		
		
	}
	
	
}
