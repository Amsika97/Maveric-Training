package Assessmentques;

public class DuplicateString {

		public static void main(String[] args) {
		String abc = "Good Afternoon all";
		String[] car = {"Alto", "Wagonar", "Alto", "Renault", "Honda", "Innova"};

		// Find and print duplicate characters in a string
		findAndPrintDuplicateCharacters(abc);

		System.out.println();

		// Find and print duplicate characters in a string array
		for (String str : car) {
		findAndPrintDuplicateCharacters(str);
		}
		}

		public static void findAndPrintDuplicateCharacters(String input) {
		// Convert the input string to lowercase to ignore case sensitivity
		input = input.toLowerCase();

		// Create an array to store the count of each character (assuming ASCII characters)
		int[] charCount = new int[256];

		// Iterate over each character in the input string
		for (int i = 0; i < input.length(); i++) {
		char ch = input.charAt(i);
		// Increment the count for the corresponding character
		charCount[ch]++;
		}

		System.out.print("Duplicate characters in '" + input + "': ");
		for (int i = 0; i < charCount.length; i++) {
		if (charCount[i] > 1) {
		System.out.print((char) i + " ");
		}
		}
		}
		
}
