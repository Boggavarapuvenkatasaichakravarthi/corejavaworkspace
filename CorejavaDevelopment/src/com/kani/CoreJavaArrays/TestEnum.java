package com.kani.CoreJavaArrays;

enum ExamResult{
	Pass,Fail,Absent
}
public class TestEnum {

	public static void main(String[] args) {
		ExamResult e= ExamResult.Pass;
		System.out.println(e);
		ExamResult arr[]=ExamResult.values();
		for(ExamResult e1:arr) {
			//System.out.println(e1);
			System.out.println(e1+"-"+e1.ordinal());

			
		}
		
		
	}

}
