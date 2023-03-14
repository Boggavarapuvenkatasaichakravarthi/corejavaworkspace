package com.kani.Corejava.collections;

import java.util.ArrayList;

public class WrapperClassDemo {

	public static void main(String[] args) {
         int a=10;
         Integer i1=new Integer(a);
         System.out.println(i1);
         int k;
          k=i1.intValue();
          System.out.println("K value is:"+k);
          ArrayList mylist=new ArrayList();
          mylist.add(i1);
          System.out.println(mylist);
		
	}

}
