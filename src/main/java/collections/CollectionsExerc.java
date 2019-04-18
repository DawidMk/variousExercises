package collections;


import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
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

    public static void main(String[] args) {
        System.out.println(noBlankAnimals().toString());
}}
