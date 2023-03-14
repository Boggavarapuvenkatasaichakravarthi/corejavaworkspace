package com.ram.services;

import com.ram.beans.EmployeeBean;
import com.ram.dao.EmployeeDAO;

import java.util.ArrayList;

public class EmployeeService 
{
 public int addEmployeeService(int empId, String ename, double sal)
 {
	 //implement the business logic
	 String grade="";
	 if(sal <= 300)
	 {
		 grade = "C";
	 }
	 else if(sal <= 600)
	 {
		 grade = "B";
	 }
	 else
	 {
		 grade = "A";
	 }
	 
	 EmployeeDAO employeeDAO = new EmployeeDAO();
	 EmployeeBean employeeBean = new EmployeeBean();
	 //wrap up all the four field values into bean
	 
	 employeeBean.setEmpId(empId);
	 employeeBean.setEname(ename);
	 employeeBean.setSal(sal);
	 employeeBean.setGrade(grade);
	 int updateResult = 0;
	 try
	 {
		 updateResult = employeeDAO.addEmployee(employeeBean);
		 return updateResult;
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
	  EmployeeDAO employeeDAO = new EmployeeDAO();
	 ArrayList result = employeeDAO.getEmployeeDetailsById();
	 
	 return result;
	 
  }
  
  public int deleterow(int empId) throws Exception
  {
	  EmployeeDAO employeeDAO=new EmployeeDAO();
	  int ch=employeeDAO.delrow(empId);
	  return ch;
  }
}
