package com.ram.maincontroller;
import com.ram.services.EmployeeService;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

import com.ram.services.EmployeeService;

public class MainController
{
public static void main(String[] args) 
{
	int empId=0;
	String ename="";
	double sal=0;
	int ch,ch1=1;
	Scanner s=new Scanner(System.in);
	EmployeeService employeeService = new EmployeeService();
	while(ch1!=0)
	{
		
		System.out.println("1.Insert  New Record:");
		System.out.println("2.View All Records:");
		System.out.println("3.Delete:");
		System.out.println("Enter your choice :");
		ch=s.nextInt();
		switch(ch)
			{
			case 1:
				System.out.println("Enter Employee EmpId:");
				empId = s.nextInt();
				System.out.println("Enter Employee Ename:");
				ename = s.next();	
				System.out.println("Enter Employee Sal:");
				sal = s.nextFloat();
				int updateCount = employeeService.addEmployeeService(empId, ename, sal);	
				System.out.println("inserted "+updateCount+" record   Success");
				break;
			case 2:
				try
					{
					ArrayList a =employeeService.getEmployeeDetailsById();
					
					ListIterator li=a.listIterator();
					while(li.hasNext())
						{
						System.out.println(li.next());

						}
					}catch(Exception e){e.printStackTrace();}
					break;
			case 3:
				try
					{	
					System.out.println("Enter the employeeid whose record you want to delete:");
					int b=s.nextInt();
					int a =employeeService.deleterow(b);
					System.out.println("deleted successfully :"+a);
					}catch(Exception e){e.printStackTrace();}
			default:
					System.out.println("Wrong Choice");
					break;
			
			}
		System.out.println("Enter 1 for Doing More Operation and 0 for Exit :");
		ch1=s.nextInt();
		}
		
		
}}


