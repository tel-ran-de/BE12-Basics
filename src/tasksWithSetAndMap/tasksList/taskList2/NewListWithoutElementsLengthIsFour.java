package tasksWithSetAndMap.tasksList.taskList2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * JavaAdvanced
 * 27.09.20
 */
public class NewListWithoutElementsLengthIsFour {
    public static void main(String[] args) {
// к задаче 2
        List<String> input = new ArrayList<>();
        input.addAll(Arrays.asList("Ivan", "Maria", "Stephan", "John", "Amalia"));
        System.out.println(getNewListWithoutNamesLengthIsFour(input));
        System.out.println(getNewListWithoutNamesLengthIsFour2(input));
    }

    // Задача 2 (List). Есть список с именами: Ivan, Maria, Stephan, John, Amalia. Написать функцию,которая
    // вернет список, в котором не содержатся имена исходного списка,длиной 4.
    //вариант 1
    public static List<String> getNewListWithoutNamesLengthIsFour(List<String> input) {
        if (input == null || input.isEmpty()) return new ArrayList<>();
        List<String> result = new ArrayList<>();
        for (String str : input) {
            if (str.length() != 4) {
                result.add(str);
            }
        }
        return result;
    }

    //вариант 2
    public static List<String> getNewListWithoutNamesLengthIsFour2(List<String> input) {
        if (input == null || input.isEmpty()) return new ArrayList<>();
            input.removeIf(str -> str.length() == 4);
        return input;
    }
}
