package ec.devsu.code.jam;

import java.util.ArrayList;
import java.util.List;

/**
 * SimpleSerie
 */
public class SimpleSerie {

    List<Integer> series = new ArrayList<Integer>();
    int numberElements;


    public SimpleSerie(int numberElements) {
        this.numberElements = numberElements;
    }

    public void generateSeries() {
        int tokenSerie=2;
        int sequence=3;
        int startNumber=2;
        for (int i = 0; i < numberElements; i++) {
            series.add(startNumber);
            startNumber=startNumber+sequence;
            sequence+=tokenSerie;
        }
    }

    public Integer returnElement(int element){
        if(element<=0){
            return -1;
        }
        if(element>numberElements){
            throw new RuntimeException("The selected element its out side of the scope");
        }
        return series.get(element-1);
    }

    public List<Integer> getSeries() {
        return this.series;
    }

   



}