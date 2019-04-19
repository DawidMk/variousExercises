package collections;


import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectionsExerc {
    private static String[] animals = new String[]{"cat", "dog ", "mouse", "rat", "pig", "rabbit", "hamster", " ", "parrot", "cat", "", "dog", "cat", "  pig", "dog", null};

    public static List<String> noBlankAnimals() {

        List<String> resultList = new ArrayList<>();
        for (String animal : animals) {
            if (StringUtils.isNotBlank(animal)) {
                resultList.add(animal.trim());
            }
        }return resultList;
    }
    public static List<String> noBlankAnimalsStream() {
  return Arrays.stream(animals).filter(StringUtils::isNotBlank).map(String::trim).collect(Collectors.toList());
    }

    public static List<String> sortedAnimals(){
       List<String> result = noBlankAnimals();
        Collections.sort(result);
//        result.sort(Comparator.naturalOrder());
        return result;
        }


    public static List<String> sortedAnimalsStream(){
        return sortedAnimals().stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
    }

    public static List<String> sortedAnimalsDistinct() {
        List<String> result = new ArrayList<>();
        for (String animal : noBlankAnimals()) {
            if (!result.contains(animal)) {
                result.add(animal);
            }
        }
        Collections.sort(result);
//        result.sort(Comparator.naturalOrder());
        return result;
    }


    public static List<String> sortedAnimalsDistinctStream() {
        return sortedAnimals().stream().sorted(Comparator.naturalOrder()).distinct().collect(Collectors.toList());
    }

    public static List<String> originalAnimalsDistinct() { //todo napisać test
        List<String> result = new ArrayList<>();
        for (String animal : noBlankAnimals()) {
            if (!result.contains(animal)) {
                result.add(animal);
            }
        }
        return result;
    }


    public static List<String> originalAnimalsDistinctStream() { //todo napisać test
        return noBlankAnimals().stream().distinct().collect(Collectors.toList());
    }

    public static Map<String, Long> animalMap() {
        Map<String, Long> result = new HashMap<>();
        for (String animal : noBlankAnimals()) {
            if (result.containsKey(animal)) {
                result.put(animal, result.get(animal) + 1);
            }else{
                result.put(animal,1L);
            }
        }return result;
    }

    public static Map<String, Long> animalMapStream() {
        return noBlankAnimals().stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(animals));
//        System.out.println(sortedAnimals().toString());
//        System.out.println(sortedAnimalsDistinct().toString());
//        System.out.println(sortedAnimalsDistinctStream().toString());
        System.out.println(originalAnimalsDistinct().toString());
        System.out.println(originalAnimalsDistinctStream().toString());
        System.out.println(animalMap());
        System.out.println(animalMapStream());

    }
}