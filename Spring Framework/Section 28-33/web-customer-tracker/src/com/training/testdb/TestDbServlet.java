package com.training.testdb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

/**
 * Servlet implementation class TestDbServlet
 */
@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String jdbcUrl = "jdbc:postgresql://localhost:5432/web_customer_tracker?useSSL=false";
		String driver = "org.postgresql.Driver";
		
		String username = "postgres";
		String password = "root";
		
		try {
			
			PrintWriter out = response.getWriter();
			
			out.println("Connecting to database" + jdbcUrl);
			
			Class.forName(driver);
			
			Connection myConn =
					DriverManager.getConnection(jdbcUrl, username, password);
			
			out.println("Connection successful");
			
			myConn.close();
			
		} 
		catch (Exception exc) {
			
			exc.printStackTrace();
			throw new ServletException(exc);
		}
		
		
		
	}

}
