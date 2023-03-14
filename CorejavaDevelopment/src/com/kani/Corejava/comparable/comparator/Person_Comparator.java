package com.kani.Corejava.comparable.comparator;


import java.lang.String;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
  
 
 
public class Person_Comparator {

	public static void main(String[] args) {
		
		
		
		ArrayList list=new ArrayList();
		          list.add(new PersonBean("raj","mohan",23));
		          list.add(new PersonBean("tom","tan",20));
		          list.add(new PersonBean("abc","bbb",15));
		          list.add(new PersonBean("balu","aaaaa",22));
		          
		          System.out.println("Before Sort"+list);
		          Collections.sort(list,new PersonSorting());
		         
		          System.out.println("Sorting "+list); 	        	          	          
		          
	} }
