package com.kani.corejava.maincontroller3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;


public class EmployeeDAO {
	int i;
	            //          100 java  250 C
	public int addEmployee(EmployeeBean empBean) throws ClassNotFoundException {
		
		System.out.println("Employee DAO Layer");
		System.out.println("EmployeeID:"+empBean.getEmpId());
		System.out.println("EmployeeName :"+empBean.getEname());
		System.out.println("Employee Salary :"+empBean.getSal());
		
		Connection connection = null;
	      String url = "jdbc:mysql://localhost:3306/";
	      String dbName = "mydb";
	      String driverName = "com.mysql.jdbc.Driver";
	      String userName = "root";
	      String password = "root";
	      try{
	        Class.forName(driverName); // Calculation cal=new Calculation();
	        connection = DriverManager.getConnection(url+dbName, userName, password);
	        
	        String query="insert into employee values(?,?,?,?)";
	        
	       PreparedStatement pstmt=connection.prepareStatement(query);
	        pstmt.setInt(1, empBean.getEmpId());
	        pstmt.setString(2,empBean.getEname());
	        pstmt.setDouble(3,empBean.getSal());
	        pstmt.setString(4, empBean.getGrade());
	        
	        i= pstmt.executeUpdate();
	        
	      }
	      catch(SQLException e) {
	    	  System.out.println(e);
	      }
		return i;
	}

}
