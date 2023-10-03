package Advajavaassesment;

import java.util.Scanner;

import java.util.*;

 

public class Bracket_Sequence_Checker {
    public static int checkBracketSequence(String brackets) {
        Stack<Character> stack = new Stack<>();
        String openingBrackets = "([{<";
        String closingBrackets = ")]}>";
        HashMap<Character, Character> bracketPairs = new HashMap<>();
        bracketPairs.put('(', ')');
        bracketPairs.put('[', ']');
        bracketPairs.put('{', '}');
        bracketPairs.put('<', '>');

 

        for (char bracket : brackets.toCharArray()) {
            if (openingBrackets.indexOf(bracket) != -1) {
                stack.push(bracket);
            } else if (closingBrackets.indexOf(bracket) != -1) {
                if (stack.isEmpty() || bracketPairs.get(stack.peek()) != bracket) {
                    return 0;
                }
                stack.pop();
            }
        }

 

        return stack.isEmpty() ? 1 : 0;
    }

 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 

        // Read the number of test cases
        System.out.println("enter number of statement:");
        int numTestCases = Integer.parseInt(scanner.nextLine());

 

        System.out.println("enter statement:");
        // Process each test case
        int[] results = new int[numTestCases];
        for (int i = 0; i < numTestCases; i++) {
            String testCase = scanner.nextLine();
            results[i] = checkBracketSequence(testCase);
        }

 

        // Print the results
        for (int result : results) {
            System.out.print(result + " ");
        }
    }
}