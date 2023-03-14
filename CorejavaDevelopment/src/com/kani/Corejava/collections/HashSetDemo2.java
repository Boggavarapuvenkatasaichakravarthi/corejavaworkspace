package com.kani.Corejava.collections;
import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
   HashSet myset=new HashSet();    
		myset.add(10);
		myset.add("Ravi");
		myset.add(45.5);
		myset.add(30.50);

		myset.add(10);
		System.out.println(myset);
	}

	
}
