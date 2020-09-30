package tasksWithSetAndMap.tasksMap.mapTask5;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

/**
 * JavaAdvanced
 * 27.09.20
 */
//Задача 5. (Map)
//Дан текст, подсчитать, какое слово встречается больше остальных. Слова впредложениях могут разделяться запятыми,
// точками, пробелами. Предлоги [в,на, из, под] и остальные не учитывать при подсчете
public class FunctionMap implements BiFunction<String, Predicate<String>, Map<String, Integer>> {
    @Override
    public Map<String, Integer> apply(String str, Predicate<String> stringPredicate) {
        int count = 0;
        Map<String, Integer> map = new HashMap<>();
        if (str != null && str.length() != 0) {
            StringBuffer s = new StringBuffer(str);
            String newString = str.replaceAll("\\p{Punct}|\\s", " ");

            String[] words = newString.split("\\s+");
            for (String word : words) {
                if (word.length() != 0) { // доп проверка так, как лишний пробел может появится
                    //может появится после замены знаком пунктуации на проблем (str.replaceAll)
                    if (stringPredicate.test(word)) {
                        if (!map.containsKey(word)) {
                            map.put(word, 1);
                        } else {
                            count = map.get(word);
                            map.put(word, count + 1);
                        }
                    }
                }
            }
        }
        return map;
    }
}
