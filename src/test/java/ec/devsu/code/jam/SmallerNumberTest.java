package ec.devsu.code.jam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * SmallerNumberTest
 */
public class SmallerNumberTest {

    SmallerNumber smallerNumber = new SmallerNumber();

    @Test
    void shouldBeOne() {
        assertEquals(-1, smallerNumber.solve(1));

    }

    @Test
    void shouldBeCantSolve() {
        assertEquals(-1, smallerNumber.solve(222));

    }

    @Test
    void shouldBeCantSolve444() {
        assertEquals(-1, smallerNumber.solve(444));

    }

    @Test
    void shouldBeTwelve() {
        assertEquals(12, smallerNumber.solve(21));

    }

    @Test
    void shouldBe15() {
        assertEquals(15, smallerNumber.solve(51));

    }

    @Test
    void shouldBe335() {
        assertEquals(335, smallerNumber.solve(353));

    }

    @Test
    void shouldBe1() {
        assertEquals(1, smallerNumber.solve(100));

    }

    @Test
    void shouldBer1() {
        assertEquals(1, smallerNumber.solve(10));

    }

    @Test
    void shouldBer156789() {
        assertEquals(156789, smallerNumber.solve(518976));

    }

    @Test
    void shouldBer23() {
        assertEquals(23, smallerNumber.solve(230));

    }


    
    @Test
    void shouldB223() {
        assertEquals(223, smallerNumber.solve(232));

    }
}