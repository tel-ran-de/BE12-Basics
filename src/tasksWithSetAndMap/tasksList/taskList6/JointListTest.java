package tasksWithSetAndMap.tasksList.taskList6;

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


class JointListTest {
    @Test
    public void joinTwoLists_ListFirst_ListSecond_ResultIsNewList() {
        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 2, 3, 4));
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(5, 2, 3, 8));

        List<Integer> result = new ArrayList<>();
        result.addAll(Arrays.asList(1, 2, 3, 4, 5, 2, 3, 8));
        assertEquals(result, JointList.joinTwoLists(list1, list2));
    }
    @Test
    public void joinTwoLists_ListFirstIsNull_ListSecondIsNull_ResultIsEmptyNewList() {
        List<Integer> list1 = null;
        List<Integer> list2 = null;
        assertEquals(new ArrayList<>(), JointList.joinTwoLists(list1, list2));
    }

}