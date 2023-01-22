package exercise;

import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String stringOfSymbols, String word) {
        List<String> listOfSymbols = new ArrayList<>(stringOfSymbols.length());
        char[] charArrayOfSymbols = stringOfSymbols.toCharArray();
        char[] charArrayWord = word.toCharArray();

        for (int i = 0; i < charArrayOfSymbols.length; i++) {
            listOfSymbols.add(String.valueOf(charArrayOfSymbols[i]));
        }

        for (int i = 0; i < charArrayWord.length; i++) {
            String currentSymbolString = String.valueOf(charArrayWord[i]).toLowerCase();
            if (listOfSymbols.contains(currentSymbolString)) {
                listOfSymbols.remove(currentSymbolString);
            } else {
                return false;
            }
        }
        return true;
    }
}
//END
