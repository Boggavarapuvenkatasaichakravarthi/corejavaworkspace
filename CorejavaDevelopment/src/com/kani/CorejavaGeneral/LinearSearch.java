package com.kani.CorejavaGeneral;

import java.util.Scanner;

public class LinearSearch {
public static void main(String args[]) {
	int i,n,search;
Scanner s= new Scanner(System.in);
System.out.println("Enter the Elements you want to read:");
n=s.nextInt();
int a[]=new int[n];
System.out.println("Enter the Elements into Arrary:");
for(i=0;i<n;i++) {
	a[i]=s.nextInt();
	}
System.out.println("Enter the Search Element:");
search=s.nextInt();
for(i=0;i<n;i++) {
	if(search==a[i]) {
		System.out.println("Element is Found");
		break;

	}
	
}
if(i==n) {
	System.out.println("Element is not Found");

}

}
}

