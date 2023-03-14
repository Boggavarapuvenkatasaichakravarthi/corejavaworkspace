package com.kani.Corejava.strings;

public class StringDemo1 {

	public static void main(String[] args) {

		String str1=new String("Java");
		String str2=new String("Java");
		if(str1==str2)
		{
			System.out.println("True");
			
		}
		else {
			System.out.println("False");
			
		}
		if(str1.equals(str2))
		{
			System.out.println("True");
			
		}
		else {
			System.out.println("False");
			
		}
	}

}
