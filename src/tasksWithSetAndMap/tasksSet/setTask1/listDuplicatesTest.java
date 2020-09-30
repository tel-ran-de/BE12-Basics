package tasksWithSetAndMap.tasksSet.setTask1;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.*;

import static tasksWithSetAndMap.tasksSet.setTask1.listDuplicates.getDuplicates;

/**
 * JavaAdvanced
 * 27.09.20 16 57
 */

class listDuplicatesTest {
    @Test
    public void getDuplicates_ListWithDuplicates_newList(){
        List<String> input = new ArrayList<>();
        input.addAll(Arrays.asList("Ivan", "Maria", "Piotr", "Anna", "Maria", "Ivan"));

        Set<String> set1 = new HashSet<>();
        set1.add("Ivan");
        set1.add("Maria");
        Assert.assertEquals(set1, new HashSet<String>(getDuplicates(input)));
    }

    @Test
    public void getDuplicates_ListWithoutDuplicates_SameList(){
        List<String> input = new ArrayList<>();
        input.addAll(Arrays.asList("Piotr", "Anna", "Maria", "Ivan"));

        Set<String> set1 = new HashSet<>();
        Assert.assertEquals(set1, new HashSet<String>(getDuplicates(input)));
    }

    @Test
    public void getDuplicates_ListIsNull_newList(){
        List<String> input = null;
        List<String>result = new ArrayList<String>();
        Assert.assertEquals(result, getDuplicates(input));
    }

    @Test
    public void getDuplicates_ListIsEmpty_newList(){
        List<String> input = new ArrayList<>();
        List<String>result = new ArrayList<String>();
        Assert.assertEquals(result, getDuplicates(input));
    }
}
