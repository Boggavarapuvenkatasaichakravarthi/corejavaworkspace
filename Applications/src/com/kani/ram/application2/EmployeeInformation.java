package com.kani.ram.application2;

public class EmployeeInformation  extends BankAccountDetails implements Employee_Interface{
     int empno;
     float sal;
     String address;
	
	// Interface methods overriding 
	public void employeeInfo(int empno,float sal) throws Exception {
		this.empno=empno;
		this.sal=sal;
		
	}
	public void employeeAddress(String address) {
		this.address=address;
		
	}
	public void employeeDetails() {
	  System.out.println("Employee No : "+empno);
	  System.out.println("Employee Sal :"+sal);
	  System.out.println("Employee Address :"+address);
	}
	
	// Abstract method overload
	public void accountDetails() {
		System.out.println("account : 1234567"); 
		
	}
	public void show() {
		System.out.println("Local method");
	}
	
	public static void main(String[] args) {
		try {
		EmployeeInformation emp1=new EmployeeInformation();
		//interface methods calling
		emp1.employeeInfo(100, 5500);
		emp1.employeeAddress("Bangalore");
		emp1.employeeDetails();
		//abstract class methods
		emp1.accountDetails();
		emp1.bankDetails();
		emp1.show();
		System.out.println("Bank---------RBI");
		//HAS-A
		BankRBI bank=new BankRBI();
		BankRBI bank1=new BankRBI(2, 2);
		BankRBI.getBankDetails();
		}
		catch (Exception e) {
			 System.out.println("I can handle  :"+e);
		}

	}

}
