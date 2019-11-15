package ec.devsu.code.jam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * SimpleCipherTest
 */
public class SimpleCipherTest {
    SimpleCipher simpleCipher = new SimpleCipher();
    @Test
    void shouldCipherzZOdd(){
        assertEquals("a", simpleCipher.executeCipher("z"));
        assertEquals("A", simpleCipher.executeCipher("Z"));    
    }

    @Test
    void shouldCipherazAndAZ(){
        assertEquals("az", simpleCipher.executeCipher("za"));
        assertEquals("AZ", simpleCipher.executeCipher("ZA"));    
    }

    @Test
    void shouldCiphera(){
        assertEquals("b", simpleCipher.executeCipher("a"));     
    }

    
    @Test
    void shouldCipherb(){
        assertEquals("c", simpleCipher.executeCipher("b"));     
    }

    
    @Test
    void shouldCiphert(){
        assertEquals("u", simpleCipher.executeCipher("t"));     
    }
    

    @Test
    void shouldCipherab(){
        assertEquals("ba", simpleCipher.executeCipher("ab"));     
    }

    
    @Test
    void shouldCipherct(){
        assertEquals("ds", simpleCipher.executeCipher("ct"));     
    }

    
    @Test
    void shouldCipherafgtszaaztayzzaaabbbrrrpp(){
        assertEquals("behstybzasbxaybzbacasqsoq", simpleCipher.executeCipher("afgtszaaztayzzaaabbbrrrpp"));     
    }

    
    @Test
    void shouldCipher(){
        assertEquals("Ugf rtjbl cqpvo gny ktnot pufq sid kbyz enh 12345 :) * yayAYAZBZbzb", simpleCipher.executeCipher("The quick brown fox jumps over the lazy dog 12345 :) * zzzZZZAAAaaa"));     
    }
}