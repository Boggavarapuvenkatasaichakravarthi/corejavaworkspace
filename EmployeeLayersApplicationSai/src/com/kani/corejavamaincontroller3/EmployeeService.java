package com.kani.corejavamaincontroller3;

public class EmployeeService {
	String grade;
                              //    100         java          250
	 public int addEmployeeService(int empId,String ename,double sal) throws ClassNotFoundException {
		 System.out.println("Employee Serivce Layer - 2");
		   System.out.println(empId+ename+sal+grade);
		 
		   if(sal<=3000)		   {
			      grade="C";
		   }
		  else if(sal<=6000) {
				   grade="B";
			   }
		  else {
				   grade="A";
		   }
		   System.out.println("Grade:"+grade);
		   // Adding data to EmployeeBean
		   EmployeeBean empBean = new EmployeeBean();
		       empBean.setEmpId(empId);  //100
		       empBean.setEname(ename);  //java
		       empBean.setSal(sal);  //250
		       empBean.setGrade(grade);  //c
		   
		    //Sending data to EmployeeDAO
		       
		       EmployeeDAO empDAO=new EmployeeDAO();  //HAS-A
		    int k=   empDAO.addEmployee(empBean);
		       
		   return k;

	 }
	
}
