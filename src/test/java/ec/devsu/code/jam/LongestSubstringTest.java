package ec.devsu.code.jam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * LongestSubstringTest
 */
public class LongestSubstringTest {

    LongestSubstring longestSubstring = new LongestSubstring();

    @Test
    void shouldBeEmptyOneCharacter() {
        String a = "A";
        String b = "A";
        assertEquals("", longestSubstring.createLongestSubstring(a, b));
    }

    
    @Test
    void shouldBeOneCharacter() {
        String a = "A";
        String b = "B";
        assertEquals("A", longestSubstring.createLongestSubstring(a, b));
    }

    @Test
    void shouldBeTwoCharacters() {
        String a = "AC";
        String b = "B";
        assertEquals("AC", longestSubstring.createLongestSubstring(a, b));
    }

    @Test
    void shouldBeThreeCharacters() {
        String a = "ACD";
        String b = "B";
        assertEquals("ACD", longestSubstring.createLongestSubstring(a, b));
    }

    @Test
    void shouldBeTwoCharactersTwoLettersB() {
        String a = "ACDEF";
        String b = "BEFD";
        assertEquals("AC", longestSubstring.createLongestSubstring(a, b));
    }

    @Test
    void shouldBeValidateAleatoryCharacters() {
        String a = "ACDEF111BE22E2EECECC";
        String b = "CEFD";
        assertEquals("A111B222", longestSubstring.createLongestSubstring(a, b));
    }
}