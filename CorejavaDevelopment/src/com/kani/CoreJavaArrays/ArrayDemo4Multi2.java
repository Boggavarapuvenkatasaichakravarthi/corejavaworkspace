package com.kani.CoreJavaArrays;

public class ArrayDemo4Multi2 {

	public static void main(String[] args) {
		String arr1[][]=new String[5][5];
        for(int i=0;i<5;i++)
        {
        	for(int j=0;j<5;j++)
        	{
        		arr1[i][j]="JAVA";
        	
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
