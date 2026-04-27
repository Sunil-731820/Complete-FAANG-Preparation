package com.java.BegHospitalSystemTokenNumber;

import java.util.LinkedList;
import java.util.Queue;

public class HospitalTokenSystem {
	
	private Queue<Patient> queue = new LinkedList<Patient>();
	private int tokenCounter = 1;
	
//	Add patients to the Queue
	
	public void addpatient(Patient patient) {
		if(tokenCounter>0) {
			queue.offer(patient);
			System.out.println("Token Is Issue to Patients :");
		}else {
			System.out.println("Token Is not Valid .....");
		}
	}
	
//	Call Next patients 
	public void callNextPatient() {
		if(queue.isEmpty()) {
			System.out.println("No patient are Available for now ....");
		}else {
			Patient nextPatient = queue.poll();
			System.out.println("Now Consulting patient .. "+nextPatient);
		}
	}
	
//	Show All patients 
	
	public void showAllPatients() {
		if(queue.isEmpty()) {
			System.out.println("the QUEUE is EMPTY for NOW ..");
		}else {
			for(Patient p : queue) {
				System.out.println(p);
			}
		}
	}

}
