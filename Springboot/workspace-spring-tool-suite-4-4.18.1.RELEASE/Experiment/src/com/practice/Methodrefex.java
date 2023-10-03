package com.practice;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Methodrefex {
	 
	public static void staticcase(){  
	        System.out.println("Hello, this is static method.");  
	    }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> number = new ArrayList <Integer>();
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
		number.add(5);
		number.add(6);
		number.add(7);
		number.add(8);
		number.add(9);
		number.add(10);
		number.add(11);
		number.add(12);
		number.add(13);
		number.add(14);
		number.add(15);
		number.add(16);
		number.add(17);
		number.add(18);
		number.add(19);
		number.add(20);
		System.out.println("Number in the list = "+number);
		IntSummaryStatistics num5 =number.stream().collect(Collectors.summarizingInt(Integer::intValue));
	        System.out.println("partition method in the stream = " + num5);

	}

}
