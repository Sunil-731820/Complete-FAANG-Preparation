package com.java.dsa.queue;

import java.util.Scanner;

public class MainQueue {
	
	private static RealTimeSchedulerFunctionality func = new RealTimeSchedulerFunctionality();
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("this is the main function of The Queue okay");
		
		Scanner scanner =  new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("Please Enter 1 for Adding the task to the Queue");
			System.out.println("Please Enter 2 for Updating the task to the Queue");
			System.out.println("Please Enter 3 for Deleting The Task to the Queue");
			System.out.println("Please Enter 4 for Viewing all the Task");
			System.out.println("Please Enter The choice from the Above one ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				func.addTasktoQueue();
				break;
			case 2:
				func.updateTaskInQueue();
				break;
			case 3:
				func.deleteTaskInQueue();
				break;
			case 4:
				func.viewAllTaskfromQueue();
			default:
				break;
			}
		}while(choice!=0);
	}
	

}
