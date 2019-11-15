package ec.devsu.code.jam;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import ec.devsu.code.api.Point;

/**
 * Octagon
 */
public class OctagonTest {
    Octagon octagon = new Octagon();

    @Test
    void shouldBeSizeThree() {
        assertEquals(4, octagon.calculateSize(2));
        assertEquals(7, octagon.calculateSize(3));
        assertEquals(10, octagon.calculateSize(4));
        assertEquals(13, octagon.calculateSize(5));
    }

    @Test
    void shouldBeNotValid() {
        assertThrows(RuntimeException.class, () -> {
            octagon.createOctaton(1);
        });
        assertThrows(RuntimeException.class, () -> {
            octagon.createOctaton(256);
        });
    }

    @Test
    void shouldBeValid() {
        assertDoesNotThrow(() -> {
            octagon.createOctaton(2);
        });
        assertDoesNotThrow(() -> {
            octagon.createOctaton(255);
        });
    }

    @Test
    void shouldBeValidHorizontalLineUpThreeDimension() {
        List<Point> listPoitns = new ArrayList<Point>();
        listPoitns.add(new Point(0, 2));
        listPoitns.add(new Point(0, 3));
        listPoitns.add(new Point(0, 4));
        List<Point> listPointsExpected = octagon.createPointsHorizontalUp(3);
        assertArrayEquals(listPoitns.toArray(new Point[listPoitns.size()]),
                listPointsExpected.toArray(new Point[listPointsExpected.size()]));
    }

    @Test
    void shouldBeValidHorizontalLineDownThreeDimension() {
        List<Point> listPoitns = new ArrayList<Point>();
        listPoitns.add(new Point(6, 2));
        listPoitns.add(new Point(6, 3));
        listPoitns.add(new Point(6, 4));
        List<Point> listPointsExpected = octagon.createPointsHorizontalDown(3);
        assertArrayEquals(listPoitns.toArray(new Point[listPoitns.size()]),
                listPointsExpected.toArray(new Point[listPointsExpected.size()]));
    }

    @Test
    void shouldBeValidVerticalLineLeftThreeDimension() {
        List<Point> listPoitns = new ArrayList<Point>();
        listPoitns.add(new Point(2, 0));
        listPoitns.add(new Point(3, 0));
        listPoitns.add(new Point(4, 0));
        List<Point> listPointsExpected = octagon.createPointsVerticalLeft(3);
        assertArrayEquals(listPoitns.toArray(new Point[listPoitns.size()]),
                listPointsExpected.toArray(new Point[listPointsExpected.size()]));
    }

    @Test
    void shouldBeValidVerticalLineRightThreeDimension() {
        List<Point> listPoitns = new ArrayList<Point>();
        listPoitns.add(new Point(2, 6));
        listPoitns.add(new Point(3, 6));
        listPoitns.add(new Point(4, 6));
        List<Point> listPointsExpected = octagon.createPointsVerticalRight(3);
        assertArrayEquals(listPoitns.toArray(new Point[listPoitns.size()]),
                listPointsExpected.toArray(new Point[listPointsExpected.size()]));
    }

    @Test
    void shouldBeValidDiagonalLineUpLeftThreeDimension() {
        List<Point> listPoitns = new ArrayList<Point>();
        listPoitns.add(new Point(0, 2));
        listPoitns.add(new Point(1, 1));
        listPoitns.add(new Point(2, 0));
        List<Point> listPointsExpected = octagon.createPointsDiagonalUpLeft(3);
        assertArrayEquals(listPoitns.toArray(new Point[listPoitns.size()]),
                listPointsExpected.toArray(new Point[listPointsExpected.size()]));
    }

    @Test
    void shouldBeValidDiagonalLineUpRightThreeDimension() {
        List<Point> listPoitns = new ArrayList<Point>();
        listPoitns.add(new Point(0, 4));
        listPoitns.add(new Point(1, 5));
        listPoitns.add(new Point(2, 6));
        List<Point> listPointsExpected = octagon.createPointsDiagonalUpRight(3);
        assertArrayEquals(listPoitns.toArray(new Point[listPoitns.size()]),
                listPointsExpected.toArray(new Point[listPointsExpected.size()]));
    }

    @Test
    void shouldBeValidDiagonalLineDownLeftThreeDimension() {
        List<Point> listPoitns = new ArrayList<Point>();
        listPoitns.add(new Point(6, 2));
        listPoitns.add(new Point(5, 1));
        listPoitns.add(new Point(4, 0));
        List<Point> listPointsExpected = octagon.createPointsDiagonalDownLeft(3);
        assertArrayEquals(listPoitns.toArray(new Point[listPoitns.size()]),
                listPointsExpected.toArray(new Point[listPointsExpected.size()]));
    }

    @Test
    void shouldBeValidDiagonalLineDownRightThreeDimension() {
        List<Point> listPoitns = new ArrayList<Point>();
        listPoitns.add(new Point(6, 4));
        listPoitns.add(new Point(5, 5));
        listPoitns.add(new Point(4, 6));
        List<Point> listPointsExpected = octagon.createPointsDiagonalDownRight(3);
        assertArrayEquals(listPoitns.toArray(new Point[listPoitns.size()]),
                listPointsExpected.toArray(new Point[listPointsExpected.size()]));
    }
}