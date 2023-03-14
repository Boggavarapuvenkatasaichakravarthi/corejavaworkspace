package com.kani.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {

		String JdbcUrl = "jdbc:mysql://localhost:3306/mydb?useSSL=false";
		String user= "root";
		String password = "root";
		try {
			System.out.println("db connection" + JdbcUrl);
			Connection myConn = DriverManager.getConnection(JdbcUrl, user, password);
			System.out.println("connection success");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
