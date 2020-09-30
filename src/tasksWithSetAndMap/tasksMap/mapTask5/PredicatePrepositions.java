package tasksWithSetAndMap.tasksMap.mapTask5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * JavaAdvanced
 * 27.09.20
 */
//Задача 5. (Map)
//Дан текст, подсчитать, какое слово встречается больше остальных. Слова впредложениях могут разделяться запятыми,
// точками, пробелами. Предлоги [в,на, из, под] и остальные не учитывать при подсчете

public class PredicatePrepositions implements Predicate<String> {
    // метод проверяющий, является ли слово предлогом
    @Override
    public boolean test(String str) {
        List<String> listPrepositions = new ArrayList<>(); // список предлогов
        listPrepositions.addAll(Arrays.asList("в", "над", "под", "y", "между", "на", "около", "k",
                "из", "за","к","через"));
        return !listPrepositions.contains(str);
    }
}
