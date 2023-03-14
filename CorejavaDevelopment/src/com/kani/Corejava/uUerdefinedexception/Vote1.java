package com.kani.Corejava.uUerdefinedexception;

import java.util.Scanner;

public class Vote1 {
	int age=18;
	//Scanner sc=new Scanner(System.in);
	//System.out.println("Enter Age:");
	//age=sc.nextInt();
	
     public void myData() throws AgeException {
    	 if(age>=18)
    	 {
    		 throw new  AgeException("You are Eligible");
    	 }
    	 else {
    		 System.out.println("You are not Eligible");
    	 }
     }
	public static void main(String[] args) {
       try
       {
    	   
    	   Vote1 v1= new Vote1();
    	   v1.myData();
       }
       catch(Exception e){
    	   System.out.println("I can Handle Exception:"+e);
       }
	}

}
