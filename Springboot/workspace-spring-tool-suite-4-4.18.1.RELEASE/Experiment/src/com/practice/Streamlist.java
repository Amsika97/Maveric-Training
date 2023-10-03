package com.practice;
import java.util.*;
import java.util.stream.Collectors;
public class Streamlist {

	public static void main(String[] args) {
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
		System.out.println("Number in the stream = "+number);
		List<Integer> num2 =number.stream().filter(p->p%2==0).map(p->p).collect(Collectors.toList());
        System.out.println("Even number in the stream = "+num2);
        Double num3 =num2.stream().collect(Collectors.summingDouble(r->r/2));
        System.out.println("Avg of even number in the stream = " + num3);
        Double num4 =num2.stream().collect(Collectors.summingDouble(r->r));
        System.out.println("Sum of even number in the stream = " + num4);
        Map<Boolean, List<Integer>> num5 =number.stream().collect(Collectors.partitioningBy(n->n%3==0));
        System.out.println("partition method in the stream = " + num5);
	}

}
