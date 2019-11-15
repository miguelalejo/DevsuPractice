package ec.devsu.code.jam;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

/**
 * SpecialMergeTest
 */
public class SpecialMergeTest {
    SpecialMerge specialMerge = new SpecialMerge();

    @Test
    void shouldMergeTwoArraysOfOneDimension() {
        int[] arrayA = new int[] { 1 };
        int[] arrayB = new int[] { 2 };
        int[] orderArray = specialMerge.mergeAndSort(arrayA, arrayB);
        assertArrayEquals(new int[] { 1, 2 }, orderArray);
    }

    @Test
    void shouldMergeTwoArraysOfOneDimensionSort() {
        int[] arrayA = new int[] { 2 };
        int[] arrayB = new int[] { 1 };
        int[] orderArray = specialMerge.mergeAndSort(arrayA, arrayB);
        assertArrayEquals(new int[] { 1, 2 }, orderArray);
    }

    @Test
    void shouldMergeTwoArraysOfOneDimensionSameNumbers() {
        int[] arrayA = new int[] { 1 };
        int[] arrayB = new int[] { 1 };
        int[] orderArray = specialMerge.mergeAndSort(arrayA, arrayB);
        assertArrayEquals(new int[] { 1, 1 }, orderArray);
    }

    @Test
    void shouldMergeTwoArraysOfTwoDimensionSameNumber() {
        int[] arrayA = new int[] { 1, 9 };
        int[] arrayB = new int[] { 6, 0 };
        int[] orderArray = specialMerge.mergeAndSort(arrayA, arrayB);
        assertArrayEquals(new int[] { 0, 1, 6, 9 }, orderArray);
    }

    @Test
    void shouldMergeTwoArraysOfDimensionDifferentNumbers() {
        int[] arrayA = new int[] { 1, 9, 5, 8, 1, 3 };
        int[] arrayB = new int[] { 6, 0, 2, 5 };
        int[] orderArray = specialMerge.mergeAndSort(arrayA, arrayB);
        assertArrayEquals(new int[] { 0, 1, 1, 2, 3, 5, 5, 6, 8, 9 }, orderArray);
    }

    @Test
    void shouldMergeTwoArraysOfDimensionDifferentNumbersGenerated() {
        int[] arrayA = new int[] { 8, 12, 13, 17, 20 };
        int[] arrayB = new int[] { 3, 4, 5, 15, 19 };
        int[] orderArray = specialMerge.mergeAndSort(arrayA, arrayB);
        assertArrayEquals(new int[] { 3, 4, 5, 8, 12, 13, 15, 17, 19, 20 }, orderArray);
    }

    @Test
    void shouldReturNullMergeTwoNullArrays() {

        int[] orderArray = specialMerge.mergeAndSort(null, null);
        assertArrayEquals(null, orderArray);
    }

    @Test
    void shouldReturNullMergeTwoEmptyArrays() {
        int[] arrayA = new int[] {};
        int[] arrayB = new int[] {};
        int[] orderArray = specialMerge.mergeAndSort(arrayA, arrayB);
        assertArrayEquals(null, orderArray);
    }

    @Test
    void shouldReturNullMergeOneEmptyArrays() {
        int[] arrayA = new int[] { 1, 7, 2 };
        int[] arrayB = new int[] {};
        int[] orderArray = specialMerge.mergeAndSort(arrayA, arrayB);
        assertArrayEquals(new int[] { 1, 2, 7 }, orderArray);
    }

    @Test
    void shouldReturNullMergeSecondEmptyArrays() {
        int[] arrayA = new int[] {};
        int[] arrayB = new int[] { 99, 66, 21, 1, 0 };
        int[] orderArray = specialMerge.mergeAndSort(arrayA, arrayB);
        assertArrayEquals(new int[] { 0, 1, 21, 66, 99 }, orderArray);
    }

    @Test
    void shouldReturNullMergeOneNullArrays() {
        int[] arrayA = null;
        int[] arrayB = new int[] { 99, 66, 21, 1, 0 };
        int[] orderArray = specialMerge.mergeAndSort(arrayA, arrayB);
        assertArrayEquals(new int[] { 0, 1, 21, 66, 99 }, orderArray);
    }

    @Test
    void shouldReturNullMergeSecondNullArrays() {
        int[] arrayA = new int[] { 99, 66, 21, 1, 0 };
        int[] arrayB = null;
        int[] orderArray = specialMerge.mergeAndSort(arrayA, arrayB);
        assertArrayEquals(new int[] { 0, 1, 21, 66, 99 }, orderArray);
    }

}