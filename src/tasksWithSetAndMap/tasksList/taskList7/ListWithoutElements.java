package tasksWithSetAndMap.tasksList.taskList7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * JavaAdvanced
 * 27.09.20
 */

public class ListWithoutElements {
    public static void main(String[] args) {
        // к задачк 7
        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(getNewListWithoutNamesNumber(list3, 3));
    }
    //Задача 7.
    // Есть список с целыми числами. Написать функцию, которая вернет список без элементов, больше заданного.
    public static List<Integer> getNewListWithoutNamesNumber(List<Integer> input, int number){
        input.removeIf(integer -> integer > number);
        return input;
    }
}
