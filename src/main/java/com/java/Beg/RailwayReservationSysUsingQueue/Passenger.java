package com.java.Beg.RailwayReservationSysUsingQueue;

public class Passenger {
	
	int id;
	String name ;
	
	public Passenger(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return "id" + id + " And Name is :"+name;
	}
	
	

}
