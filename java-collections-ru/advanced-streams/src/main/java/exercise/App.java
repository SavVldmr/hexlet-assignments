package exercise;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

// BEGIN
public class App {
    public static String getForwardedVariables(String stringFile) {


        List<String> envLine = stringFile.lines()
                .filter(x -> x.startsWith("environment=\""))
                .toList();
        String result = new String();
        for (int j = 0; j < envLine.size(); j++){
            List<String> listOfVariables = Arrays.stream(envLine.get(j)
                            .replaceAll("\"", "")
                            .replaceAll("environment=", "")
                            .trim()
                            .split(","))
//                .peek(System.out::println)
                    .filter(str -> str.startsWith("X_FORWARDED_"))
                    .toList();
            for (int i = 0; i < listOfVariables.size(); i++) {
                result = result.concat(listOfVariables.get(i)
                        .replaceAll("X_FORWARDED_", "") + ",");
            }
        }
        result = result.substring(0, result.length() - 1);
        System.out.println(result);
        return result;
    }
}
//END
