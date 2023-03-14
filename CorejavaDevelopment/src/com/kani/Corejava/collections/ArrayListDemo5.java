package com.kani.Corejava.collections;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo5 {

	public static void main(String[] args) {
  ArrayList<Integer> mylist=new ArrayList<Integer>();    
		mylist.add(10);
		//mylist.add("Ravi");
		mylist.add(45);
		mylist.add(10);
		System.out.println(mylist);
		Iterator i1=mylist.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}

}
