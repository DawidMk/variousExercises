package generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class GenericExercTest {


    @Test
    void showElementsOfList() {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4);
        List<String> stringList = Arrays.asList("1", "2", "3", "4");
        List<Object> objList = Arrays.asList("aa", 1, 2, 8, 3, " dawg");
        GenericExerc.showElementsOfList(intList);
        GenericExerc.showElementsOfList(stringList);
        GenericExerc.showElementsOfList(objList);

    }

    @Test
    void showElementsOfListStream() {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4);
        List<String> stringList = Arrays.asList("1", "2", "3", "4");
        GenericExerc.showElementsOfListStream(intList);
        GenericExerc.showElementsOfListStream(stringList);
    }

    @Test
    void showElementsOfListWithOrderStream() {
        List<Object> objList = Arrays.asList("aa", 1, 2, 8, 3, " dawg");
        GenericExerc.showElementsOfListWithOrderStream(objList, Comparator.naturalOrder());
        System.out.println();
        GenericExerc.showElementsOfListWithOrderStream(objList, Comparator.reverseOrder());
    }

    @Test
    void showElementsOfListWithOrder() {
        List<Object> objList = Arrays.asList("aa", 1, 2, 8, 3, " dawg");
        GenericExerc.showElementsOfListWithOrder(objList, Comparator.naturalOrder());
        System.out.println();
        GenericExerc.showElementsOfListWithOrder(objList, Comparator.reverseOrder());
    }

    @Test
    void sumElementsOfList() {
        List<Number> intList = Arrays.asList(1L, 1D, 1.0, 1);
        double sum = GenericExerc.sumGenericNumbers(intList);
        Assertions.assertEquals(sum, 4.0);
    }

    @Test
    void sumElementsOfListStream() {
        List<Number> intList = Arrays.asList(1L, 1D, 1.0, 1);
        double sum = GenericExerc.sumGenericNumbersStream(intList);
        Assertions.assertEquals(sum, 4.0);
    }

    @Test
    void sumElementsOfListWithLimit() {
        List<Number> intList = Arrays.asList(1L, 1D, 1.0, 1, 2, 3);
        double sum = GenericExerc.sumGenericNumbersLimited(intList, 2);
        Assertions.assertEquals(sum, 4.0);
    }

    @Test
    void sumElementsOfListStreamWithLimit() {
        List<Number> intList = Arrays.asList(1L, 1D, 1.0, 1, 2, 3);
        double sum = GenericExerc.sumGenericNumbersLimitedStream(intList, 2);
        Assertions.assertEquals(sum, 4.0);
    }}