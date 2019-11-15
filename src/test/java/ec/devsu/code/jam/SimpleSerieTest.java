package ec.devsu.code.jam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * SimpleSerieTest
 */
public class SimpleSerieTest {
    SimpleSerie simpleSerie;
    @Test
    void shoudGenerateSerieOneElement(){
        simpleSerie=new SimpleSerie(1);
        simpleSerie.generateSeries();
        List<Integer> series =simpleSerie.getSeries();
        assertEquals(2, series.get(0).intValue());         
    }

    
    @Test
    void shoudGenerateSerieTwoElement(){
        simpleSerie=new SimpleSerie(2);
        simpleSerie.generateSeries();
        List<Integer> series =simpleSerie.getSeries();
        assertEquals(2, series.get(0).intValue());         
        assertEquals(5, series.get(1).intValue());         
    }

    @Test
    void shoudGenerateSerieExample(){
        simpleSerie=new SimpleSerie(6);
        simpleSerie.generateSeries();
        //Toke 2
        //Seqquen 3+Token+=Sequen
        //2, 5, 10, 17, 26,
        List<Integer> series =simpleSerie.getSeries();
        assertEquals(2, series.get(0).intValue());         
        assertEquals(5, series.get(1).intValue());         
        assertEquals(10, series.get(2).intValue());         
        assertEquals(17, series.get(3).intValue());         
        assertEquals(26, series.get(4).intValue());         
        assertEquals(37, series.get(5).intValue());         
    }

    @Test
    void shouldNotGenerateSerieExample(){
        simpleSerie=new SimpleSerie(6);
        simpleSerie.generateSeries();                
        assertEquals(2, simpleSerie.returnElement(1).intValue());         
        assertEquals(5, simpleSerie.returnElement(2).intValue());         
        assertEquals(10, simpleSerie.returnElement(3).intValue());         
        assertEquals(17, simpleSerie.returnElement(4).intValue());         
        assertEquals(26, simpleSerie.returnElement(5).intValue());         
        assertEquals(37, simpleSerie.returnElement(6).intValue());         
        assertEquals(-1, simpleSerie.returnElement(0).intValue());         
         
    }

    @Test
    void shouldNotGenerateSerieThousand(){
        simpleSerie=new SimpleSerie(1000);
        simpleSerie.generateSeries();                
        assertEquals(2, simpleSerie.returnElement(1).intValue());         
        assertEquals(5, simpleSerie.returnElement(2).intValue());         
        assertEquals(10, simpleSerie.returnElement(3).intValue());         
        assertEquals(17, simpleSerie.returnElement(4).intValue());         
        assertEquals(26, simpleSerie.returnElement(5).intValue());         
        assertEquals(37, simpleSerie.returnElement(6).intValue());                 
        assertEquals(1000001, simpleSerie.returnElement(1000).intValue());         
        
         
    }

    
}