package ec.devsu.code.jam;

/**
 * SpecialMerge
 */
public class SpecialMerge {

    public int[] mergeAndSort(int[] unsortedArrayA, int[] unsortedArrayB) {
        if (unsortedArrayA == null && unsortedArrayB == null) {
            return null;
        }
        int dimesionArrayA = (unsortedArrayA == null) ? 0 : unsortedArrayA.length;
        int dimesionArrayB = (unsortedArrayB == null) ? 0 : unsortedArrayB.length;

        if (dimesionArrayA == 0 && dimesionArrayB == 0) {
            return null;
        }

        int[] mergeArray = mergeArray(unsortedArrayA, unsortedArrayB, dimesionArrayA, dimesionArrayB);
        orderArray(mergeArray);
        return mergeArray;

    }

    private void orderArray(int[] mergeArray) {
        for (int c = 0; c < mergeArray.length; c++) {
            for (int d = c + 1; d < mergeArray.length; d++) {
                if (mergeArray[c] > mergeArray[d]) {
                    int mayorNumber = mergeArray[c];
                    mergeArray[c] = mergeArray[d];
                    mergeArray[d] = mayorNumber;
                }
            }
        }
    }

    private int[] mergeArray(int[] unsortedArrayA, int[] unsortedArrayB, int dimesionArrayA, int dimesionArrayB) {
        int[] mergeArray = new int[dimesionArrayA + dimesionArrayB];
        int k = 0;
        for (int i = 0; i < dimesionArrayA; i++) {
            mergeArray[k] = unsortedArrayA[i];
            k++;
        }

        for (int j = 0; j < dimesionArrayB; j++) {
            mergeArray[k] = unsortedArrayB[j];
            k++;
        }
        return mergeArray;
    }
}