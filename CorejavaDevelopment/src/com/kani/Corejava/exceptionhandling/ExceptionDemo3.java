package com.kani.Corejava.exceptionhandling;

public class ExceptionDemo3 {
	String name="null";
	int n=2;
	public void myData()
	{
		try {
			System.out.println("One");
			System.out.println(name.length());
			n=10/2;
			System.out.println(n);
			System.out.println("End");
		}
		catch(NullPointerException e){
			System.out.println("I can Handle"+e);
			
		}
		catch(ArithmeticException e){
			System.out.println("I can Handle"+e);
			
		}
		catch(Exception e){
			System.out.println("I can Handle"+e);
			
		}


	}

	public static void main(String[] args) {
		ExceptionDemo3 ed=new ExceptionDemo3();
		ed.myData();

	}

}
