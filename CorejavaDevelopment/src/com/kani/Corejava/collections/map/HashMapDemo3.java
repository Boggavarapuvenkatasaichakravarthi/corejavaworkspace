package com.kani.Corejava.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo3 {

	public static void main(String[] args) {
		HashMap<Integer,String> mymap=new HashMap<Integer,String>();
	     mymap.put(100,"Java");
	     mymap.put(200,"Jdbc");
	     mymap.put(300,"Java Frame wroks");
	     mymap.put(null,"Hello");
	     mymap.put(400,null);
	     System.out.println(mymap);
	     for(Map.Entry m:mymap.entrySet())
	     {
	    	System.out.println("keys:"+m.getKey()+"values:"+m.getValue()); 
	     }
	}

}
