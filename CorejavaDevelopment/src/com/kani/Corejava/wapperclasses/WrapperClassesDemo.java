package com.kani.Corejava.wapperclasses;

import java.util.ArrayList;

public class WrapperClassesDemo {
	public static void main(String[] args) {
		 int a=10;
		 
		Integer i1=new Integer(a);
		System.out.println(i1);
		int k;
		k=i1.intValue();
		System.out.println("K value :"+k);
				
		ArrayList myList=new ArrayList();
		myList.add(i1);
		System.out.println(myList);

	}
}
