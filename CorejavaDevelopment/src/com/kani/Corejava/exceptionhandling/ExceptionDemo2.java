package com.kani.Corejava.exceptionhandling;

public class ExceptionDemo2 {
	String name="null";
	public void myData()
	{
		System.out.println(name.length());
	}

	public static void main(String[] args) {
		ExceptionDemo2 ed=new ExceptionDemo2();
		ed.myData();

	}

}
