package ec.devsu.code.jam;

/**
 * Encoder
 */
public class Encoder {

    public String enconde(String unEncondeText) {
       
        String word = "";
        String token = " ";
        String encodeText = encodeText(unEncondeText, word, token);
        return encodeText.trim();
    }

    private String encodeText(String unEncondeText, String word, String token) {
        String encodeText = "";        
        for (int i = 0; i < unEncondeText.length(); i++) {
            if (token.equals(String.valueOf(unEncondeText.charAt(i)))) {
                String wordReverse = reverseWord(word);
                encodeText = wordReverse + token +encodeText;
                word = "";
            } else {
                word += String.valueOf(unEncondeText.charAt(i)).toLowerCase();
            }
        }
        encodeText = reverseWord(word)+token+encodeText;
        return encodeText;
    }

    private String reverseWord(String word) {
        String wordReverse = "";
        for (int k = word.length() - 1; k >= 0; k--) {
            if (k == word.length() - 1) {
                wordReverse += String.valueOf(word.charAt(k)).toUpperCase();
            } else {
                wordReverse += String.valueOf(word.charAt(k));
            }
        }
        return wordReverse;
    }
}