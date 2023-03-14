package com.zensar.quiz.util.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	String dbDriver="com.mysql.jdbc.Driver";
	String dbUrl="jdbc:mysql://localhost:3306/quiz";
	String dbUser="root";
	String dbPassword="root";

	private static ConnectionFactory connectionFactory=null;      
	
	private ConnectionFactory() {
		try {
			Class.forName(dbDriver);
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static ConnectionFactory getInstance() {	
		if(connectionFactory==null) {
			connectionFactory=new ConnectionFactory();
		}
		return connectionFactory;
	}

	public Connection getConnection() throws SQLException {
		Connection conn=null;
		conn=DriverManager.getConnection(dbUrl, dbUser, dbPassword);
		return conn;
	}

	
	public static void main(String[] args) throws SQLException {
		Connection con ;
		con=  ConnectionFactory.getInstance().getConnection();
		System.out.println(con);
		con = ConnectionFactory.getInstance().getConnection();
		System.out.println(con);
		con = ConnectionFactory.getInstance().getConnection();
		System.out.println(con);
	}
}

