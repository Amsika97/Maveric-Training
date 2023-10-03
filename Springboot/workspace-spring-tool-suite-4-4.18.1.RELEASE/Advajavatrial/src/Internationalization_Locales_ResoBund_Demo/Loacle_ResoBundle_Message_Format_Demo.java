package Internationalization_Locales_ResoBund_Demo;
import java.util.*;
public class Loacle_ResoBundle_Message_Format_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale l=new Locale("en","US"); 
		ResourceBundle rb=ResourceBundle.getBundle("abc",l); 
		System.out.println(rb.getString("welcome")); 
	}

}
