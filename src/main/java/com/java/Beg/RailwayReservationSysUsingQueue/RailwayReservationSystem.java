package com.java.Beg.RailwayReservationSysUsingQueue;

import java.util.LinkedList;
import java.util.Queue;

public class RailwayReservationSystem {
	
	private int totalSeats;
	private int bookedSeats = 0;
	
	private Queue<Passenger> waitingList = new LinkedList<Passenger>();
	
	
	public RailwayReservationSystem(int totalSeats) {
	this.totalSeats = totalSeats;	
	}
	
	
//	Book Ticket 
	
	public void bookTicket(Passenger passenger) {
		if(bookedSeats <totalSeats) {
			bookedSeats++;
			System.out.println("Ticket Booked for passenger With Given Details :"+passenger);
		}else {
		   waitingList.offer(passenger);
		   System.out.println("Added to WAITING LIST Soon you will get COnfirmations : "+passenger);
		}
	}
	
//	Cancel Ticket 
	public void cancelTicket() {
		if(bookedSeats >0) {
			bookedSeats--;
			System.out.println("Ticket is cancelled for given passenger ...");
			if(!waitingList.isEmpty()) {
				Passenger nextPassenger = waitingList.poll();
				bookedSeats++;
				System.out.println("WAITING TICKET IS BOOKED for given passenger ..."+nextPassenger);
			}
		}else {
			System.out.println("No SEAT TO CANCEL ...");
			
		}
	}
	
	
//	Show waiting List Ticket ..
	public void showTicket() {
		System.out.println("Current Waiting List Ticket is ....");
		for(Passenger p : waitingList) {
			System.out.println(p);
		}
	}

}
