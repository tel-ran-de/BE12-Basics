package tasksWithSetAndMap.tasksMap.mapTask1;

import java.util.Map;

/**
 * JavaAdvanced
 * 26.09.20 17 34
 */
public class listАddresses {
    public static void main(String[] args) {
    }
    // Задача 1 (Map). Дана Map<String, String> map, написать функцию, которая вернет Мап, такую,если в есходной map есть
// ключ ‘a’ и ‘b’, то нужно создать новый ключ ‘ab’ ссуммой значений от ключей a и b.
    public static Map<String, String> mapAB(Map<String, String> map, String key1, String key2) {
        if (map != null && !map.isEmpty()) {
            if (map.containsKey(key1) && map.containsKey(key2)) {
                map.put(key1 + key2, map.get("a") + map.get("b"));
            }
        }
        return map;
    }
}
