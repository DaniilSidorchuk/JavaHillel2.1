package org.JavaHillel2.task34and35and36;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.stream.Stream;

import static org.junit.Assert.*;
import static org.JavaHillel2.task34and35and36.StreamMethods.*;

public class StreamMethodsTest {
    Stream <Employee> list;

    @Before
    public void createListOfEmployees(){
        list = Stream.of(
        new Employee("John", 1000, 28, Gender.male, false),
        new Employee("John", 1800, 40, Gender.male, true),
        new Employee("Jimbo", 800, 20, Gender.male, false),
        new Employee("Sara", 5000, 30, Gender.female, true),
        new Employee("Anna", 4000, 51, Gender.female, true),
        new Employee("Jinny", 2500, 28, Gender.female, false),
        new Employee("Michael", 3000, 46, Gender.male, true),
        new Employee("Cony", 2900, 28, Gender.female, false)
        );
    }

    @Test
    public void testUnMarriedGirl() {
        Employee act = unMarriedGirl(list);
        assertEquals(false, act.isMarried());
    }

    @Test
    public void testFirstMarriedGuy() {
        Employee act = firstMarriedGuy(list);
        assertEquals(true, act.isMarried());
    }

    @Test
    public void testGuysOlder45() {
        assertEquals(1, guysOlder45(list).size());
    }

    @Test
    public void testGirlsYounger35() {
        assertEquals(3, girlsYounger35(list).size());
    }

    @Test
    public void testPeopleBetween33and37() {
       assertEquals(new LinkedList<>(), peopleBetween33and37(list));
    }

    @Test
    public void testQuantityOfUnMarriedGirls() {
        assertEquals(2, quantityOfUnMarriedGirls(list));
    }

    @Test
    public void testGuysOlder30Salaries() {
        assertEquals(2, guysOlder30Salaries(list).size());
     }

    @Test
    public void testUniqueNames() {
        assertEquals(7, uniqueNames(list).size());
    }

    @Test
    public void testStreamToList() {
        assertEquals(8, streamToList(list).size());
    }

    @Test
    public void testAverageSalary() {
        assertEquals(2625.00, averageSalary(list), 0);
    }
}