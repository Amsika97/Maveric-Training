package com.practice;
import java.util.Scanner;

public class Calculator {	
	
	Scanner s = new Scanner(System.in);
	
	int a = s.nextInt();
	
	int b = s.nextInt();
	//System.out.println(" Enter 2 Numbers to perform operations:  ");
	
	
	void add()
	{
		int c = a+b;
		System.out.println("Add = "+c);
	}
	void sub()
	{
		int c = a-b;
		System.out.println("Subtract = "+c);
	}
	void multiply()
	{
		int c = a*b;
		System.out.println("Multiply = "+c);
	}
	void division()
	{
		int c = a/b;
		System.out.println("Divide = "+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator  calc = new Calculator();
		calc.add();
		calc.sub();
		calc.multiply();
		calc.division();

	}

}
