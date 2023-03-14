package com.kani.Corejava.comparable.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentSorting {

	public static void main(String[] args) {
		 
		ArrayList<Student> al=new ArrayList<Student>();
		
		 al.add(new Student(100,"Ravi",28));
		 al.add(new Student(10,"Anu",20));
		 al.add(new Student(20,"Murli",3));
		 
		 Collections.sort(al);
		 for(Student st:al) {
			 System.out.println("Roll No: "+st.rollno+"Name : "+st.name+" Age :"+st.age);
		 }
		
	}

}
