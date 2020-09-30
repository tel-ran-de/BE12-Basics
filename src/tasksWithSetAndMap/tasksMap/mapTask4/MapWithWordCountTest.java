package tasksWithSetAndMap.tasksMap.mapTask4;

import org.junit.jupiter.api.Test;

import java.util.*;

import static tasksWithSetAndMap.tasksMap.mapTask4.MapWithWordCount.getNewMapWithValueIsWordCount;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * JavaAdvanced
 * 27.09.20 19 40
 */

class MapWithWordCountTest {
    @Test
    public void getNewMapWithValueIsWordCount_ListNames_MapWithWordsCount() {
        List<String> input = new ArrayList<>();
        input.addAll(Arrays.asList("Ivan", "Ivan", "Maria", "Stephan", "Maria", "Ivan", "Ivan"));

        Map<String, Integer> result = new HashMap<>();
        result.put("Ivan", 4);
        result.put("Maria", 2);
        result.put("Stephan", 1);
        assertEquals(result, getNewMapWithValueIsWordCount(input));
    }

    @Test
    public void getNewMapWithValueIsWordCount_ListNamesIsNull_MapWithWordsCount() {
        List<String> input = null;

        Map<String, Integer> result = new HashMap<>();
        assertEquals(result, getNewMapWithValueIsWordCount(input));
    }

    @Test
    public void getNewMapWithValueIsWordCount_ListNamesIsEmpty_MapWithWordsCount() {
        List<String> input = new ArrayList<>();

        Map<String, Integer> result = new HashMap<>();
        assertEquals(result, getNewMapWithValueIsWordCount(input));
    }
}
