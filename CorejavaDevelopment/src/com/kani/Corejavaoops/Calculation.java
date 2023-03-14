package com.kani.Corejavaoops;

public class Calculation {
	int a=10,b=20,c;//Attributes
	public void addition()//methods//4
	{
		c=a+b;//Business Logic//5
		System.out.println("Addition is:"+c);//6
	}

	public static void main(String[] args) {//1
		//object Reference                //Object Creation//2
		Calculation cal1=new Calculation();//3
		cal1.addition();
		System.out.println(cal1.a);//7
	

	}//Main method//8

}//Class Close//9
