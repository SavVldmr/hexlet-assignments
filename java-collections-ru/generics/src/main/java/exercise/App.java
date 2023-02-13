package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
class App {
    public static <T> List findWhere(List<Map<T, T>> books, Map<T, T> dictionary) {
        System.out.println("======================================");
        System.out.println("books: " + books);
        System.out.println("dictionary: " + dictionary);
        List<Map<T, T>> result = new ArrayList();
        for (Map<T, T> book: books) {
            boolean needToAddToResult = true;
            for (Map.Entry<T, T> recordOfDictionary: dictionary.entrySet()) {
                if (book.containsKey(recordOfDictionary.getKey())) {
                    needToAddToResult = book.get(recordOfDictionary.getKey()).equals(recordOfDictionary.getValue());
                    System.out.println("compare:"
                            + book.get(recordOfDictionary.getKey())
                            + " and "
                            + recordOfDictionary.getValue()
                            + " result: " + needToAddToResult);
                }
                if (!needToAddToResult) {
                    break;
                }
            }
            if (needToAddToResult) {
                result.add(book);
                System.out.println("add to result: " + book);
            }
        }
        return result;
    }
}
//END
