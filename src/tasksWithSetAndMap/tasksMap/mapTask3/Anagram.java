package tasksWithSetAndMap.tasksMap.mapTask3;

import java.util.*;

/**
 * JavaAdvanced
 * 29.09.20 19 35
 */
public class Anagram {
    private Set<String> setDictionary;
    private Map<String, List<String>> map = new HashMap<>();

    public Anagram(Set<String> setDictionary) {
        this.setDictionary = setDictionary;
        addDictionaryToMap();
    }

    // для удобства сравнения нужно отсортировать char по алфавиту
    public String sortStringAlphabetically(String str) {
        char[] array = str.toLowerCase().toCharArray();
        Arrays.sort(array);
        return new String(array);
    }

    public List<String> getAnagramByWordFromMap(String word) {
        String key = sortStringAlphabetically(word);
        List<String> result = map.get(key);

        if (result == null) {
            result = new ArrayList<>();
        }
        return result;
    }

    private void addDictionaryToMap() {
        for (String str : setDictionary) {
            String key = sortStringAlphabetically(str);
            List<String> value = map.get(key);
            if (value == null) {
                value = new ArrayList<>();
                value.add(str);
                map.put(key, value);
            } else {
                value.add(str);
                map.put(key, value);
            }
        }
    }
}
