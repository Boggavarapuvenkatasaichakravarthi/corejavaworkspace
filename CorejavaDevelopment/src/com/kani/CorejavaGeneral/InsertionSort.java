package com.kani.CorejavaGeneral;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n,temp;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter howmany Elements yoy want to read:");
		n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the Elements into Arrary:");
		for(i=0;i<n;i++) {
			a[i]=s.nextInt();
			}
		for(i=1;i<n;i++) 
		{
			temp=a[i];
			for(j=i-1;j>=0;j--)
			{
				if(a[j]>temp)
				{
					a[j+1]=a[j];
				}
				else {
					break;
				}
             }
			a[j+1]=temp;
			
		}
		System.out.println(" Elements After Sorting into Arrary:");
		for(i=0;i<n;i++) {
			System.out.println(a[i]);
			
		         }


	}

}
