package ec.devsu.code.jam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * PeasentMultiplyTest
 */
public class PeasentMultiplyTest {
    PeasentMultiply peasentMultiply = new PeasentMultiply();

    @Test
    void shouldBeCero() {
        assertEquals(0, peasentMultiply.multiply(0, 0));
    }

    @Test
    void shouldBeCeroOne() {
        assertEquals(0, peasentMultiply.multiply(1, 0));
    }

    @Test
    void shouldBeOne() {
        assertEquals(1, peasentMultiply.multiply(1, 1));
    }

    @Test
    void shouldBeFour() {
        assertEquals(4, peasentMultiply.multiply(4, 1));
    }

    @Test
    void shouldBeTwo() {
        assertEquals(2, peasentMultiply.multiply(1, 2));
    }

    @Test
    void shouldBeTwentyFive() {
        assertEquals(25, peasentMultiply.multiply(5, 5));
    }
}