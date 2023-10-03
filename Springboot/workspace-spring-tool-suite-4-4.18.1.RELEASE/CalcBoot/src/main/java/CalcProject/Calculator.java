package CalcProject;
import java.util.Scanner;

//import com.practice.Calculator;

public class Calculator {


	//System.out.println(" Enter 2 Numbers to perform operations:  ");
	
	
	public int add(int a,int b)
	{
		int c = a+b;
		
		System.out.println("Add = "+c);
		return c;
	}
	public int sub(int a,int b)
	{
		int c = a-b;
		System.out.println("Subtract = "+c);
		return c;
	}
	public int multiply(int a,int b)
	{
		int c = a*b;
		System.out.println("Multiply = "+c);
		return c;
	}
	
	public int division(int a,int b)
	{
		try 
		{
		int c = a/b;
		System.out.println("Divide = "+c);
		return c;
	}
		
	catch(Exception e)
	{ 
     System.out.println("Exception occur.....");
     return 0;
		
	}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator  calc = new Calculator();
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		
		int b = s.nextInt();
		calc.add(a,b);
		calc.sub(a,b);
		calc.multiply(a,b);
		calc.division(a,b);

	}

}
