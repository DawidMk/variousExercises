package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GenericExerc {

    public static <T> void showElementsOfList(List<T> input) {
        for (T t : input) {
            System.out.println(t);
        }
    }

    public static <T> void showElementsOfListStream(List<T> input) {
        input
                .forEach(System.out::println);
    }

    public static <T> void showElementsOfListWithOrder(List<T> input, Comparator comparator) {
        List<String> tempList = new ArrayList<>();
        for (T t : input) {
            tempList.add(t.toString());
        }

        tempList.sort(comparator);
        for (String s : tempList) {
            System.out.println(s);
        }
    }

    public static <T> void showElementsOfListWithOrderStream(List<T> input, Comparator comparator) {
        input.stream()
                .map(Object::toString)
                .sorted(comparator)
                .forEach(System.out::println);
    }

    public static <T extends Number> double sumGenericNumbers(List<T> inputList) {
        double sum = 0D;
        for (T t : inputList) {
            sum = t.doubleValue() + sum;
        }
        return sum;
    }


    public static <T extends Number> Double sumGenericNumbersStream(List<T> inputList) {
        return inputList.stream().mapToDouble(Number::doubleValue).sum();
    }

    public static <T extends Number> double sumGenericNumbersLimited(List<T> inputList, Integer limit) {
        double sum = 0D;
        for (T t : inputList) {
            if (t.doubleValue() < limit) {
                sum = t.doubleValue() + sum;
            }
        }
        return sum;
    }


    public static <T extends Number> Double sumGenericNumbersLimitedStream(List<T> inputList, Integer limit) {
        return inputList.stream().mapToDouble(Number::doubleValue).filter(i -> i < limit).sum();
    }



    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(8, 5, 7, 1, 2, 3, 4);
        List<String> stringList = Arrays.asList("1", "2", "3", "4");
        List<Object> objList = Arrays.asList("aa", 1, 2L, 8.0, 3D, " dawg");

        showElementsOfListWithOrder(objList, Comparator.reverseOrder());
//        showElementsOfListStream(intList);
//        showElementsOfListStream(stringList);
    }
}