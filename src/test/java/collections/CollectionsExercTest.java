package collections;

import org.hamcrest.collection.IsMapContaining;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CollectionsExercTest {

    @Test
    void noBlankAnimals() {
        List<String> animalList = Arrays.asList("cat","dog","mouse","rat","pig","rabbit","hamster","parrot","cat","dog","cat","pig","dog");
        Assertions.assertEquals(CollectionsExerc.noBlankAnimals(),animalList);
    }

    @Test
    void noBlankAnimalsStream() {
        List<String> animalList = Arrays.asList("cat","dog","mouse","rat","pig","rabbit","hamster","parrot","cat","dog","cat","pig","dog");
        Assertions.assertEquals(CollectionsExerc.noBlankAnimalsStream(),animalList);
    }

    @Test
    void animalMap() {
        Map<String, Long> animalMap = CollectionsExerc.animalMap();
//Assertions.assertTrue( animalMap.containsKey("dog") && animalMap.containsValue(1L));
        IsMapContaining.hasEntry("dog",1L);
        assertEquals(1, (long) animalMap.get("dog"));

    }

    @Test
    void animalMapStream() {
        Map<String, Long> animalMap = CollectionsExerc.animalMapStream();
        assertEquals(3, (long) animalMap.get("dog"));

    }

    @Test
    void howManyEmpties() {
        Map<Boolean, Long> animalMap = CollectionsExerc.howManyEmpties();
        assertEquals(3, (long) animalMap.get(false));
    }

    @Test
    void howManyEmptiesStream() {
        Map<Boolean, Long> animalMap = CollectionsExerc.howManyEmptiesStream();
        assertEquals(3, (long) animalMap.get(false));
    }
}