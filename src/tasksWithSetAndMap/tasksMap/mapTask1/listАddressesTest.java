package tasksWithSetAndMap.tasksMap.mapTask1;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static tasksWithSetAndMap.tasksMap.mapTask1.listАddresses.mapAB;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * JavaAdvanced
 * 27.09.20 17 35
 */

class listАddressesTest {
    @Test
    public void mapAB_MapWithTwoRightElements_MapWithNewElement() {
        Map<String, String> map = new HashMap<>();
        map.put("a", "Hi");
        map.put("b", "There");

        Map<String, String> result = new HashMap<>();
        result.put("a", "Hi");
        result.put("b", "There");
        result.put("ab", "HiThere");

        assertEquals(result, mapAB(map, "a", "b"));
    }

    @Test
    public void mapAB_MapWithOneElements_SameMap() {
        Map<String, String> map = new HashMap<>();
        map.put("a", "Hi");
        assertEquals(map, mapAB(map, "a", "b"));
    }

    @Test
    public void mapAB_MapIsNull_Map() {
        Map<String, String> map = null;
        assertEquals(map, mapAB(map, "a", "b"));
    }

    @Test
    public void mapAB_MapIsEmpty_Map() {
        Map<String, String> map = new HashMap<>();
        assertEquals(map, mapAB(map, "a", "b"));
    }
}
