package com.practice;
import java.util.ArrayList;
public class Comparearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList Flower = new ArrayList ();
		Flower.add("Rose");
		Flower.add("Jasmine");
		Flower.add("Periwinkle");
		System.out.println("Flower:"+Flower);
		
		ArrayList Bouquet = new ArrayList ();
		Bouquet.add("Rose");
		Bouquet.add("Jasmine");
		Bouquet.add("Periwinkle");
		System.out.println("Bouquet:"+Bouquet);
		
		ArrayList Color = new ArrayList ();
		Color.add("Red");
		Color.add("White");
		Color.add("Pink");
		System.out.println("Color:"+Color);
		
		Boolean check1 = Flower.equals(Bouquet);
		Boolean check2 = Color.equals(Flower);
		
		if (check1)
		{
			System.out.println("Identicals Array...." );
		}
		
		if(check2 == false)
		{
			System.out.println("Non Identicals Array...." );
		}

	}

}
