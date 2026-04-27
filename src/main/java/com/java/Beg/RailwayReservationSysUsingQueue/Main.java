package com.java.Beg.RailwayReservationSysUsingQueue;

public class Main {
	public static void main(String[] args) {
		System.out.println("this is the Example of the Ticket Reservations Sysytem using Queue And LinkedList ...");
		
		RailwayReservationSystem railwayReservationSystem = new RailwayReservationSystem(2);
		
		Passenger p1 = new Passenger(1, "Sunil");
		Passenger p2 = new Passenger(2, "Harish");
		Passenger p3 = new Passenger(3, "Subham");
		Passenger p4 = new Passenger(4, "Rakesh");
		
		System.out.println("calling the Waiting List Data first ...");
		railwayReservationSystem.showTicket();
		
		railwayReservationSystem.bookTicket(p1);
		railwayReservationSystem.bookTicket(p2);
		railwayReservationSystem.bookTicket(p3);
		railwayReservationSystem.bookTicket(p4);
		
		railwayReservationSystem.showTicket();
		
		railwayReservationSystem.cancelTicket();
		railwayReservationSystem.showTicket();

		
	}

}
