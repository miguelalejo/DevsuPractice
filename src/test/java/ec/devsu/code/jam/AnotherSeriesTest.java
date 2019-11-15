package ec.devsu.code.jam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * AnotherSeriesTest
 */
public class AnotherSeriesTest {

    AnotherSeries anotherSeries = new AnotherSeries();

    @Test
    void shouldBeThreeOneDimension() {
        Integer[] series = anotherSeries.createSeries(1);
        assertEquals(3, series[0].intValue());

    }

    @Test
    void shouldBeThreeFourTwoDimension() {
        Integer[] series = anotherSeries.createSeries(2);
        assertEquals(3, series[0].intValue());
        assertEquals(4, series[1].intValue());
    }

    @Test
    void shouldBeValidFiveDimensionSeires() {
        Integer[] series = anotherSeries.createSeries(5);
        //3, 4, 4, 12, 6, 20, 9, 28, 13, 36, 18, 44, ...
        assertEquals(3, series[0].intValue());
        assertEquals(4, series[1].intValue());
        assertEquals(4, series[2].intValue());
        assertEquals(12, series[3].intValue());
        assertEquals(6, series[4].intValue());

    }

    @Test
    void shouldBeValidTwelveDimensionSeires() {
        Integer[] series = anotherSeries.createSeries(12);
        //3, 4, 4, 12, 6, 20, 9, 28, 13, 36, 18, 44, ...
        assertEquals(3, series[0].intValue());
        assertEquals(4, series[1].intValue());
        assertEquals(4, series[2].intValue());
        assertEquals(12, series[3].intValue());
        assertEquals(6, series[4].intValue());
        assertEquals(20, series[5].intValue());
        assertEquals(9, series[6].intValue());
        assertEquals(28, series[7].intValue());
        assertEquals(13, series[8].intValue());
        assertEquals(36, series[9].intValue());
        assertEquals(18, series[10].intValue());
        assertEquals(44, series[11].intValue());

    }

}