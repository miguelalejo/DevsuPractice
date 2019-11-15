package ec.devsu.code.jam;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Test;

/**
 * MagicSquareTest
 */
public class MagicSquareTest {

    MagicSquare magicSquare = new MagicSquare();

    @Test
    void shouldBeSquareMatrixEmpty() {
        int[][] matrix = new int[][] {};
        assertFalse(magicSquare.isMagicSquare(matrix));
    }

    @Test
    void shouldNotBeSquareMatrix() {
        int[][] matrix = new int[2][];
        matrix[0] = new int[] { 1, 2 };
        matrix[1] = new int[] { 1, 2, 3 };
        assertFalse(magicSquare.isMagicSquare(matrix));
    }

    @Test
    void shouldNotBeSquareMatrixThreeRows() {
        int[][] matrix = new int[3][];
        matrix[0] = new int[] { 1, 2, 5, 6, 7 };
        matrix[1] = new int[] { 1, 2, 3 };
        matrix[2] = new int[] { 1, 2 };
        assertFalse(magicSquare.isMagicSquare(matrix));
    }

    @Test
    void shouldNotBeMagicMatrixThreeRows() {
        int[][] matrix = new int[3][];
        matrix[0] = new int[] { 1, 2, 3 };
        matrix[1] = new int[] { 4, 5, 6 };
        matrix[2] = new int[] { 7, 8, 9 };
        assertFalse(magicSquare.isMagicSquare(matrix));
    }

    @Test
    void shouldBeMagicMatrixThreeRows() {
        int[][] matrix = new int[3][];
        matrix[0] = new int[] { 2, 7, 6 };
        matrix[1] = new int[] { 9, 5, 1 };
        matrix[2] = new int[] { 4, 3, 8 };
        assertTrue(magicSquare.isMagicSquare(matrix));
    }

    @Test
    void shouldNotBeMagicMatrixTwoRows() {
        int[][] matrix = new int[2][];
        matrix[0] = new int[] { 2, 2 };
        matrix[1] = new int[] { 2, 2 };
        assertFalse(magicSquare.isMagicSquare(matrix));
    }

    @Test
    void shouldBeValidRowsMatrixOfThreeDimension() {
        int[][] matrix = new int[3][];
        matrix[0] = new int[] { 2, 7, 6 };
        matrix[1] = new int[] { 9, 5, 1 };
        matrix[2] = new int[] { 4, 3, 8 };
        Map<Integer, String> map = new HashMap<Integer, String>();
        magicSquare.validateRows(matrix, map);
        Set<Integer> setSuma = map.keySet();
        assertEquals(1, map.size());
        assertTrue(setSuma.contains(15));
    }

    @Test
    void shouldBeValidColumnsMatrixOfThreeDimension() {
        int[][] matrix = new int[3][];
        matrix[0] = new int[] { 2, 7, 6 };
        matrix[1] = new int[] { 9, 5, 1 };
        matrix[2] = new int[] { 4, 3, 8 };
        Map<Integer, String> map = new HashMap<Integer, String>();
        magicSquare.validateColumns(matrix, map);
        Set<Integer> setSuma = map.keySet();
        assertEquals(1, map.size());
        assertTrue(setSuma.contains(15));
    }

    @Test
    void shouldBeValidDiagonalMatrixOfThreeDimension() {
        int[][] matrix = new int[3][];
        matrix[0] = new int[] { 2, 7, 6 };
        matrix[1] = new int[] { 9, 5, 1 };
        matrix[2] = new int[] { 4, 3, 8 };
        Map<Integer, String> map = new HashMap<Integer, String>();
        magicSquare.validateDiagonal(matrix, map);
        Set<Integer> setSuma = map.keySet();
        assertEquals(1, map.size());
        assertTrue(setSuma.contains(15));
    }

    @Test
    void shouldBeValidReverseDiagonalMatrixOfThreeDimension() {
        int[][] matrix = new int[3][];
        matrix[0] = new int[] { 2, 7, 6 };
        matrix[1] = new int[] { 9, 5, 1 };
        matrix[2] = new int[] { 4, 3, 8 };
        Map<Integer, String> map = new HashMap<Integer, String>();
        magicSquare.validateReverseDiagonal(matrix, map);
        Set<Integer> setSuma = map.keySet();
        assertEquals(1, map.size());
        assertTrue(setSuma.contains(15));
    }

    @Test
    void shouldBeMagicMatrixFiveRows() {
        int[][] matrix = new int[5][];
        matrix[0] = new int[] { 11, 18, 25, 2, 9 };
        matrix[1] = new int[] { 10, 12, 19, 21, 3 };
        matrix[2] = new int[] { 4, 6, 13, 20, 22 };
        matrix[3] = new int[] { 23, 5, 7, 14, 16 };
        matrix[4] = new int[] { 17, 24, 1, 8, 15 };
        assertTrue(magicSquare.isMagicSquare(matrix));
    }

    @Test
    void shouldBeValidRowsMatrixOfFiveDimension() {
        int[][] matrix = new int[5][];
        matrix[0] = new int[] { 11, 18, 25, 2, 9 };
        matrix[1] = new int[] { 10, 12, 19, 21, 3 };
        matrix[2] = new int[] { 4, 6, 13, 20, 22 };
        matrix[3] = new int[] { 23, 5, 7, 14, 16 };
        matrix[4] = new int[] { 17, 24, 1, 8, 15 };
        Map<Integer, String> map = new HashMap<Integer, String>();
        magicSquare.validateRows(matrix, map);
        Set<Integer> setSuma = map.keySet();
        assertEquals(1, map.size());
        assertTrue(setSuma.contains(65));
    }

}