package com.kani.Corejavaoops;

public class Calculation2 {
	int a=10,b=20,c;//Attributes
	public void addition()
	{
		c=a+b;
		System.out.println("Addition is:"+c);
	}
	public void mul()
	{
		c=a*b;
		System.out.println("Multiplication is:"+c);
	}
	public void sub()
	{
		c=a-b;
		System.out.println("Subtraction is:"+c);
	}
	public void divi()
	{
		c=a%b;
		System.out.println("Division is:"+c);
	}
	public static void main(String[] args) {
		
		Calculation2 cal1=new Calculation2();
		cal1.addition();
		cal1.mul();
		cal1.sub();
		cal1.divi();
		//System.out.println(cal1.a);
	

	}

}
