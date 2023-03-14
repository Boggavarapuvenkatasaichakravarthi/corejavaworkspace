package com.kani.Corejava.comparable.comparator;

import java.util.Comparator;

public class PersonSorting implements Comparator{


	public int compare(Object obj1,Object obj2)
	{
		PersonBean p1=(PersonBean)obj1;
		PersonBean p2=(PersonBean)obj2;
		      
		
		  return p1.getFirstName().compareTo(p2.getFirstName());
		 // return p1.getLastName().compareTo(p2.getLastName());
		// return p1.age - p2.age;//if your are using integer this is way
		  
	}
}

