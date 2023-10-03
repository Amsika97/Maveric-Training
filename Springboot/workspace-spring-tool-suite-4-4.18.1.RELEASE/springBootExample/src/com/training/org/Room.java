package com.training.org;

public class Room {
	
	
	private double length;
	private double width;
	private double height;
	private String roomName;
	public Room() {
		System.out.println("Default constructor of room is called");
		length=0;
		width=0;
		height=0;
		roomName="";
	}
	public Room(double length, double width, double height,String roomName) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
		this.roomName=roomName;
	}
	@Override
	public String toString() {
		return "Room details are "+this.roomName+" "+this.length+" "+this.width+" "+this.height;
	}

}
