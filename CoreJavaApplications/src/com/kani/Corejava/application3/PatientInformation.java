package com.kani.Corejava.application3;

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
	  System.out.println("Patient No : "+pno);
	  System.out.println("Patient Name :"+name);
	  System.out.println("Patient Address :"+address);
	}
	
	// Abstract method overload
	public void DoctorDetails() {
		System.out.println("Cardiologist-Doctor: Sai..."); 
            System.out.println("Dermatologist-Doctor: Sree..."); 
            System.out.println("Psychiatrist-Doctor: Sam..."); 	
	}
	public void show() {
		System.out.println("Local method");
	}
	
	public static void main(String[] args) {
		try {
		PatientInformation emp1=new PatientInformation();
		//interface methods calling
		emp1.patientInfo(100, "DOT");
		emp1.patientAddress("Bangalore");
		emp1.patientDetails();
		//abstract class methods
	 System.out.println("/........Details of Doctors........../");
        emp1.DoctorDetails();
		emp1.hospitalDetails();
		emp1.show();
		System.out.println(".......Hospital---------R...");
		//HAS-A
		HospitalR H=new HospitalR();
		HospitalR H1=new HospitalR(123456789);
		HospitalR.getHospitalDetails();
		}
		catch (Exception e) {
			 System.out.println("I can handle  :"+e);
		}

	}

}
