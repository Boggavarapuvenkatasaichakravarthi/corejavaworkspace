package com.kani.ram.application3;

public class HospitalR {
	
	 static {
		 System.out.println("Welcome to   MYHOSPITAL");
	 }
	 public HospitalR() {
		 System.out.println("ALL Types of Treatments and Surgeries Available HERE....");
	}
	 
	 public HospitalR(double p, double r) {
		  System.out.println(p*r/100);
	}
	 
	 public static final void getHospitalDetails() {
            System.out.println("MYHOSPITAL INFO.......");
            System.out.println("IT IS LOCATED IN ALL OVER INDIA");
		 System.out.println("24 DOCTORS Hours ALL AVAILABLE");
		 System.out.println("ContactNumber:9010319976");

	 }
}
