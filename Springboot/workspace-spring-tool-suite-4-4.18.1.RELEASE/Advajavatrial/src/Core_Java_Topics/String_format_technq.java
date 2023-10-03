package Core_Java_Topics;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DecimalFormat;

public class String_format_technq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1. Formatting Strings: Using the '%s' placeholder to substitute a string value.
		String name = "John";
		String formattedString = String.format("Hello, %s!", name);
		System.out.println(formattedString);
//2. Formatting Numbers: Using the '%d' placeholder for integers and 
//   '%f' for floating-point numbers.Specifying numbers in %.2f means 2 decimal places
		int num = 10;
		double pi = 3.14159;
		String formattedNumber = String.format("Number: %d, Pi: %.2f", num, pi);
		System.out.println(formattedNumber); 
//3. Formatting Dates and Times: Using the SimpleDateFormat class to format dates and times.
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String formattedDate = sdf.format(currentDate);
		System.out.println("currentDate:  "+currentDate);
		System.out.println("formattedDate:: "+formattedDate);
//4. Padding and Alignment: Using the '%' flag to specify padding and alignment options.
		int num1 = 42;
		String paddedNumber = String.format("%5d", num1);
		System.out.println(paddedNumber);
		String alignedText = String.format("%-10s", "Java");
		System.out.println(alignedText);  
//5. Formatting Decimal Places:Using the DecimalFormat class to control the number of decimal places.
		double value = 3.14159;
		DecimalFormat df = new DecimalFormat("#.##");
		String formattedValue = df.format(value);
		System.out.println(formattedValue);
		
	}

}
