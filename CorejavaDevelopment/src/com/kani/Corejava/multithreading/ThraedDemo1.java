package com.kani.Corejava.multithreading;
class MyProducts  extends Thread{
	  
	  public void run() {
		  for(int i=1;i<100;i++)
			  System.out.println(i);
	  }
	  
}

public class ThraedDemo1 {
	
	
	public static void main(String[] args) {
		
		MyProducts t1=new MyProducts();
		t1.start();
		MyProducts t2=new MyProducts();
		t2.start();
		 
		 
	}

}