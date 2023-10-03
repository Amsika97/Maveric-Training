package Internationalization_Locales_ResoBund_Demo;
import java.util.*; 
import java.text.*;
public class Locales_Date_Format_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create Locale Class Object
		Locale l=new Locale("en","US"); 
		//Create DateFormat Class Object
		DateFormat df = DateFormat.getDateInstance(0, l);
	    // getDateInstance(date_style, locale_objects)
		// Representing Date in Locales
		System.out.println(df.format(new Date()));
		//new Date()---> Representing current sysdate
		
		DateFormat df1 = DateFormat.getDateInstance(1, l);
		System.out.println(df1.format(new Date()));
		DateFormat df2 = DateFormat.getDateInstance(2, l);
		System.out.println(df2.format(new Date()));
		DateFormat df3 = DateFormat.getDateInstance(3, l);
		System.out.println(df3.format(new Date()));
	/*	DateFormat df4 = DateFormat.getDateInstance(4, l);
		System.out.println(df4.format(new Date())); */
//Generate exception  java.lang.IllegalArgumentException because above 3 we cannot pass date_style


	}

}
