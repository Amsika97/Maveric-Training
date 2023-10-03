package com.practice;
import java.util.ArrayList;

import com.practice.Employee;
//import java.util.Scanner;
@FunctionalInterface
interface SalaryCalculator{  
	double calculateSalary(double hourlyRate, double hoursWorked);  
}  
public class Exampleapi implements SalaryCalculator  {
	public double calculateSalary(double hourlyRate, double hoursWorked)
	{
		double calcsal = hourlyRate*hoursWorked;
		System.out.println("Calculated Salary of a day = " + calcsal );
		return calcsal;
		
	}
	public void calculateSalaries()
	{ 
		ArrayList <Employee> name = new ArrayList <Employee>();
		name.add(new Employee("Rajesh", 100, 8));
		name.add(new Employee("Amrita", 200, 9));
		name.add(new Employee("Sakshi", 100, 10));
		name.add(new Employee("Smita", 100, 10 ));
		name.add(new Employee("Ramesh", 50, 10));
		SalaryCalculator abc = (hourlyRate, hoursWorked) -> hourlyRate * hoursWorked;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exampleapi e = new Exampleapi();  
        e.calculateSalary(100,8);
        SalaryCalculator calc = (a, b) -> { return a*b*6; };
        System.out.println("Through lambda expresssion = " + calc.calculateSalary(100, 8));
	}

}
