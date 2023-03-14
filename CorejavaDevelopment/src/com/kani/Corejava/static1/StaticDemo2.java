package com.kani.Corejava.static1;

public class StaticDemo2 {
	//static block
	static {
		System.out.println("static block,......will be Implicitly called");
	}
//Static variable
	static String countryName="India";
	static public void mydata() //static method
	{
		System.out.println("mydata:static method");
		
	}
	public void show()//Non- static method
	{
		System.out.println("mydata:Non-static method");
	}
	public static void main(String[] args) {

  StaticDemo2.mydata();
  System.out.println(StaticDemo2.countryName);
		
	}

}
