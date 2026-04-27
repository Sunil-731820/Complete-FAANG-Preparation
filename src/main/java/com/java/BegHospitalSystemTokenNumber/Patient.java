package com.java.BegHospitalSystemTokenNumber;

public class Patient {
	
	int tokenNumber;
	String patientName;
	
	public Patient(int tokenNumber, String patientName) {
		this.tokenNumber = tokenNumber;
		this.patientName = patientName;
	}
	
	public String toString() {
		return "Token Number is :" +tokenNumber + "Patients name is :"+patientName;
	}

}
