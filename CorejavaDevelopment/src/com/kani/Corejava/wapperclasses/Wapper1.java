package com.kani.Corejava.wapperclasses;

public class Wapper1 {
	public static void main(String[] args) {
	        int i=100;
	        long l=200;
	       float f=4.5f;
	        double d=6.5;
	        String str="hello";  
	         int i1;
	         long l1;
	         float f1;
	         double d1;
	            //values convert into Wrapper classes objects
	         Integer intVal    = new Integer(i);
	         Long   longVal =new Long(l);
	         Float    floatVal = new Float(f); 
	         Double doubleVal= new Double(d);           
	           // retrive the values into Wrapper classes objects
	         i1=intVal.intValue();
	         l1=longVal.longValue();
	         f1=floatVal.floatValue();
	         d1=doubleVal.doubleValue();
	         System.out.println("Integer Value"+i1);
	         System.out.println("Long Value"+l1);
	         System.out.println("Float Value "+f1);
	         System.out.println("Double Value"+d1);       
	}
	}
