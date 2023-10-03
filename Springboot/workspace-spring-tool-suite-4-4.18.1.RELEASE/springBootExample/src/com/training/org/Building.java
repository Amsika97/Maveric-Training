package com.training.org;

import java.util.ArrayList;

public class Building {
	private String buildingName;
	private ArrayList<Floor> floor_number;
	
	public Building() {
		System.out.println("Default construtor of Building is called");
		buildingName="";
		floor_number=new ArrayList<Floor>();
	}
	
	public Building(String buildingName, ArrayList<Floor> floor_number) {
		System.out.println("Parameterised construtor of Building is called");
		this.buildingName = buildingName;
		this.floor_number = floor_number;
	}

	@Override
	public String toString() {
		return "Building [buildingName=" + buildingName + ", floor_number=" + floor_number + "]";
	}
	
	
	
	
	
	
}