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
        list.add(new Employee("Michael", 3000, 46, Gender.male, true));
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
    public void testGirlsYounger35() {
        List <Employee> act = girlsYounger35(list);
        List <Employee> exp = new LinkedList<>();
        exp.add(list.get(3));
        exp.add(list.get(5));
        exp.add(list.get(7));
        assertEquals(exp, act);
    }

    @Test
    public void testPeopleBetween33and37() {
       List<Employee> act = peopleBetween33and37(list);
       List<Employee> exp = new LinkedList<>();
       assertEquals(exp, act);
    }

    @Test
    public void testQuantityOfUnMarriedGirls() {
        long act = quantityOfUnMarriedGirls(list);
        assertEquals(2, act);
    }

    @Test
    public void testGuysOlder30Salaries() {
        List <Long> act = guysOlder30Salaries(list);
        List <Long> exp = new LinkedList<>();
        exp.add(list.get(1).getSalary());
        exp.add(list.get(6).getSalary());
        assertEquals(exp, act);
     }

    @Test
    public void testUniqueNames() {
        List<Employee> act = uniqueNames(list);
        List<Employee> exp = new LinkedList<>();
        exp.add(list.get(0));
        exp.add(list.get(2));
        exp.add(list.get(3));
        exp.add(list.get(4));
        exp.add(list.get(5));
        exp.add(list.get(6));
        exp.add(list.get(7));
    }
}