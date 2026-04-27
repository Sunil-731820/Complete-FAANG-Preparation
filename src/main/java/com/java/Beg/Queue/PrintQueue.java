package com.java.Beg.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class PrintQueue {
	
	private Queue<PrintJob> queue = new LinkedList<PrintJob>();
	
	
//	Add job To the Queue
	public void addJob(PrintJob job) {
		queue.offer(job);
		System.out.println("Added Job is :"+job);
	}
	
//	Print Next Job 
	public void printJob() {
		if(queue.isEmpty()) {
			System.out.println("there is no Job In Queue okay ....");
		}else {
			PrintJob job = queue.poll();
			System.out.println("Printing -> "+job);
		}
	}
	
	
//	Display the Remaining jobs
	
	public void showQueue() {
		System.out.println("Current Queue : ");
		for(PrintJob job : queue) {
			System.out.println(job);
		}
	}

}
