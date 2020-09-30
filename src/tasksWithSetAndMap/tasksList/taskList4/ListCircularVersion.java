package tasksWithSetAndMap.tasksList.taskList4;

import java.util.Collections;
import java.util.List;

/**
 * JavaAdvanced
 * 27.09.20
 */


public class ListCircularVersion {
    public static void main(String[] args) {
        // к задаче4
//        List<String> listOne = new ArrayList<>();
//        List<String> listTwo = new ArrayList<>();
//        listOne.addAll(Arrays.asList("aa", "bb", "cc", "dd"));
//        listTwo.addAll(Arrays.asList("cc", "dd", "aa", "bb"));
//        System.out.println(checkIsListCircularVersionOfAnother(listOne, listTwo));//true
    }
    //Задача 4 (List). Есть два списка с буквами. Определить, является ли один список циклическойверсией другого.
    // Например, для списков {aa, bb, cc, dd} и {cc, dd, aa, bb}результат будет true, а для {dd, ee, ff}
    // и {dd, ff, ee} - false.
    public static boolean checkIsListCircularVersionOfAnother(List<String> listOne, List<String> listTwo) {
        if (listOne != null && listTwo != null) {
            if (listOne.size() == listTwo.size()) {
                for (int i = listOne.size(); i >= 0; i--) {
                    //Rotating an array by distance 1
                    Collections.rotate(listOne, 1);
                    if (listOne.equals(listTwo)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
