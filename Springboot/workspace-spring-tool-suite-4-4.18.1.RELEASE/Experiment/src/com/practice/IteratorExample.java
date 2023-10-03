package com.practice;

import java.util.*;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		LinkedList car = new LinkedList();
		car.add("Alto");
		car.add("Wagaonor");
		car.add("Audi");

		System.out.println("for traversing forward:-");	
		ListIterator namesIterator = car.listIterator();
		while (namesIterator.hasNext()) {
			System.out.println(namesIterator.next());
		}
		System.out.println("for traversing Previous:-");
		while (namesIterator.hasPrevious())
		{
			System.out.println(namesIterator.previous());
		}

	}

}
