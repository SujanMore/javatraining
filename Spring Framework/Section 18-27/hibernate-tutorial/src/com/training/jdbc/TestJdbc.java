package com.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		
		String jdbcUrl = "jdbc:postgresql://localhost:5432/student?useSSL=false";
		String username = "postgres";
		String password = "root";
		
		try {
			
			System.out.println("Connecting to database" + jdbcUrl);
			
			Connection myConn =
					DriverManager.getConnection(jdbcUrl, username, password);
			
			System.out.println("Connection successful");
			
		} 
		catch (Exception exc) {
			
			exc.printStackTrace();	
		}
	}

}
