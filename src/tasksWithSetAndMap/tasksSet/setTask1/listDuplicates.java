package tasksWithSetAndMap.tasksSet.setTask1;

import java.util.*;

/**
 * JavaAdvanced
 * 27.09.20 16 04
 */
public class listDuplicates {
    public static void main(String[] args) {
        List<String> input = new ArrayList<>();
        input.addAll(Arrays.asList("Ivan", "Maria", "Piotr", "Anna", "Maria", "Ivan"));
        System.out.println(getDuplicates(input));
    }

    // Задача 2: С использованием множеств реализовать функцию, которая вернетповторяющиеся элементы из данного списка:
    // List<String> getDuplicates(List<String> input)Пример:{“Ivan”, “Maria”, “Piotr”, “Anna”, “Maria”, “Ivan”}
    // -> {“Ivan”, “Maria”}
    public static List<String> getDuplicates(List<String> input) {
        List<String> duplicates = new ArrayList<>();
        Set<String> uniqueSet = new HashSet<>();
        if (input != null) {
            for (String str : input) {
                if (!uniqueSet.add(str)) {
                    duplicates.add(str);
                }
            }
        }
        return duplicates;
    }
}
