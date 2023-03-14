package com.kani.CorejavaGeneral;

import java.util.Scanner;

public class PalindromeExample {
	public static void main(String args[]){  
		  int r,sum=0,temp;    
		  int n;//It is the number variable to be checked for palindrome  
		  System.out.println("Enter the N value:");
		  Scanner sc =new Scanner(System.in);
		  n=sc.nextInt();
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("Given Number is a palindrome number ");    
		  else    
		   System.out.println("Given Number is not a palindrome");    
		}  

}
