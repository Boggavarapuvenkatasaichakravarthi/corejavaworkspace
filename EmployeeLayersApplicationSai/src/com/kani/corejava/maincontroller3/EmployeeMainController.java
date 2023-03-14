package com.kani.corejava.maincontroller3;

import java.util.Scanner;

public class EmployeeMainController {
      
	public static void main(String[] args) {
		try {
		System.out.println(" EmployeeMainController -1  ");
		int empId=0;
		String ename=null;
		double sal;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Employee Id :");
		empId=sc.nextInt();
		System.out.println("Enter Employee Name :");
		ename=sc.next();
		System.out.println("Enter Employee Salary :");
		sal=sc.nextDouble();
		
		EmployeeService empService=new EmployeeService();
		int t=empService.addEmployeeService(empId, ename, sal);
		
		System.out.println("Main controller return value form DAO layer :"+t);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}



