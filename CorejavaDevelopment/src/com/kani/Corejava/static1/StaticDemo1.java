package com.kani.Corejava.static1;

public class StaticDemo1 {
//Static variable
	static String countryName="India";
	static public void mydata() 
	{
		System.out.println("mydata:static method");
		
	}
	public void show()
	{
		System.out.println("mydata:Non-static method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  StaticDemo1.mydata();
  System.out.println(StaticDemo1.countryName);
		
	}

}
