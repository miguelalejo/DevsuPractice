package ec.devsu.code.jam;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

import org.w3c.dom.events.Event;

/**
 * SimpleCipher
 */
public class SimpleCipher {

    public String executeCipher(String text) {
        CharacterIterator characterIterator = new StringCharacterIterator(text);
        int counter = 1;
        String texteCipher = "";

        while (characterIterator.current() != CharacterIterator.DONE) {
            Character c = characterIterator.current();
            String alphabeticText = String.valueOf(c);
            if (!isLetter(alphabeticText)) {
                texteCipher += alphabeticText;
            } else {
                if (even(counter)) {
                    if ("a".equals(alphabeticText)) {
                        texteCipher += "z";
                    } else if ("A".equals(alphabeticText)) {
                        texteCipher += "Z";
                    } else {
                        int ascii = (int) c;
                        ascii--;
                        Character previusCharacter = (char) ascii;
                        texteCipher += String.valueOf(previusCharacter);
                    }
                } else {
                    if ("z".equals(alphabeticText)) {
                        texteCipher += "a";
                    } else if ("Z".equals(alphabeticText)) {
                        texteCipher += "A";
                    } else {
                        int ascii = (int) c;
                        ascii++;
                        Character nextCharacter = (char) ascii;
                        texteCipher += String.valueOf(nextCharacter);
                    }

                }
            }
            characterIterator.next();
            counter++;
        }
        return texteCipher;
    }

    private boolean isLetter(String text) {
        return text.matches("^[a-zA-Z]");
    }

    private boolean even(int counter) {
        return counter % 2 == 0;
    }

}