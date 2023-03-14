package com.kani.CorejavaGeneral;

import java.util.Scanner;

public class EvenAndOddNumber {
	public static void main(String args[]){  
		int n,i=2;

		System.out.println("Enter the N Value:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n%i==0)
		{
			System.out.println("Given number is EvenNumber");

		}
		else {
			System.out.println("Given number is OddNumber");

		}
	}
}
