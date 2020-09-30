package tasksWithSetAndMap.tasksList.taskList5;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * JavaAdvanced
 * 28.09.20 22 50
 */


class ReverseListTest {
    // вариант1
    @Test
    public void getReversedList_List_ReversedList() {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> result = new ArrayList<>();
        result.addAll(Arrays.asList(5, 4, 3, 2, 1));
        assertEquals(result, ReverseList.getReversedList(list));
    }

    @Test
    public void getReversedList_ListIsEmpty_ReversedListIsEmpty() {
        List<Integer> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        assertEquals(result, ReverseList.getReversedList(list));
    }

    @Test
    public void getReversedList_ListIsNull_ReversedListIsEmpty() {
        List<Integer> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        assertEquals(result, ReverseList.getReversedList(list));
    }

    // вариант 2
    @Test
    public void getReversedList2_List_ReversedList() {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> result = new ArrayList<>();
        result.addAll(Arrays.asList(5, 4, 3, 2, 1));
        assertEquals(result, ReverseList.getReversedList2(list));
    }

    @Test
    public void getReversedList2_ListIsEmpty_ReversedListIsEmpty() {
        List<Integer> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        assertEquals(result, ReverseList.getReversedList2(list));
    }

    @Test
    public void getReversedList2_ListIsNull_ReversedListIsEmpty() {
        List<Integer> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        assertEquals(result, ReverseList.getReversedList2(list));
    }
}
