package com.kani.Corejava.final1;

final class Myclass3{
	 public void show()
	{
		System.out.println("Myclass method show by100 ");
	}
}

public class FinalDemo3 {
	//can not be override the final method from Myclass1
	final public void show()
	{
		System.out.println("Sub clss method show  ");
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalDemo3 fd3=new FinalDemo3();
		fd3.show();
		//Myclass3 m3=new Myclass3();
		//m3.show();
	}

}
