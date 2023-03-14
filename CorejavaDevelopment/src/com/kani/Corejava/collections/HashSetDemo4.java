package com.kani.Corejava.collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetDemo4 {

	public static void main(String[] args) {
  HashSet myset=new HashSet();   
		//TreeSet myset =new TreeSet();
		myset.add(10);
		myset.add("Ravi");
		myset.add(45.5);
		myset.add(10);
		System.out.println(myset);
		Iterator i1=myset.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}

}
