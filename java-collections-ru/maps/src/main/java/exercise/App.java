package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {
    public static Map getWordCount(String text) {
        String[] words = text.split(" ");
        Map<String, Integer> dictionary = new HashMap<>();
        System.out.println(text);
        System.out.println("===============");
        if (text.length() != 0) {
            for(String word : words) {
                if (!dictionary.containsKey(word)) {
                    dictionary.put(word, 1);
                    System.out.println("add new record: " + word + " 1");
                } else {
                    Integer count = dictionary.get(word);
                    dictionary.put(word, ++count);
                    System.out.println("edit record: " + word + " " + count);
                }
            }
        }
    return dictionary;
    }

    public static String toString(Map<String, Integer> dictionary) {
        String result = new String();
        result = result.concat("{");
        for (Map.Entry<String, Integer> record: dictionary.entrySet()) {
            result = result.concat("  " + record.getKey() + ": " + record.getValue() + "\n");
        }
        result = result.concat("}");
        System.out.println(result);
        System.out.println(result.length());
        return result;
    }
}
//END
