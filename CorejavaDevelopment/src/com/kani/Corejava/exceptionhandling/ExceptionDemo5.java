package com.kani.Corejava.exceptionhandling;

public class ExceptionDemo5 {
	String name="null";
	int n=0;
	public void myData() throws Exception{
		System.out.println("Open Connections");
		System.out.println("One");
		System.out.println(name.length());
		n=10/0;
		System.out.println(n);
		System.out.println("End");
		System.out.println("Close Connections");
	}
	

	public static void main(String[] args) {
		try {
		ExceptionDemo5 ed=new ExceptionDemo5();
		ed.myData();
		}
       catch(Exception e) {
    	   System.out.println("I can handle :"+e);
       }
	}

}
