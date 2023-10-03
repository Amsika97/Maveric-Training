package Advajavaassesment;

import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {
    public static Map<Character, Integer> countCharacters(String input) {
        Map<Character, Integer> charCount = new HashMap<>();

        for (char ch : input.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        return charCount;
    }

    public static void main(String[] args) {
        String input = "aba";
        Map<Character, Integer> result = countCharacters(input);
        System.out.println(result);
    }
}


