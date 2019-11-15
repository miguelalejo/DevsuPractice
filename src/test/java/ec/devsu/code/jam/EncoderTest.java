package ec.devsu.code.jam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * EnconderTest
 */
public class EncoderTest {
    Encoder enconder = new Encoder();

    @Test
    void shouldUpperCaseOneLetter(){
        assertEquals("A", enconder.enconde("a"));

    }

    @Test
    void shouldUpperCaseReverseFirstLetterOfAWord(){
        assertEquals("Mota", enconder.enconde("Atom"));

    }

    @Test
    void shouldUpperCaseReverseFirstLetterOfAWordWithSpace(){
        assertEquals("Mota", enconder.enconde("Atom "));

    }

    
    @Test
    void shouldUpperCaseReverseFirstLetterOfSomeWordsWithSpace(){
        assertEquals("Tobor Mota", enconder.enconde("Atom Robot"));
    }

    
    @Test
    void shouldReverseText(){
        assertEquals("Dneirf Ym Olleh", enconder.enconde("Hello my friend"));
    }

    @Test
    void shouldReverseComplexText(){
        assertEquals("Enif Eb Lliw Ti Yad Ruoy Tuoba Tahw Dneirf Ym Olleh", enconder.enconde("Hello my friend what about your day it will be fine"));
    }
}