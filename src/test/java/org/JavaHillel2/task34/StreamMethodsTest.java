package org.JavaHillel2.task34;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.Assert.*;
import static org.JavaHillel2.task34.StreamMethods.*;

public class StreamMethodsTest {
    List<Employee> list;

    @Before
    public void createListOfEmployees(){
        list = new LinkedList<>();
        list.add(new Employee("John", 1000, 28, Gender.male, false));
        list.add(new Employee("John", 1800, 40, Gender.male, true));
        list.add(new Employee("Jimbo", 800, 20, Gender.male, false));
        list.add(new Employee("Sara", 5000, 30, Gender.female, true));
        list.add(new Employee("Anna", 4000, 51, Gender.female, true));
        list.add(new Employee("Jinny", 2500, 28, Gender.female, false));
        list.add(new Employee("Michael", 3000, 45, Gender.male, true));
        list.add(new Employee("Cony", 2900, 28, Gender.female, false));
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
        List <Employee> act = guysOlder45(list);
        List <Employee> exp = new LinkedList<>();
        exp.add(list.get(6));
        assertEquals(exp, act);
    }

    @Test
    public void girlsYounger35() {
    }

    @Test
    public void peopleBetween33and37() {
    }

    @Test
    public void quantityOfUnMarriedGirls() {
    }

    @Test
    public void unMarriedGuysSalaries() {
    }

    @Test
    public void uniqueNames() {
    }
}