package ec.devsu.code.jam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * ColorFinderTest
 */
public class ColorFinderTest {
    ColorFinder colorFinder = new ColorFinder();

    @Test
    void shoulbBeBack() {
        assertEquals("black", colorFinder.findColor(0, 0));
    }

    @Test
    void shoulbBeBlackCeroOne() {
        assertEquals("black", colorFinder.findColor(0, 1));
    }

    @Test
    void shoulbBewhiteCeroOne() {
        assertEquals("black", colorFinder.findColor(-1, 0));
    }

    @Test
    void shoulbBeBlackOneCero() {
        assertEquals("black", colorFinder.findColor(1, 0));
    }

    @Test
    void shoulbBeWhiteOneOne() {
        assertEquals("white", colorFinder.findColor(1, 1));
    }

    @Test
    void shoulbBeBlackMinusOneOne() {
        assertEquals("black", colorFinder.findColor(-1, 1));
    }

    @Test
    void shoulbBeBlackOneMInusOne() {
        assertEquals("black", colorFinder.findColor(1, -1));
    }

    @Test
    void shoulbBeBlackTwoOne() {
        assertEquals("black", colorFinder.findColor(2, 1));
    }

    @Test
    void shoulbBeWhiteFourFour() {
        assertEquals("white", colorFinder.findColor(4, 4));
    }

    
    @Test
    void shoulbBeWhiteMinusFourFour() {
        assertEquals("black", colorFinder.findColor(-4, 4));
    }

    @Test
    void shoulbBeBlackNineNine() {
        assertEquals("black", colorFinder.findColor(9, 9));
    }

    @Test
    void shoulbBeWhinteOneThree() {
        assertEquals("white", colorFinder.findColor(1, 3));
    }

    @Test
    void shoulbBeWhinteThreeOne() {
        assertEquals("white", colorFinder.findColor(1, 3));
    }

    @Test
    void shoulbBeWhinteThreeFour() {
        assertEquals("black", colorFinder.findColor(3, 4));
    }

    @Test
    void shoulbBeWhinteFourFive() {
        assertEquals("black", colorFinder.findColor(5, 4));
    }

    @Test
    void shoulbBeWhiteMinusTwoOne() {
        assertEquals("white", colorFinder.findColor(-2, 1));
    }

    @Test
    void shoulbBeBlackMinusTwoOne() {
        assertEquals("black", colorFinder.findColor(2, 1));
    }

    @Test
    void shoulbBeBlackMinusFourThree() {
        assertEquals("black", colorFinder.findColor(4, 3));
    }

    @Test
    void shoulbBeBlackMinusFourMinusThree() {
        assertEquals("black", colorFinder.findColor(4, -3));
    }

}