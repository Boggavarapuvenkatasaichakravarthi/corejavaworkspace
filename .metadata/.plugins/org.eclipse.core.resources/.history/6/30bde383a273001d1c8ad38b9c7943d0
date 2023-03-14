package com.kani.Corejava.exceptionhandling;

public class ExceptionDemo4 {
	String name="null";
	int n=2;
	public void myData()
	{
		try {
			System.out.println("Open Connections");
			System.out.println("One");
			System.out.println(name.length());
			n=10/2;
			System.out.println(n);
			System.out.println("End");
			System.out.println("Close Connections");
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
     finally {
    	 System.out.println("Close Connections");
     }

	}

	public static void main(String[] args) {
		ExceptionDemo4 ed=new ExceptionDemo4();
		ed.myData();

	}

}
