package ec.devsu.code.jam;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;



public class CompressorTests {

	Compressor compressor = new Compressor("aaaabbdxy");
	@Test
    void shouldBeEmpty() {
		compressor = new Compressor("");
        assertEquals("", compressor.compress());
    }
	
	@Test
    void shouldBeNull() {
		compressor = new Compressor(null);
        assertEquals(null, compressor.compress());
    }

	@Test
    void shouldCompressUniqueOneLetter() {
		compressor = new Compressor("a");
        assertEquals("a", compressor.compress());
    }
    
	@Test
    void shouldCompressOneLetter() {
		compressor = new Compressor("aaaa");
        assertEquals("a4", compressor.compress());
    }

    @Test
    void shouldCompressTwoDifferentLetters() {
		compressor = new Compressor("aaaabbb");
        assertEquals("a4b3", compressor.compress());
    }

    @Test
    void shouldCompressThreeDifferentLetters() {
		compressor = new Compressor("aaaabbbcccccc");
        assertEquals("a4b3c6", compressor.compress());
    }

    @Test
    void shouldCompressThreeDifferentLettersSpacesAsterix() {
		compressor = new Compressor("aaaabbbcccccc   ****");
        assertEquals("a4b3c6 3*4", compressor.compress());
    }

    @Test
    void shouldCompress() {		
        assertEquals("a4b2dxy", compressor.compress());
    }

    @Test
    void shouldValidateOnlyText() {		
        compressor = new Compressor("a1");
        assertThrows(RuntimeException.class, () -> {
            compressor.compress();
          });        
    }

    
    @Test
    void shouldValidateOnlyTextNumber() {		
        compressor = new Compressor("2");
        assertThrows(RuntimeException.class, () -> {
            compressor.compress();
          });        
    }



}
