package ec.devsu.code.jam;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.Iterator;

/**
 * FindSum
 */
public class FindSum {

    String text;

    public FindSum(String text) {
        this.text = text;
    }

    public int sumNumbersIntoText(){
        int sum=0;        
        String digitAsText="";
        boolean isDigit=false;
        CharacterIterator textIterator=new StringCharacterIterator(text);        
        while(textIterator.current()!=CharacterIterator.DONE){
            char c=textIterator.current();
            while(Character.isDigit(c)){
                digitAsText+=String.valueOf(c);
                isDigit = true;
                c=textIterator.next();                
            }
            if(isDigit){
                sum+=Integer.valueOf(digitAsText);
            } 
            c=textIterator.next();               
            digitAsText="";
            isDigit=false;
        }
        return sum;
    }

}