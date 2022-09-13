package com.fullstack.khan.config;

import java.sql.Connection;

public class DataBaseConfiguaration {
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/demodb";
		String userName="root";
		String passwd="root";
		
		
		
		return null;
	}

}
