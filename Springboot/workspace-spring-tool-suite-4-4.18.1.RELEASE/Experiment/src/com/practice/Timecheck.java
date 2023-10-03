package com.practice;
import java.util.Scanner;
public class Timecheck {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Please enter time. (in 24hr format)");
int t = sc.nextInt();
String time= null;
if (t>=6 && t<12) {
time= "Morning";
}

else if(t>=12 && t<17) {

time= "Afternoon";

}

else if(t>=17 && t<21) {

time= "Evening";

}

else {

time ="Night";

}

switch (time) {

case "Morning":

System.out.println("Good Morning");

break;

case "Afternoon":

System.out.println("Good Afternoon");

break;

case "Evening":

System.out.println("Good Evening");

break;

case "Night":

System.out.println("Good Night");

break;



default:

break;
}

}



}


