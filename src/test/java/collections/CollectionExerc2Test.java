package collections;

import collections.CollectionExerc2;
import generics.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

class CollectionExerc2Test {

    @Test
    void peopleList() {
        Customer c = CollectionExerc2.people[7];
        Assertions.assertEquals(c, CollectionExerc2.peopleList().get(7));
    }

    @Test
    void peopleListStream() {
        Customer c = CollectionExerc2.people[7];
        Assertions.assertEquals(c, CollectionExerc2.peopleListStream().get(7));
    }

    @Test
    void namesAndLastNamesList() {
        List<String> names = Arrays.asList("Anna Nowak", "Beata Kowalska", "Marek Nowak", "Adam Twardowski", "Monika Kos", "Adam Rudy", "Marek Rudy", "Adam Madej");
        Assertions.assertEquals(names, CollectionExerc2.namesAndLastNamesList());

    }

    @Test
    void namesAndLastNamesListStream() {
        List<String> names = Arrays.asList("Anna Nowak", "Beata Kowalska", "Marek Nowak", "Adam Twardowski", "Monika Kos", "Adam Rudy", "Marek Rudy", "Adam Madej");
        Assertions.assertEquals(names, CollectionExerc2.namesAndLastNamesListStream());

    }

    @Test
    void customerMap() {
        Customer c = CollectionExerc2.people[7];
        Assertions.assertEquals(c, CollectionExerc2.customerMap().get(8));
    }

    @Test
    void customerMapStream() {
        Customer c = CollectionExerc2.people[7];
        Assertions.assertEquals(c, CollectionExerc2.customerMapStream().get(8));


    }

    @Test
    void salaryMap() {
        Assertions.assertEquals(2, CollectionExerc2.salaryMap().get(BigDecimal.valueOf(1200)));
    }

    @Test
    void salaryMapStream() {
        Assertions.assertEquals(2, CollectionExerc2.salaryMapStream().get(BigDecimal.valueOf(1200)));

    }
}