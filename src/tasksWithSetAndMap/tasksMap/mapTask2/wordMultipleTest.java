package tasksWithSetAndMap.tasksMap.mapTask2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static tasksWithSetAndMap.tasksMap.mapTask2.WordMultiple.wordMultiple;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * JavaAdvanced
 * 26.09.20 15 04
 */

class WordMultipleTest {
    @Test
    public void wordMultiple_arrayWithDuplicates_newMapWithOneElement(){
        String[] array = {"c", "c", "c", "c"};
        Map<String, Boolean> map=new HashMap<>();
        map.put("c",true);
        assertEquals(map, wordMultiple(array));
    }

    @Test
    public void wordMultiple_arrayWithoutDuplicates_newMap(){
        String[] array = {"c", "b", "a"};
        Map<String, Boolean> map=new HashMap<>();
        map.put("c",false);
        map.put("b",false);
        map.put("a",false);
        assertEquals(map, wordMultiple(array));
    }
    @Test
    public void wordMultiple_arrayWithDuplicates_newMap(){
        String[] array = {"a", "b", "a", "c", "b"};
        Map<String, Boolean> map=new HashMap<>();
        map.put("a",true);
        map.put("b",true);
        map.put("c",false);
        assertEquals(map, wordMultiple(array));
    }

    @Test
    public void wordMultiple_arrayIsEmpty_newMap(){
        String[] array = {};
        Map<String, Boolean> map=new HashMap<>();
        assertEquals(map, wordMultiple(array));
    }


}