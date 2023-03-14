package com.kani.Corejavaoops;

public class Person {
	String pname="Sai";
	int age=20;
	String address="Guntur";
	public void display()
	{
		System.out.println("Person Name:"+pname);
		System.out.println("Person Age:"+age);
		System.out.println("Person Address:"+address);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();
		p1.display();

	}

}
