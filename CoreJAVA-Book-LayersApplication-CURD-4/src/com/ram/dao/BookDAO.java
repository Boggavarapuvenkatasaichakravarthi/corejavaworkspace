package com.ram.dao;
import com.ram.beans.BookBean;
import java.sql.*;
import java.util.ArrayList;
public class BookDAO 
{	
  public int addBook(BookBean obj)
  {
	  Connection con = null;
	  PreparedStatement pstmt = null;
	  try
	  	{
		  con=BookDB.getConnection(); 
		 
		  
		  
		  String ins_str ="insert into book values(?,?,?,?)";
		  pstmt = con.prepareStatement(ins_str);
		  pstmt.setInt(1,obj.getBookId());
		  pstmt.setString(2,obj.getTitle());
		  pstmt.setFloat(3,obj.getPrice());
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
  public ArrayList getBookDetailsById()
		throws Exception
			{
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			con = BookDB.getConnection();
			String sel_str ="Select bookId,title,price from book";
			pstmt = con.prepareStatement(sel_str);
			rs = pstmt.executeQuery();
			
			
			ArrayList result = new ArrayList();
			
			while(rs.next())
				 {
				int s1=rs.getInt(1);
				String s2=rs.getString(2);
				float s3=rs.getFloat(3);
				//String s4=rs.getString(4);
				String s4="Book Id : " +s1 + " Title : " +s2+ " Price : " +s3;
				 result.add(s4);  
				 }
			return result;	
			}
  public int delrow(int bookId)
  {
	  Connection con = null;
	  PreparedStatement pstmt = null;
	  try
	  	{
		  con=BookDB.getConnection(); 
		  String del_str ="delete from book where bookId=?";
		  pstmt = con.prepareStatement(del_str); 
		  pstmt.setInt(1,bookId);  
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
