package generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class PairTest {

    @Test
    void equals() {
        Pair<String, Integer> pair1 = new Pair<>("name", 1);
        Pair<String, Integer> pair2 = new Pair<>("name", 1);
        Pair<String, Integer> pair3 = new Pair<>("surname", 2);
        assertEquals(pair1, pair2);
        assertNotEquals(pair1, pair3);

    }
}