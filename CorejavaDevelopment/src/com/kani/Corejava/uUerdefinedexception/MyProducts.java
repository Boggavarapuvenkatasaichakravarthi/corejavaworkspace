package com.kani.Corejava.uUerdefinedexception;

public class MyProducts {
     int pno=105;
     public void myData() throws ProductNotFoundException {
    	 if(pno>=100)
    	 {
    		 throw new ProductNotFoundException("Product is not there");
    	 }
    	 else {
    		 System.out.println("Product is there");
    	 }
     }
	public static void main(String[] args) {
       try
       {
    	   MyProducts product1= new MyProducts();
    	   product1.myData();
       }
       catch(Exception e){
    	   System.out.println("I can Handle Exception:"+e);
       }
	}

}
