package advjavatest1;
import Advajavaassesment.CharacterCounter;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.assertEquals;

public class CharacterCounterTest {
    @Test
    public void testCountCharactersWithNonEmptyString() {
        String input = "aba";
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('a', 2);
        expected.put('b', 1);
        assertEquals(expected, CharacterCounter.countCharacters(input));
    }

    @Test
    public void testCountCharactersWithEmptyString() {
        String input = "";
        Map<Character, Integer> expected = new HashMap<>();
        assertEquals(expected, CharacterCounter.countCharacters(input));
    }

    @Test
    public void testCountCharactersWithSingleCharacterString() {
        String input = "a";
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('a', 1);
        assertEquals(expected, CharacterCounter.countCharacters(input));
    }

    @Test
    public void testCountCharactersWithRepeatedCharacters() {
        String input = "abbccc";
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('a', 1);
        expected.put('b', 2);
        expected.put('c', 3);
        assertEquals(expected, CharacterCounter.countCharacters(input));
    }
}