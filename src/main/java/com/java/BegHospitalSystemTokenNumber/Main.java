package com.java.BegHospitalSystemTokenNumber;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("This is the Example of the Hospital Token System using Queue");
		HospitalTokenSystem hospitalTokenSystem = new HospitalTokenSystem();
		hospitalTokenSystem.addpatient(new Patient(1, "RAVI"));
		hospitalTokenSystem.addpatient(new Patient(2,"ANITA"));
		hospitalTokenSystem.addpatient(new Patient(3,"PRIYA"));
		hospitalTokenSystem.addpatient(new Patient(4,"SEXENA"));
		
		hospitalTokenSystem.showAllPatients();
		
//		Now Calling the Next patients 
		hospitalTokenSystem.callNextPatient();
		
//		Now Showing All Tokens 
		hospitalTokenSystem.showAllPatients();
		
	}

}
