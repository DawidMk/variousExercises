package collections;

import generics.Customer;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectionExerc2 {
    public static Customer[] people = new Customer[]{
            new Customer("Anna", "Nowak   ", 33, "1200"),
            new Customer("Beata", "Kowalska", 22, "1200"),
            new Customer("Marek", " Nowak", 25, "1250"),
            new Customer("Adam", "Twardowski", 33, "1100"),
            new Customer("Monika  ", "Kos", 25, "2500"),
            new Customer("Adam ", "Rudy", 45, "3333"),
            new Customer("Marek", "Rudy", 15, 2210),
            new Customer("Adam", "Madej", 15, 3333)
    };


    public static List<Customer> peopleList() {
        return Arrays.asList(people);
    }

    public static List<Customer> peopleListStream() {
        return Arrays.stream(people).collect(Collectors.toList());
    }

    public static List<String> namesAndLastNamesList() {
        List<String> result = new ArrayList<>();
        for (Customer p : peopleList()) {
            String name = p.getFirstName().trim() + " " + p.getLastName().trim();
            result.add(name);
        }
        return result;
    }

    public static List<String> namesAndLastNamesListStream() {
        return peopleList().stream().map(s -> (s.getFirstName().trim() + " " + s.getLastName().trim())).collect(Collectors.toList());
    }

    public static Map<Integer, Customer> customerMap() {
        Map<Integer, Customer> result = new HashMap<>();
        for (Customer person : people) {
            result.put(person.getId(), person);
        }
        return result;
    }

    public static Map<Integer, Customer> customerMapStream() {
        return Arrays.stream(people).collect(Collectors.toMap(Customer::getId, Function.identity()));
    }

    public static Map<BigDecimal, Long> salaryMap() {
        Map<BigDecimal, Long> result = new HashMap<>();
        for (Customer customer : peopleList()) {
            if (!result.containsKey(customer.getSalary())) {
                result.put(customer.getSalary(), 1L);
            } else {
                result.put(customer.getSalary(), result.get(customer.getSalary()) + 1L);
            }
        }
        return result;
    }

    public static Map<BigDecimal, Long> salaryMapStream() {
        return peopleList().stream().collect(Collectors.groupingBy(Customer::getSalary, Collectors.counting()));
    }
/*
    public static Map<String, Map<Double, Long>> mapOfMaps() {
        Map<String, Map<Double, Long>> resultMap = new HashMap<>();
        Map<Double, Long> innerMap;
        for (Customer customer : peopleList()) {
            Double salary = customer.getSalary().doubleValue();
            if (resultMap.containsKey(customer.getFirstName().trim())) {
                innerMap = resultMap.get(customer.getFirstName());
//                innerMap = new HashMap<>();
                Long c = innerMap.get(salary) == null ? 0L : innerMap.get(salary);

                innerMap.put(salary, c + 1L);
                resultMap.put(customer.getFirstName().trim(), innerMap);
            } else {
//                innerMap = resultMap.get(customer.getFirstName());
                innerMap = new HashMap<>();

                innerMap.put(salary, 1L);
                resultMap.put(customer.getFirstName().trim(), innerMap);
            }
        }
        return resultMap;
    }*/

    private static Map<String, Map<Double, Long>> mapOfMaps2() {
        Map<String, Map<Double, Long>> outerMap = new HashMap<>();
        Map<Double, Long> innerMap;// = new HashMap<>();
        for (Customer customer : peopleList()) {
            Double salary = customer.getSalary().doubleValue();
            if (outerMap.containsKey(customer.getFirstName().trim())) {
                innerMap = outerMap.get(customer.getFirstName().trim());
                Long c = innerMap.get(salary) == null ? 0L : innerMap.get(salary);
                innerMap.put(salary, c + 1L);
                outerMap.put(customer.getFirstName().trim(), innerMap);
            } else {
                innerMap = new HashMap<>();
                innerMap.put(salary, 1L);
                outerMap.put(customer.getFirstName().trim(), innerMap);
            }
        }
        return outerMap;
    }


    public static void main(String[] args) {
//        System.out.println(peopleList());
        System.out.println(mapOfMaps2());
//        System.out.println(namesAndLastNamesList().toString());
//        System.out.println(namesAndLastNamesListStream().toString());
    }
}
