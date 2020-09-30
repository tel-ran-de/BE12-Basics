package tasksWithSetAndMap.tasksList.taskList2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static tasksWithSetAndMap.tasksList.taskList2.NewListWithoutElementsLengthIsFour.getNewListWithoutNamesLengthIsFour2;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * JavaAdvanced
 * 27.09.20
 */

class NewListWithoutElementsLengthIsFourTest {
    @Test
    public void getNewListWithoutNamesLengthIsFour2_ListWithElementsLength4_NewList(){
        List<String> input = new ArrayList<>();
        input.addAll(Arrays.asList("Ivan", "Maria", "Stephan", "John", "Amalia"));
        List<String> result = new ArrayList<>();
        result.addAll(Arrays.asList("Maria", "Stephan", "Amalia"));
        assertEquals(result, getNewListWithoutNamesLengthIsFour2(input));
    }

    @Test
    public void getNewListWithoutNamesLengthIsFour2_ListWithoutElementsLength4_SameList(){
        List<String> input = new ArrayList<>();
        input.addAll(Arrays.asList("Maria", "Stephan", "Amalia"));
        List<String> result = new ArrayList<>();
        result.addAll(Arrays.asList("Maria", "Stephan", "Amalia"));
        assertEquals(result, getNewListWithoutNamesLengthIsFour2(input));
    }

    @Test
    public void getNewListWithoutNamesLengthIsFour2_ListIsNull_ListIsEmpty(){
        List<String> input =null;
        List<String> result = new ArrayList<>();
        assertEquals(result, getNewListWithoutNamesLengthIsFour2(input));
    }

    @Test
    public void getNewListWithoutNamesLengthIsFour2_ListIsEmpty_ListIsEmpty(){
        List<String> input =new ArrayList<>();
        List<String> result = new ArrayList<>();
        assertEquals(result, getNewListWithoutNamesLengthIsFour2(input));
    }

    @Test
    public void getNewListWithoutNamesLengthIsFour_ListWithElementsLength4_NewList(){
        List<String> input = new ArrayList<>();
        input.addAll(Arrays.asList("Ivan", "Maria", "Stephan", "John", "Amalia"));
        List<String> result = new ArrayList<>();
        result.addAll(Arrays.asList("Maria", "Stephan", "Amalia"));
        assertEquals(result, getNewListWithoutNamesLengthIsFour2(input));
    }

    @Test
    public void getNewListWithoutNamesLengthIsFour_ListWithoutElementsLength4_SameList(){
        List<String> input = new ArrayList<>();
        input.addAll(Arrays.asList("Maria", "Stephan", "Amalia"));
        List<String> result = new ArrayList<>();
        result.addAll(Arrays.asList("Maria", "Stephan", "Amalia"));
        assertEquals(result, getNewListWithoutNamesLengthIsFour2(input));
    }

    @Test
    public void getNewListWithoutNamesLengthIsFour_ListIsNull_ListIsEmpty(){
        List<String> input =null;
        List<String> result = new ArrayList<>();
        assertEquals(result, getNewListWithoutNamesLengthIsFour2(input));
    }

    @Test
    public void getNewListWithoutNamesLengthIsFour_ListIsEmpty_ListIsEmpty(){
        List<String> input =new ArrayList<>();
        List<String> result = new ArrayList<>();
        assertEquals(result, getNewListWithoutNamesLengthIsFour2(input));
    }


}