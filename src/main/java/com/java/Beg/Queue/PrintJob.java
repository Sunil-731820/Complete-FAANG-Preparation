package com.java.Beg.Queue;

public class PrintJob {
	
	private int jobId;
	private String documentName;
	
	public PrintJob(int jobId, String documentName) {
		this.jobId = jobId;
		this.documentName = documentName;
	}
	
	public String toString() {
		return "JOB ID :"+ jobId + " " + "Document name is :"+documentName;
	}

}
