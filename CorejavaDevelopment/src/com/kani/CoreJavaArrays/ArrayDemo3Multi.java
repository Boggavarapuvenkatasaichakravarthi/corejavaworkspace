package com.kani.CoreJavaArrays;

public class ArrayDemo3Multi {

	public static void main(String[] args) {
		int k=1;
		int arr1[][]=new int[5][5];
        for(int i=0;i<5;i++)
        {
        	for(int j=0;j<5;j++)
        	{
        		arr1[i][j]=k;
        		k++;
        	
        	}
        		
        }
        for(int i=0;i<5;i++)
        {
        	System.out.println();
        	
        
        for(int j=0;j<5;j++)
        {
        	System.out.print(" "+arr1[i][j]);
        }
	}
	}
	

}
