package com.kani.CorejavaGeneral;

import java.util.Scanner;

public class ScannerDemo1 {

	public static void main(String[] args) {
		int sno=0;
		String Sname=null;
		int age=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Student Number:");
		sno=sc.nextInt();
		System.out.println("Enter the Student Name:");
		Sname=sc.next();
		System.out.println("Enter the Student Age:");
		age=sc.nextInt();
		System.out.println("Enter the Student Number:"+sno);
		System.out.println("Enter the Student Name:"+Sname);
		System.out.println("Enter the Student Age:"+age);
		

	}

}
