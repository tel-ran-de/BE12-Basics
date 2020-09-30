package tasksWithSetAndMap.tasksSet.setTask2;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static tasksWithSetAndMap.tasksSet.setTask2.removeDuplicates.removeDuplicates;

/**
 * JavaAdvanced
 * 27.09.20 16 22
 */

public class removeDuplicatesTest {
    @Test
    public void removeDuplicates_ListWithDuplicates_newList(){
        List<String> input = new ArrayList<>();
        input.addAll(Arrays.asList("Ivan", "Maria", "Piotr", "Anna", "Maria", "Ivan"));
        List<String>result = new ArrayList<>(new HashSet<String>(input));
        Assert.assertEquals(result, removeDuplicates(input));
    }

    @Test
    public void removeDuplicates_ListWithoutDuplicates_SameList(){
        List<String> input = new ArrayList<>();
        input.addAll(Arrays.asList("Ivan", "Maria", "Piotr", "Anna"));
        List<String>result = new ArrayList<>(new HashSet<String>(input));
        Assert.assertEquals(result, removeDuplicates(input));
    }

    @Test
    public void removeDuplicates_ListIsNull_newList(){
        List<String> input = null;
        List<String>result = new ArrayList<String>();
        Assert.assertEquals(result, removeDuplicates(input));
    }

    @Test
    public void removeDuplicates_ListIsEmpty_newList(){
        List<String> input = new ArrayList<>();
        List<String>result = new ArrayList<String>();
        Assert.assertEquals(result, removeDuplicates(input));
    }
}
