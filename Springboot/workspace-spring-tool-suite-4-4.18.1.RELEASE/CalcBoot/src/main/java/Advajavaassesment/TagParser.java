package Advajavaassesment;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagParser {
    public static void parseTagContents(String input) {
        Pattern pattern = Pattern.compile("<([\\w]+)[^>]*>(.*?)</\\1>");
        Matcher matcher = pattern.matcher(input);
        boolean found = false;

        while (matcher.find()) {
            System.out.println(matcher.group(2));
            found = true;
        }

        if (!found) {
            System.out.println("None");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numLines = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline character

        for (int i = 0; i < numLines; i++) {
            String input = scanner.nextLine();
            parseTagContents(input);
        }

        scanner.close();
    }
}