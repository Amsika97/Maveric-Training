package Core_Java_Topics;
import java.io.*;

public class Console_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console c = System.console(); 
		String uname = c.readLine("User Name :"); 
		char[] pwd = c.readPassword("PassWord :"); 
		String upwd = new String(pwd); 
		 if(uname.equals("durga") && upwd.equals("durga")) 
		 { 
		 System.out.println("Valid User"); 
		 } 
		 else { 
		 System.out.println("InValid User"); 
	     }

	}

}
