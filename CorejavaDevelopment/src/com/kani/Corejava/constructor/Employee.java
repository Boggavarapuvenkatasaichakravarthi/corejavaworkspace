package com.kani.Corejava.constructor;

public class Employee {
Employee()
{
	System.out.println("Default Constructor");
}
public void show()
{
	System.out.println("Show Method");
}
	public static void main(String[] args) {
 new Employee();//Constructor calling
 Employee emp=new Employee();
 emp.show();//Method calling

	}

}
