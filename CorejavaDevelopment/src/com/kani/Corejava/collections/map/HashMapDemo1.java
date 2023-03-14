package com.kani.Corejava.collections.map;

import java.util.HashMap;

public class HashMapDemo1 {

	public static void main(String[] args) {
     HashMap mymap=new HashMap();
     mymap.put(100,"Java");
     mymap.put(200,"Jdbc");
     mymap.put(300,"Java Frame wroks");
     mymap.put(null,"Hello");
     mymap.put(400,null);
     System.out.println(mymap);
     
	}

}
