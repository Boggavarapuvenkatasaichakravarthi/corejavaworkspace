package com.ram.dao;
import com.ram.beans.EmployeeBean;
import java.sql.*;
import java.util.ArrayList;
public class EmployeeDAO 
{	
  public int addEmployee(EmployeeBean obj)
  {
	  Connection con = null;
	  PreparedStatement pstmt = null;
	  try
	  	{
		  con=EmployeeDB.getConnection(); 
		 
		  
		  
		  String ins_str ="insert into employee values(?,?,?,?)";
		  pstmt = con.prepareStatement(ins_str);
		  pstmt.setInt(1,obj.getEmpId());
		  pstmt.setString(2,obj.getEname());
		  pstmt.setDouble(3,obj.getSal());
		  pstmt.setString(4,obj.getGrade());
		  int updateCount = pstmt.executeUpdate();
		  con.close();
		  return updateCount;
	  	}
	  catch(Exception ex)
	  {
		  System.out.println(ex.toString());
		  return 0;
	  }  
  }
  public ArrayList getEmployeeDetailsById()
		throws Exception
			{
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			con = EmployeeDB.getConnection();
			String sel_str ="Select empId,ename,sal from employee";
			pstmt = con.prepareStatement(sel_str);
			rs = pstmt.executeQuery();
			
			
			ArrayList result = new ArrayList();
			
			while(rs.next())
				 {
				int s1=rs.getInt(1);
				String s2=rs.getString(2);
				double s3=rs.getFloat(3);
				//String s4=rs.getString(4);
				String s4="Employee Id : " +s1 + " Ename : " +s2+ " Sal : " +s3;
				 result.add(s4);  
				 }
			return result;	
			}
  public int delrow(int 	empId)
  {
	  Connection con = null;
	  PreparedStatement pstmt = null;
	  try
	  	{
		  con=EmployeeDB.getConnection(); 
		  String del_str ="delete from employee where empId=?";
		  pstmt = con.prepareStatement(del_str); 
		  pstmt.setInt(1,empId);  
		  int updateCount = pstmt.executeUpdate();
		  con.close();
		  return updateCount;    
	  	}
	  catch(Exception ex)
	  	{
		  System.out.println(ex.toString());
		  return 0;
	  	}
  }
}
