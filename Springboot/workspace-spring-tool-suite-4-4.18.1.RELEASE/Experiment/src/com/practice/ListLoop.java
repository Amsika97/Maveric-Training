package com.practice;
import java.util.*;
public class ListLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 LinkedList car = new LinkedList ();
 car.add("Alto");
 car.add("Wagaonor");
 car.add("Audi");
 
 System.out.println("List in right order:" + car.element());
 /* for (int i =car.size(); i>= 0; i--)
  {
	 car.element();
	}
	*/
 Iterator i=car.descendingIterator();  
 while(i.hasNext())  
 {  
     System.out.println(i.next());  
 }  

}
}
