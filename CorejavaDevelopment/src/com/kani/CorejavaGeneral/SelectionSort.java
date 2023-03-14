package com.kani.CorejavaGeneral;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n,temp,min;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter how many Elements into selectionSort want to  read:");
		n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the Elements into Arrary:");
		for(i=0;i<n;i++) {
			a[i]=s.nextInt();
			}
        for(i=0;i<n-1;i++) 
        {
        	min=i;
        	for(j=i+1;j<n;j++)
        	{
        		if(a[j]<a[min]) 
        		{
        			min=j;
        			
        		}
        	}
        	temp=a[i];
        	a[i]=a[min];
        	a[min]=temp;
        	
        }
        System.out.println(" Elements After Sorting into Arrary:");
		for(i=0;i<n;i++) {
			System.out.println(a[i]);
			
		         }

	}

}
