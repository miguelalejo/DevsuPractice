package ec.devsu.code.jam;

import java.util.ArrayList;
import java.util.List;

/**
 * AnotherSeries
 */
public class AnotherSeries {

    public Integer[] createSeries(int dimension) {
        // 3+0=3, 4*1=4, 3+1=4, 4*3=12,4+2=6, 4*5=20, 6+3=9, 4*7=28, 9+4=13, 4*9=36,
        // 13+5=18, 44
        // Two Series even -par odd - impar
        // Odd -> Start 3 and sum k=0 k++;
        // Even -> Stat 4 multipli i=1 i+2
        List<Integer> listSeries = new ArrayList<Integer>();
        int oddStart = 3;
        int oddSequence = 1;
        int evenStart = 4;
        int evenSequence = 1;
        for (int i = 1; i <= dimension; i++) {
            if (i % 2 == 0) {
                listSeries.add(evenStart * evenSequence);
                evenSequence = evenSequence + 2;                
            } else {
                listSeries.add(oddStart);
                oddStart = oddStart + oddSequence;
                oddSequence++;
            }

        }
        return listSeries.toArray(new Integer[listSeries.size()]);
    }
}