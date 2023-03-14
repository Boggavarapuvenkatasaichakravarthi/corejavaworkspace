package com.kani.Corejavaoops;

import java.util.Scanner;

public class Person2 {
	String pname;
	int age;
	String address;
	public void accessvalues()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Person Name:");
		pname=sc.next();
		System.out.println("Person Age:");
		age=sc.nextInt();
		System.out.println("Person Address:");
		address=sc.next();
		
		
		
	}
	public void display()
	{
		System.out.println("Person Name:"+pname);
		System.out.println("Person Age:"+age);
		System.out.println("Person Address:"+address);
		
	}

	public static void main(String[] args) {
		Person2 p2=new Person2();
		p2.accessvalues();
		p2.display();

	}

}
