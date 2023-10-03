package com.practice;

public class Abc {
	/* public void display(String s)
     {
     	System.out.println("String"); 
     }*/
	 public void display(Integer i)
     {
     	System.out.println("Integer"); 
     }
	 public void display(Object o)
     {
     	System.out.println("Object"); 
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc a =new Abc();
        a.display(null);
	}

}
