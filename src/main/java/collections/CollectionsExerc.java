package collections;


import org.apache.commons.lang3.StringUtils;

import java.util.*;
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



    public static void main(String[] args) {
        System.out.println(sortedAnimals().toString());
        System.out.println(sortedAnimalsStream().toString());

}}
