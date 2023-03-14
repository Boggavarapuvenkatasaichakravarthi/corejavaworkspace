package com.kani.Corejava.collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo7 {

	public static void main(String[] args) {
   HashSet<String> myset=new HashSet<String>();    
		myset.add("Ram");
		myset.add("Ravi");
		myset.add("sai");
		myset.add("Sam1");
		System.out.println(myset);
		//Iterator i1=myset.iterator();
		//while(i1.hasNext())
		//{
			//System.out.println(i1.next());
		//}
		for(String s:myset)
		{
			System.out.println(s);
		}
	}

}
