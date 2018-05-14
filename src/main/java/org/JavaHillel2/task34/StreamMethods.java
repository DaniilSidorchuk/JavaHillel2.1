package org.JavaHillel2.task34;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {

    public static Employee unMarriedGirl(List<Employee> list) {
        Optional employee = list.stream()
                .filter(p -> !p.isMarried() && p.getGender().equals(Gender.female))
                .findAny();
        System.out.println(employee);
        return (Employee) employee.get();
    }

    public static Employee firstMarriedGuy(List<Employee> list) {
        Optional employee = list.stream()
                .filter(p -> p.isMarried() && p.getGender().equals(Gender.male))
                .findFirst();
        System.out.println(employee);
        return (Employee) employee.get();
    }

    public static List <Employee> guysOlder45 (List<Employee> list){
        return list.stream()
                .filter(p -> p.getAge()>45 && p.getGender().equals(Gender.male))
                .peek(p-> System.out.println(p))
                .collect(Collectors.toList());
    }

    public static List <Employee> girlsYounger35 (List<Employee> list){
        return list.stream()
                .filter(p -> p.getAge()<35 && p.getGender().equals(Gender.female))
                .peek(p-> System.out.println(p))
                .collect(Collectors.toList());
    }

    public static List <Employee> peopleBetween33and37 (List<Employee> list){
        return list.stream()
                .filter(p -> p.getAge()>33 && p.getAge()>37)
                .peek(p-> System.out.println(p))
                .collect(Collectors.toList());
    }

    public static long quantityOfUnMarriedGirls (List<Employee> list){
        long quantity = list.stream()
                .filter(p -> !p.isMarried() && p.getGender().equals(Gender.female))
                .count();
        System.out.println(quantity);
        return quantity;
    }

    public static List<Long> UnMarriedGuysSalaries (List<Employee> list) {
        return  list.stream()
                .filter(p -> p.getGender().equals(Gender.male) && p.getAge()>30)
                .map(p->p.getSalary())
                .peek(p-> System.out.println(p))
                .collect(Collectors.toList());
    }

    public static List <Employee> uniqueNames (List<Employee> list){
        return list.stream()
                .distinct()
                .collect(Collectors.toList());
    }
}
