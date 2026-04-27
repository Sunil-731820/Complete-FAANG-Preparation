package com.java.Beg.Queue;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("this is the Examnple of the print Job ....");
		
		
		PrintQueue printer = new PrintQueue();
		printer.addJob(new PrintJob(1, "Resume.pdf"));
		printer.addJob(new PrintJob(2, "report.docx"));
		printer.addJob(new PrintJob(3,"Invoice.xlsx"));
		
//		Printing the First Job From Queue Okay
		printer.printJob();
		
//		Showing All remaining job 
		
		printer.showQueue();
		
		
	}

}
