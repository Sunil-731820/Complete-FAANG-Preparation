package com.java.dsa.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class RealTimeSchedulerFunctionality {
	
	private static Queue<ScheduledTask> scheduledTasksQueue = new PriorityQueue<>();
	ScheduledTask task = new ScheduledTask();
	private static Scanner scanner = new Scanner(System.in);
	public void addTasktoQueue() {
		System.out.println("calling the Add method to add the Task in Queue");
		System.out.println("Please ENter The task name ");
		String taskName = scanner.nextLine();
		System.out.println("Please ENter the priority for this Task ");
		int prioritytask = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Please ENter The Discription for This task okay");
		String Description = scanner.nextLine();
		scheduledTasksQueue.add(new ScheduledTask(taskName, prioritytask, Description));
		System.out.println("The Task is Added Successfully :");
		
		
	}
	public void updateTaskInQueue() {
		
		
	}
	public void deleteTaskInQueue() {
		
		
	}
	public void viewAllTaskfromQueue() {
		System.out.println("Calling the view All task From Queue method ");
		Iterator itr = scheduledTasksQueue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	

}
