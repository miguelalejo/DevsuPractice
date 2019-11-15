package ec.devsu.code.jam;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * JustifyTest
 */
public class JustifyTest {
    Justify justify = new Justify();

    @Test
    void shouldFinOneWord() {
        List<String> words = new ArrayList<String>();
        words.add("A");
        List<String> expected = justify.findWords("A");
        assertArrayEquals(words.toArray(new String[words.size()]), expected.toArray(new String[expected.size()]));
    }

    @Test
    void shouldFindFourWords() {
        List<String> words = new ArrayList<String>();
        words.add("AB");
        words.add(" ");
        words.add("C");
        List<String> expected = justify.findWords("AB C");
        assertArrayEquals(words.toArray(new String[words.size()]), expected.toArray(new String[expected.size()]));
    }

    @Test
    void shouldFindFiveWords() {
        List<String> words = new ArrayList<String>();
        words.add("HOLA");
        words.add(" ");
        words.add("COMO");
        words.add(" ");
        words.add(" ");
        words.add("ESTAS");
        words.add(" ");
        words.add("TU");
        words.add(" ");
        words.add(" ");
        words.add(" ");
        words.add("HOY");
        List<String> expected = justify.findWords("HOLA COMO  ESTAS TU   HOY");
        assertArrayEquals(words.toArray(new String[words.size()]), expected.toArray(new String[expected.size()]));
    }

    @Test
    void shouldJustifyThreeLetterOneDimension() {
        assertEquals("A\nB", justify.justifyText("A B", 1));
    }

    @Test
    void shouldJustifyThreeLetterTwoDimension() {
        assertEquals("A\nB", justify.justifyText("A B", 2));
    }

    @Test
    void shouldJustifyEightLetterTwoDimension() {
        assertThrows(RuntimeException.class, () -> {
            justify.justifyText("A BC DEFG H ", 2);
        });
    }

    @Test
    void shouldJustifyEightLetterFourDimension() {
        assertEquals("A BC\nDEFG\nH", justify.justifyText("A BC DEFG H ", 4));
    }

    @Test
    void shouldJustifyEightLetterSixDimension() {
        assertEquals("HOLA\nLU\nCOMO\nHOLA\nCESAR\nES  UN\nDIA\nGENIAL",
                justify.justifyText("HOLA LU COMO HOLA CESAR ES UN DIA GENIAL", 6));
    }

    @Test
    void shouldJustifyText() {
        assertEquals(
            "Lorem ipsum dolor sit amet, consectetur adipiscing\n"+
            "elit,  sed  do eiusmod tempor incididunt ut labore\n"+
            "et  dolore  magna aliqua. Ut enim ad minim veniam,\n"+
            "quis  nostrud exercitation ullamco laboris nisi ut\n"+
            "aliquip  ex  ea commodo consequat. Duis aute irure\n"+
            "dolor  in  reprehenderit  in  voluptate velit esse\n"+
            "cillum  dolore eu fugiat nulla pariatur. Excepteur\n"+
            "sint  occaecat  cupidatat  non  proident,  sunt in\n"+
            "culpa  qui  officia  deserunt  mollit  anim id est\n"+
            "laborum.",
                justify.justifyText(
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
                        50));
    }

}