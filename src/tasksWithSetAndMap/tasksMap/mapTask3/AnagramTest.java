package tasksWithSetAndMap.tasksMap.mapTask3;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * JavaAdvanced
 * 30.09.20 19 01
 */


class AnagramTest {
    @Test
    public void getAnagramByWordFromMap_word_ListWithAnagrams(){
        Set<String> setDictionary = new HashSet<>();
        setDictionary.addAll(Arrays.asList("anna", "ivan", "naan", "vani", "piotr", "nana", "navi"));
        Anagram anagram = new Anagram(setDictionary);
        List<String> listAnagrams = new ArrayList<>();
        listAnagrams.addAll(Arrays.asList("vani", "navi", "ivan"));
        assertEquals(listAnagrams, anagram.getAnagramByWordFromMap("ivan"));
    }

    @Test
    public void getAnagramByWordFromMap_word_ListWithAnagrams2(){
        Set<String> setDictionary = new HashSet<>();
        setDictionary.addAll(Arrays.asList("anna", "ivan", "naan", "vani", "piotr", "nana", "navi"));
        Anagram anagram = new Anagram(setDictionary);
        List<String> listAnagrams = new ArrayList<>();
        listAnagrams.addAll(Arrays.asList("naan", "nana", "anna"));
        assertEquals(listAnagrams, anagram.getAnagramByWordFromMap("anna"));
    }

    @Test
    public void getAnagramByWordFromMap_setDictionaryIsEmpty_ListWithAnagrams(){
        Set<String> setDictionary = new HashSet<>();
        Anagram anagram = new Anagram(setDictionary);
        List<String> listAnagrams = new ArrayList<>();
        assertEquals(listAnagrams, anagram.getAnagramByWordFromMap("anna"));
    }
}