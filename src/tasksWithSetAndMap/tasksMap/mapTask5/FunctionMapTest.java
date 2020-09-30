package tasksWithSetAndMap.tasksMap.mapTask5;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * JavaAdvanced
 * 27.09.20
 */

class FunctionMapTest {

    @Test
    public void apply_String_Map() {
        String str = "один над столом, один дома. один стул, в доме. из окна. в, на, под";
        FunctionMap function = new FunctionMap();
        Map<String, Integer> map = new HashMap<>();
        map.put("окна", 1);
        map.put("один", 3);
        map.put("стул", 1);
        map.put("столом", 1);
        map.put("дома", 1);
        map.put("доме", 1);

        assertEquals(map, function.apply(str, new PredicatePrepositions()));
    }

    @Test
    public void apply_StringOlyWithPrepositionsAndPunctuation_marks_Map() {
        String str = ".....,,,в,на,под";
        FunctionMap function = new FunctionMap();
        Map<String, Integer> map = new HashMap<>();

        assertEquals(map, function.apply(str, new PredicatePrepositions()));
    }

    @Test
    public void apply_StringIsNull_EmptyMap() {
        String str = null;
        FunctionMap function = new FunctionMap();
        Map<String, Integer> map = new HashMap<>();

        assertEquals(map, function.apply(str, new PredicatePrepositions()));
    }

    @Test
    public void apply_StringIsEmpty_EmptyMap() {
        String str = "";
        FunctionMap function = new FunctionMap();
        Map<String, Integer> map = new HashMap<>();

        assertEquals(map, function.apply(str, new PredicatePrepositions()));
    }

}