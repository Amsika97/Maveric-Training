package Calculation;
import java.util.Scanner;

public class Subtract {
	
	public static void main(String[] args){
        int inInt1;
        int inInt2;
        int outInt;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the First number to sub:");
        inInt1 = in.nextInt();
        System.out.println("Enter the Second number to sub:");
        inInt2 = in.nextInt();
        outInt = inInt1 - inInt2;
        
        System.out.println("Output:"+outInt);

    }

}
