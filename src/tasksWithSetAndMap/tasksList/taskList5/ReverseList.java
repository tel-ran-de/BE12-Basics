package tasksWithSetAndMap.tasksList.taskList5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * JavaAdvanced
 * 26.09.20 19 23
 */

public class ReverseList {
    public static void main(String[] args) {
        //к задаче 5
        // вариант 1
//        List<Integer> list = new ArrayList<>();
//        list.addAll(Arrays.asList(1, 2, 3, 4, 5));
        //System.out.println(getReversedList(list));
        // вариант 2
//        System.out.println(getReversedList2(list));
    }

    //  Задача 5 (List). Написать функцию, которая реверсирует список, возвращает список элементовв
    //  обратном порядке. {1, 2, 3, 4, 5} -> {5, 4, 3, 2, 1}
    //первый вариант решения
    public static List<Integer> getReversedList(List<Integer> list) {
        if (list == null) return new ArrayList<>();
        List<Integer> reversedList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }

    //второй вариант решения
    public static List<Integer> getReversedList2(List<Integer> list) {
        if (list == null) return new ArrayList<>();
        Collections.reverse(list);
        return list;
    }
}
