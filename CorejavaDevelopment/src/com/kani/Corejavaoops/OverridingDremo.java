package com.kani.Corejavaoops;
class Myclass1{
public void show()
{
	System.out.println("Myclass1 method show");
}
}

public class OverridingDremo extends Myclass1 {
	public void show()
	{
		System.out.println("SubClass method show");
	}

	public static void main(String[] args) {
		OverridingDremo od=new OverridingDremo();
             od.show();
	}

}
