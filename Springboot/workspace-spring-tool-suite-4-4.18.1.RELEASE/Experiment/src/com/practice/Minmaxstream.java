package com.practice;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Minmaxstream {

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
		number.add(1);
		number.add(11);
		number.add(12);
		number.add(3);
		number.add(14);
		number.add(15);
		number.add(16);
		number.add(1);
		number.add(8);
		number.add(19);
		number.add(20);
		System.out.println("Number in the list = "+number);
		int a = number.stream().min(Integer::compare).get();
		System.out.println("Minimum number in the list = "+a);
		int b = number.stream().max(Integer::compare).get();
		System.out.println("Mimum number in the list = "+b);
		

	}

}
