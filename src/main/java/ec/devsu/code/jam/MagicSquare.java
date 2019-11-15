package ec.devsu.code.jam;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * MagicSquare
 */
public class MagicSquare {

    public boolean isMagicSquare(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            int size = matrix[i].length;
            if (size != matrix.length) {
                return false;
            }
        }

        if (matrix.length == 0) {
            return false;
        }

        // List<Integer> rowSumatories=new ArrayList<Integer>();
        Map<Integer, String> map = new HashMap<Integer, String>();
        try {
            validateOneTime(matrix);
        } catch (Exception e) {
            return false;
        }
        validateRows(matrix, map);
        validateColumns(matrix, map);
        validateDiagonal(matrix, map);
        validateReverseDiagonal(matrix, map);
        if (map.isEmpty()) {
            return false;
        }
        return map.keySet().size() == 1;
    }

    void validateReverseDiagonal(int[][] matrix, Map<Integer, String> map) {
        int inverserDiagSum = 0;
        for (int i = 0, j = matrix[i].length - 1; i < matrix.length; i++, j--) {
            inverserDiagSum += matrix[i][j];
        }
        map.put(inverserDiagSum, "MAGIC INVERSE DIAGONAL");
    }

    void validateDiagonal(int[][] matrix, Map<Integer, String> map) {
        int diagonalSum = 0;
        for (int i = 0; i < matrix.length; i++) {            
            diagonalSum += matrix[i][i];            
        }
        map.put(diagonalSum, "MAGIC DIAGONAL");
    }

    void validateColumns(int[][] matrix, Map<Integer, String> map) {
        for (int i = 0; i < matrix.length; i++) {
            int colSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                colSum += matrix[j][i];
            }
            map.put(colSum, "MAGIC COLS");
        }
    }

    void validateRows(int[][] matrix, Map<Integer, String> map) {
        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }
            map.put(rowSum, "MAGIC ROWS");
        }
    }

    void validateOneTime(int[][] matrix) throws Exception {
        Map<Integer, String> map = new HashMap<Integer, String>();        
        int size = 0;
        for (int i = 0; i < matrix.length; i++) {            
            for (int j = 0; j < matrix[i].length; j++) {
                map.put(matrix[i][j],"NUMBER");
                size++;
            }            
        }
        if(size!= map.keySet().size()){
            throw new Exception("Each number shoul be used once");
        }
        
    }

}