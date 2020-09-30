package tasksWithSetAndMap.tasksList.taskList3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * JavaAdvanced
 * 28.09.20
 */

class NewListOfStringsTest {
    @Test
    public void getNewListOfStrings_List1_List2_ListStringShowСoincidences() {
        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 2, 3, 4));
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(5, 2, 3, 8));

        List<String> result = new ArrayList<>();
        result.addAll(Arrays.asList("No", "Yes", "Yes", "No"));
        assertEquals(result, NewListOfStrings.getNewListOfStrings(list1, list2));
    }

    @Test
    public void getNewListOfStrings_List1IsNull_List2_ListStringIsEmpty() {
        List<Integer> list1 = null;
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(5, 2, 3, 8));
        assertEquals(new ArrayList<>(), NewListOfStrings.getNewListOfStrings(list1, list2));
    }

    @Test
    public void getNewListOfStrings_List1IsEmpty_List2_ListStringIsEmpty() {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(5, 2, 3, 8));
        assertEquals(new ArrayList<>(), NewListOfStrings.getNewListOfStrings(list1, list2));
    }
}
