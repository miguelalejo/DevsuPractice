package ec.devsu.code.jam;

/**
 * LongestSubstring
 */
public class LongestSubstring {

    public String createLongestSubstring(String a, String b) {
        String temp = a;
        for (char characterB : b.toCharArray()) {
            String cad = "";
            for (char characterA : temp.toCharArray()) {                
                if (characterA != characterB) {
                    cad += String.valueOf(characterA);
                }
            }
            temp = cad;
        }
        return temp;

    }
}