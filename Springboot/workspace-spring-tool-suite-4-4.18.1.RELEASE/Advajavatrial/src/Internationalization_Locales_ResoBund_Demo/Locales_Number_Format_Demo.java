package Internationalization_Locales_ResoBund_Demo;
import java.util.*; 
import java.text.*;
public class Locales_Number_Format_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create Locale Class Object
		Locale l=new Locale("it","IT"); 
		//Create NumberFormat Class Object
		NumberFormat nf=NumberFormat.getInstance(l);
		//Representing number as per locale
		System.out.println(nf.format(1234567.3456));

	}

}
