package com.practice;

public class Employee {
	private String name;
	private double hourlyRate;
	private double hoursWorked;
	
	public Employee(String name, double hourlyRate, double hoursWorked) {
		super();
		this.name = name;
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public double getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

}
