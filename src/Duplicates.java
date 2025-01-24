import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Duplicates {

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();

        for (String word : list) {
            int number = 1;
            if (result.containsKey(word)) {
                number = result.get(word) + 1;
            }
            result.put(word, number);
        }

        return result;
    }

}
