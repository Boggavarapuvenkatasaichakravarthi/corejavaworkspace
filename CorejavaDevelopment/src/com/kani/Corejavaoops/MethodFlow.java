package com.kani.Corejavaoops;

public class MethodFlow {
	public void show()
	{
		System.out.println("No parameters with no Return values");
		System.out.println("This is a show 	method");
		
	}//parameters with no return values
	public void addition(int a,int b)
	{
		int c=a+b;
		System.out.println("addition:"+c);
		
		
	}//parameters with return values
	public int mul(int a,int b)
	{
		return a*b;
		
		
	}
	//no parameters with return values
	public int userLogin()
	{
		return 100;
		
		
	}

	public static void main(String[] args) {
		MethodFlow mf=new MethodFlow();
		mf.show();
		mf.addition(10,20);
		int t=mf.mul(2,2);
		System.out.println("mul:"+t);
		int k=mf.userLogin();
		System.out.println("k value:"+k);

		

	}

}
