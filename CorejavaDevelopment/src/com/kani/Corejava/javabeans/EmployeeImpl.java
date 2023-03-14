package com.kani.Corejava.javabeans;

public class EmployeeImpl {

	public static void main(String[] args) {
          Employee emp=new Employee();
          //Storing values into Bean
          emp.setEno(1);
          emp.setEname("Sai");
          emp.setSal(5000);
          //Retriving values into Bean
          System.out.println("Employee Number:"+emp.getEno());
          System.out.println("Employee Name:"+emp.getEname());
          System.out.println("Employee Salary:"+emp.getSal());

          
	}

}
