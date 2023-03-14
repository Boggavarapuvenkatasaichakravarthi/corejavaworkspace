package com.kani.Corejava.multithreading;

class MyProducts2 implements Runnable 
{  	  
	  public void run() {
		  for(int i=1;i<100;i++)
			  System.out.println(i);
	  }
	  
}

public class ThreadDemo2 {
	
	
	public static void main(String[] args) {
		  
		MyProducts2 p2=new MyProducts2();
		
		  Thread t2=new Thread(p2);
		  t2.start();
		
		
		 
		 
	}

}