package com.kani.Corejava.final1;

public class FinalDemo1 {
 final String countryName="India";
 public void show()
 {
	 //The final field FinalDemo1.countryName cannot be assigned
	//countryName="USA";
	 System.out.println(countryName);
 }
	public static void main(String[] args) {
		FinalDemo1 fd=new FinalDemo1();
		fd.show();

	}

}
