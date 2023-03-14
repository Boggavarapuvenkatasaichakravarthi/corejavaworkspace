package com.kani.CorejavaGeneral;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String args[]){
		int i,n,low,mid,high,search;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Elements you want to read:");
		n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the Elements into Arrary is in SortedForm:");
		for(i=0;i<n;i++) {
			a[i]=s.nextInt();
			}
		System.out.println("Enter the Search Element:");
		search=s.nextInt();
		low=0;
		high=n-1;
		while(low<=high){
			mid=(int)(low+high)/2;
			if(search==a[mid]) {
				System.out.println(" Search Element is Found:");
				break;
					}
			else if(search<a[mid]) {
				high=mid-1;
				
			}
			else {
				low=mid+1;
				
			}
		}
		if(low>high) {
			System.out.println("Search Element is not present in the List");

		}
			
		}
}
