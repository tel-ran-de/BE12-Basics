package tasksWithSetAndMap.tasksMap.mapTask4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * JavaAdvanced
 * 26.09.20 18 59
 */


public class MapWithWordCount {
    public static void main(String[] args) {
    }
    //Задача 4 (Map).
    //Дан список имен, где некоторые имена повторяются. Написать функцию,которая по имени вернет количество вхождений
    // этого имени в список.
    public static Map<String, Integer> getNewMapWithValueIsWordCount(List<String> list) {
        int count = 0;
        Map<String, Integer> map = new HashMap<String, Integer>();
        if (list != null && !list.isEmpty()) {

            for (String str : list) {
                if (!map.containsKey(str)) {
                    map.put(str, 1);
                } else {
                    count = map.get(str);
                    map.put(str, count + 1);
                }
            }
        }
        return map;
    }
}
