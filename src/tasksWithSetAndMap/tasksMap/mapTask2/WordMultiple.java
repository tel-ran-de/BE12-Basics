package tasksWithSetAndMap.tasksMap.mapTask2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * JavaAdvanced
 * 26.09.20 15 02
 */
public class WordMultiple {
    public static void main(String[] args) {
    }

    // Задача 2 (Map).
    // Дан массив букв, вернуть мапу Map<String, Boolean> где каждая строкаявляется ключем, а значением true,
    // если строка в массиве больше одного разаи false, если только один раз.
    public static Map<String, Boolean> wordMultiple(String[] array) {
        Map<String, Boolean> mapResult = new HashMap<>();
        if (array.length != 0) {
            Set<String> set = new HashSet<String>();
            for (int i = 0; i < array.length; i++) {
                mapResult.put(array[i], false);
                if (set.add(array[i]) == false) {
                    mapResult.put(array[i], true);
                }
            }
        }
        return mapResult;
    }
}
