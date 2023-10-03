package com.training.org;

import java.util.ArrayList;

public class Floor {
 private String floorNo;
 private ArrayList<Room> rooms;
public Floor() {
	System.out.println("Default constructor of floor is called");
}
public Floor(String floorNo, ArrayList<Room> rooms) {
	System.out.println("Parametrized constructor of floor is called");
	this.floorNo = floorNo;
	this.rooms = rooms;
}
@Override
public String toString() {
	return "Floor [floorNo=" + floorNo + ", rooms=" + rooms + "]";
}
 
 
 
}
