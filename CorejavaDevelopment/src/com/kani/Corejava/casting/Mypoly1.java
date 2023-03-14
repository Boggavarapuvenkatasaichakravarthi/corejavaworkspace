package com.kani.Corejava.casting;


class A
{
	public void test()
	{
          System.out.println("A");
	}
}
 class B extends A
{
	public void test()// overriding 
	{
         System.out.println("B");
	}
}
public class Mypoly1 
{
	public static void main(String[] args) 
	{
       A  a1=new A();
	      a1.test(); // output is A
       B  b1=new B();
	      b1.test(); // output is B

       A  a2=new B(); // implicity casting(widening) or upCasting
	      a2.test();  // output is B
	      
	  // B  b3=new A(); // it is compile error can't convert u must type cast.     
//  B  b4=(B)new A(); // explicity casting Narrowing    or downcasting 
  // no compile time  error but runtime error java.lang.ClassCastException : A	
  //java.lang.ClassCastException it is Unchecked Exception   
 	   A a3;
 	     a3=(A)new B(); 	     
 	   B b5=(B)a3;   	   
 	   b5.test(); //output is B
 	 // Note 1:     this program if you comment B class of test method what happen
 	  // compile and out put is :----      A A A A   
 	   // Note 2:this program if you comment A class of test method what happen
 	   // Undefine type A  . It is compile time error 
 	   
	}
}



