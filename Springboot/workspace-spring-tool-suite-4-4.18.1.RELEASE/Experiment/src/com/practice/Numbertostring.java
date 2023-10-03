package com.practice;
import java.util.Scanner;
public class Numbertostring {
	public static void main(String[] args) {
 
	int n;
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number b/w 1 to 999: ");	
	n=sc.nextInt();
	 if (n<0  || n>999) {
		 System.out.println("Invalid input!!!!! "); 
	 
	 }
	 else {
		 int u = n%10; /// unit digit
		 int t = n/10;
		 int s = t%10; /// tens digit
		 int r = n/100; /// hundred digit
		 String[] units = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine","ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
		 String[] tens = { "", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
		 String hund = "Hundred";
		 
	 if(n<20) 
	 { 
		 System.out.println(units[n]);
	}
	 else if(n<100)
	 {
		 System.out.println(tens[s]+" "+units[u]);
	 }
	 else
	 {
		 System.out.println(units[r]+" "+hund+" "+tens[s]+" "+units[u]); 
	 }
	 }
}
}
	
 