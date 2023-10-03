package com.practice;
import java.util.*;
import java.util.stream.Collectors;

public class Streamlist2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> name = new ArrayList <String>();
		name.add("Rajesh");
		name.add("Rohit");
		name.add("Amrita");
		name.add("Payal");
		name.add("Ritika");
		name.add("Sakshi");
		name.add("Smita");
		name.add("Ramesh");
        System.out.println("Name list is = " + name);
        List<String> name2 =name.stream().filter(p->p.startsWith("R")).collect(Collectors.toList());
        System.out.println("Name Start with 'R' = " + name2);
        List<String> name3 =name2.stream().map(p->p.toUpperCase()).collect(Collectors.toList());
        System.out.println("After Uppercasing = " + name3);
        List<String> name4 =name2.stream().sorted().collect(Collectors.toList());
        System.out.println("After Uppercasing = " + name4);
	}

}
