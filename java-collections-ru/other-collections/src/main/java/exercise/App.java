package exercise;

import java.util.*;

// BEGIN
public class App {
    static Set<String> addedKeysSet = new HashSet<>();
    static Set<String> delKeysSet = new HashSet<>();
    static Set<String> doublesKeysSet = new HashSet<>();
    public static LinkedHashMap<String, String> genDiff(Map<String, Object> dictionaryA, Map<String, Object> dictionaryB) {
//        System.out.println("A===================");
//        System.out.println(dictionaryA.keySet());
//
//        System.out.println("B===================");
//        System.out.println(dictionaryB.keySet());
//        System.out.println("===================");
//
//        System.out.println("Add===================");
        addedKeysSet.addAll(dictionaryB.keySet());
        addedKeysSet.removeAll(dictionaryA.keySet());
//        System.out.println(addedKeysSet);
//        System.out.println("===================");

//        System.out.println("Del===================");
        delKeysSet.addAll(dictionaryA.keySet());
        delKeysSet.removeAll(dictionaryB.keySet());
//        System.out.println(delKeysSet);
//        System.out.println("===================");

//        System.out.println("Double===================");
        doublesKeysSet.addAll(dictionaryA.keySet());
        doublesKeysSet.retainAll(dictionaryB.keySet());
//        System.out.println(doublesKeysSet);
//        System.out.println("===================");

//        System.out.println("Union===================");
        Set<String> unionKeysSet = new HashSet<>();
        unionKeysSet.addAll(dictionaryA.keySet());
        unionKeysSet.addAll(dictionaryB.keySet());
//        System.out.println(unionKeysSet);
//        System.out.println("===================");

        LinkedHashMap<String, String> resultMap = new LinkedHashMap<>();
        unionKeysSet.stream().forEach(x -> resultMap.put(x, App.defineValue(x, doublesKeysSet.contains(x) && dictionaryA.get(x).equals(dictionaryB.get(x)))));
        return resultMap;
    }

    private static String defineValue(String key, boolean valuesEquals) {
        if (addedKeysSet.contains(key)) {
            return "added";
        } else if (delKeysSet.contains(key)) {
            return "deleted";
        } else if (doublesKeysSet.contains(key) && valuesEquals) {
            return "unchanged";
        } else {
            return "changed";
        }
    }
}
//END
