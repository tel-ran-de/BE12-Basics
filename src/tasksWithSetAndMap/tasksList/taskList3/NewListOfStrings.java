package tasksWithSetAndMap.tasksList.taskList3;

import java.util.ArrayList;
import java.util.List;

/**
 * JavaAdvanced
 * 27.09.20
 */

public class NewListOfStrings {
    public static void main(String[] args) {
    }

    // Задача 3 (List). Есть два списка одинаковой длины с числами. Написать функцию, которая вернет список с элементами
    // Yes или No, где значение на i-том месте зависит от того, равны ли элементы двух списков под номером i.
    // Например, {1, 2, 3, 4} и {5,2, 3, 8} вернет {No, Yes, Yes, No}
    public static List<String> getNewListOfStrings(List<Integer> list1, List<Integer> list2) {
        List<String> result = new ArrayList<>();
        if (list1 == null || list2 == null) return new ArrayList<>();
        for (Integer integer1 : list1) {
            if (list2.contains(integer1)) {
                result.add("Yes");
            } else {
                result.add("No");
            }
        }
        return result;
    }
}
