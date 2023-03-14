package com.kani.ram.application3;

public class PatientInformation  extends HospitalDetails implements Patient_Interface{
     int pno;
     String name;
     String address;
	
	// Interface methods overriding 
	public void patientInfo(int pno,String name) throws Exception {
		this.pno=pno;
		this.name=name;
		
	}
	public void patientAddress(String address) {
		this.address=address;
		
	}
	public void patientDetails() {
	  System.out.println("Employee No : "+pno);
	  System.out.println("Employee Name :"+name);
	  System.out.println("Employee Address :"+address);
	}
	
	// Abstract method overload
	public void DoctorDetails() {
		System.out.println("Doctor: Sai-Cardinality"); 
            System.out.println("Doctor: Sree-Dermotology"); 
            System.out.println("Doctor: Sam-Gastrology"); 	
	}
	public void show() {
		System.out.println("Local method");
	}
	
	public static void main(String[] args) {
		try {
		PatientInformation p1=new PatientInformation();
		//interface methods calling
		p1.patientInfo(100, "DOT");
		p1.patientAddress("Bangalore");
		p1.patientDetails();
		//abstract class methods
		p1.DoctorDetails();
		p1.hospitalDetails();
		p1.show();
		System.out.println("Hospital---------R...");
		//HAS-A
		HospitalR H=new HospitalR();
		HospitalR H1=new HospitalR(2, 2);
		HospitalR .getHospitalDetails();
		}
		catch (Exception e) {
			 System.out.println("I can handle  :"+e);
		}

	}

}
