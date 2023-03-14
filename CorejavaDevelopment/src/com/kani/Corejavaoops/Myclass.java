package com.kani.Corejavaoops;

public class Myclass extends Calculation{
	public void show()
	{
		System.out.println("My class show Method");
	}

	public static void main(String[] args) {

Myclass my=new Myclass();
my.addition();
System.out.println(my.b);
my.show();
	}

}
