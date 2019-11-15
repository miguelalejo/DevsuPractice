package ec.devsu.code.jam;

import java.util.ArrayList;
import java.util.List;

/**
 * Justify
 */
public class Justify {

    public String justifyText(String text, int linewidth) {
        if (text == null || linewidth == 0) {
            throw new RuntimeException("Invalid Parameters");
        }
        String textJustified = "";
        List<String> words = findWords(text);
        int numberOfSpaces = 0;
        boolean lastLine = false;
        for (int k = 0; k < words.size();) {
            while (isSpace(words.get(k))) {
                k++;
                numberOfSpaces++;
                if (k >= words.size()) {
                    break;
                }
            }
            if (numberOfSpaces == words.size()) {
                throw new RuntimeException("There are no words");
            }
            int numberOfCharacters = 0;
            String lineJustified = "";
            while (numberOfCharacters < linewidth) {
                String wordTemp = words.get(k);
                if (wordTemp.length() > linewidth) {
                    throw new RuntimeException("A word can't be splitted");
                }
                numberOfCharacters += wordTemp.length();
                if (numberOfCharacters > linewidth) {
                    break;
                }
                lineJustified += wordTemp;
                k++;
                if (k >= words.size()) {
                    lastLine = true;
                    break;
                }
            }
            if (lastLine) {
                textJustified += lineJustified.trim();
            } else {
                textJustified += preprareLineText(lineJustified.trim(), linewidth) + "\n";
            }
        }
        return textJustified;

    }

    public String preprareLineText(String text, int linewidth) {

        List<String> words = findWords(text);
        int numberOfSpaces = linewidth - text.length();
        boolean hasSpaces = true;
        if (numberOfSpaces == 0) {
            return text;
        }
        while (numberOfSpaces > 0 && hasSpaces) {
            hasSpaces = false;
            for (int i = 0; i < words.size(); i++) {
                if (isSpace(words.get(i))) {
                    String tempWord = words.get(i) + " ";
                    words.set(i, tempWord);
                    numberOfSpaces--;
                    hasSpaces = true;
                }
                if (numberOfSpaces == 0) {
                    break;
                }
            }
        }
        String cadWithSpaces = "";
        for (int i = 0; i < words.size(); i++) {
            cadWithSpaces += words.get(i);
        }
        if (cadWithSpaces.length() != linewidth && hasSpaces) {
            throw new RuntimeException("Line Lenght String is No Same Line With");
        }
        return cadWithSpaces;

    }

    public List<String> findWords(String text) {
        List<String> words = new ArrayList<String>();
        for (int i = 0; i < text.length(); i++) {
            String letter = String.valueOf(text.charAt(i));
            if (isSpace(letter)) {
                words.add(letter);
            } else {
                String word = "";
                while (!isSpace(letter)) {
                    word += letter;
                    i++;
                    if (i >= text.length()) {
                        break;
                    }
                    letter = String.valueOf(text.charAt(i));
                }
                words.add(word);
                i--;
            }
        }
        return words;
    }

    private boolean isSpace(String letter) {
        return " ".equals(letter);
    }

    private boolean isWord(String word) {
        return !word.contains(" ");
    }

    private int findPreviousSpaceIndex(String text, int index) {
        for (int k = text.length() - 1; k >= 0; k--) {
            String letter = String.valueOf(text.charAt(k));
            if (isSpace(letter)) {
                return k;
            }
        }
        return index;

    }

}