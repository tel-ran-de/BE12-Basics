package tasksWithSetAndMap.tasksList.taskList4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JavaAdvanced
 * 27.09.20 22 26
 */

class ListCircularVersionTest {
    @Test
    public void checkIsListCircularVersionOfAnother_List_ListIsCircularVersion() {
        List<String> listOne = new ArrayList<>();
        List<String> listTwo = new ArrayList<>();
        listOne.addAll(Arrays.asList("aa", "bb", "cc", "dd"));
        listTwo.addAll(Arrays.asList("cc", "dd", "aa", "bb"));

        assertTrue(ListCircularVersion.checkIsListCircularVersionOfAnother(listOne, listTwo));
    }

    @Test
    public void checkIsListCircularVersionOfAnother_List_ListIsNotCircularVersion() {
        List<String> listOne = new ArrayList<>();
        List<String> listTwo = new ArrayList<>();
        listOne.addAll(Arrays.asList("dd", "ee", "ff"));
        listTwo.addAll(Arrays.asList("dd", "ff", "ee"));

        assertFalse(ListCircularVersion.checkIsListCircularVersionOfAnother(listOne, listTwo));
    }

    @Test
    public void checkIsListCircularVersionOfAnother_List_ListHasNotSameLength() {
        List<String> listOne = new ArrayList<>();
        List<String> listTwo = new ArrayList<>();
        listOne.addAll(Arrays.asList("dd", "ee", "ff"));
        listTwo.addAll(Arrays.asList("dd", "ff"));

        assertFalse(ListCircularVersion.checkIsListCircularVersionOfAnother(listOne, listTwo));
    }

    @Test
    public void checkIsListCircularVersionOfAnother_ListIsNull_ListHasNotSameLength() {
        List<String> listOne = null;
        List<String> listTwo = new ArrayList<>();
        listTwo.addAll(Arrays.asList("dd", "ff"));

        assertFalse(ListCircularVersion.checkIsListCircularVersionOfAnother(null, listTwo));
    }

    @Test
    public void checkIsListCircularVersionOfAnother_List_ListIsNull() {
        List<String> listOne = new ArrayList<>();
        List<String> listTwo = null;
        listOne.addAll(Arrays.asList("dd", "ee", "ff"));

        assertFalse(ListCircularVersion.checkIsListCircularVersionOfAnother(listOne, null));
    }


}