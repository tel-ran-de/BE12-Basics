package tasksWithSetAndMap.tasksSet.setTask2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * JavaAdvanced
 * 26.09.20 13 43
 */
public class removeDuplicates {
    public static void main(String[] args) {
    }

    // Задача 1 Set: С использованием множеств (Set) реализовать функцию, которая вернет списокбез повторяющихся элементов:
    // List<String> removeDuplicates(List<String> input) Пример: {“Ivan”, “Maria”, “Piotr”, “Anna”, “Maria”, “Ivan”} ->
    // {“Ivan”, “Maria”, “Piotr”,“Anna”}2.
    public static List<String> removeDuplicates(List<String> input) {
        if (input == null) return new ArrayList<String>();
        List<String> result = new ArrayList<>(new HashSet<>(input));
        return result;
    }
}
