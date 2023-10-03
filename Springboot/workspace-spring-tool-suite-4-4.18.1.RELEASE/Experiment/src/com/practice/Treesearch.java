package com.practice;
import java.util.*;

public class Treesearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet <Integer> search = new TreeSet <Integer> ();
		search.add(3);
		search.add(4);
		search.add(5);
		search.add(7);
		search.add(8);
		search.add(9);
		search.add(2);
		
		System.out.println("TreeSet Elements are: -" + search);
		 for(int i : search)
		 {
			 if(i<7)
			 {
				 System.out.println("Number less than 7:"+i);
			 }
		 }
		 
		 int k = search.ceiling(7);
		 System.out.println("Number less than 7->"+k);
		

	}

}
