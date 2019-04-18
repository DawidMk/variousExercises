package collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

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
}