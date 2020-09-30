package tasksWithSetAndMap.tasksMap.mapTask5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JavaAdvanced
 * 28.09.20
 */

class PredicatePrepositionsTest {
    @Test
    public void test_String_Boolean() {
        PredicatePrepositions predicatePrepositions = new PredicatePrepositions();
        assertTrue(predicatePrepositions.test("один"));
    }

    @Test
    public void test_StringEqualsPrepositions_Boolean() {
        PredicatePrepositions predicatePrepositions = new PredicatePrepositions();
        assertFalse(predicatePrepositions.test("y"));
        assertFalse(predicatePrepositions.test("над"));
        assertFalse(predicatePrepositions.test("под"));
        assertFalse(predicatePrepositions.test("в"));
        assertFalse(predicatePrepositions.test("из"));
    }
}