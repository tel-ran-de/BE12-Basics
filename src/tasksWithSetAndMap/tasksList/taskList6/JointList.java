package tasksWithSetAndMap.tasksList.taskList6;

import java.util.ArrayList;
import java.util.List;

/**
 * JavaAdvanced
 * 27.09.20
 */


public class JointList {
    public static void main(String[] args) {
        //к задаче 6
//        List<Integer> list1 = new ArrayList<>();
//        list1.addAll(Arrays.asList(1, 2, 3, 4));
//        List<Integer> list2 = new ArrayList<>();
//        list2.addAll(Arrays.asList(5, 2, 3, 8));
//        System.out.println(joinTwoLists(list1, list2));
    }
    //Задача 6 (List).
    //Объединить два списка в один.
    public static List<Integer> joinTwoLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> newList = new ArrayList<>();
        if (list1 != null && list2 != null) {
            newList.addAll(list1);
            newList.addAll(list2);
        }
        return newList;
    }
}
