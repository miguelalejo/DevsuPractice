package ec.devsu.code.jam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * FindSum
 */
public class FindSumTest {
    FindSum findSum = new FindSum("We will refer to the first block as 24-bit block, the second as"
    +"20-bit block, and to the third as 16-bit block. Note that (in"
    +"pre-CIDR notation) the first block is nothing but a single class A"
    +"network number, while the second block is a set of 16 contiguous"
    +"class B network numbers, and third block is a set of 256 contiguous"
    +"class C network numbers.");

    @Test
    void shouldSumOne() {
        findSum = new FindSum("1");
        assertEquals(1, findSum.sumNumbersIntoText());
    }

    
    @Test
    void shouldSumSix() {
        findSum = new FindSum("1 2 3");
        assertEquals(6, findSum.sumNumbersIntoText());
    }

    @Test
    void shouldSumFifty() {
        findSum = new FindSum("1 2 3 44");
        assertEquals(50, findSum.sumNumbersIntoText());
    }

    @Test
    void shouldSumThreeHundred() {
        findSum = new FindSum("1 2 3 44   100  50  5  95");
        assertEquals(300, findSum.sumNumbersIntoText());
    }
    @Test
    void shouldSumOneHundred(){
        findSum = new FindSum("Genius is 1 percent inspiration, 99 percent perspiration");
        assertEquals(100, findSum.sumNumbersIntoText());        
    }

    @Test
    void shouldSumFortyfour(){
        findSum = new FindSum("When I was 18, I was in 1st year, and had 25 classmates");
        assertEquals(44, findSum.sumNumbersIntoText());        
    }
    
    @Test
    void shouldSumThreeHundredThirtyTwo(){        
        assertEquals(332, findSum.sumNumbersIntoText());        
    }   

}