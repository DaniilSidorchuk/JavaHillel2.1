package org.JavaHillel2.task34and35and36;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {

    public static Employee unMarriedGirl(Stream <Employee> list) {
        Optional employee = list
                .filter(p -> !p.isMarried() && p.getGender().equals(Gender.female))
                .findAny();
        System.out.println(employee);
        return (Employee) employee.get();
    }

    public static Employee firstMarriedGuy(Stream <Employee> list) {
        Optional employee = list
                .filter(p -> p.isMarried() && p.getGender().equals(Gender.male))
                .findFirst();
        System.out.println(employee);
        return (Employee) employee.get();
    }

    public static List <Employee> guysOlder45 (Stream <Employee> list){
        return  list
                .filter(p -> p.getAge()>45 && p.getGender().equals(Gender.male))
                .peek(p-> System.out.println(p))
                .collect(Collectors.toList());
    }

    public static List <Employee> girlsYounger35 (Stream <Employee> list){
        return list
                .filter(p -> p.getAge()<35 && p.getGender().equals(Gender.female))
                .peek(p-> System.out.println(p))
                .collect(Collectors.toList());
    }

    public static List <Employee> peopleBetween33and37 (Stream <Employee> list){
        return list
                .filter(p -> p.getAge()>33 && p.getAge()<37)
                .peek(p-> System.out.println(p))
                .collect(Collectors.toList());
    }

    public static long quantityOfUnMarriedGirls (Stream <Employee> list){
        long quantity = list
                .filter(p -> !p.isMarried() && p.getGender().equals(Gender.female))
                .count();
        System.out.println(quantity);
        return quantity;
    }

    public static List<Long> guysOlder30Salaries (Stream <Employee> list) {
        return  list
                .filter(p -> p.getGender().equals(Gender.male) && p.getAge()>30)
                .map(p->p.getSalary())
                .peek(p-> System.out.println(p))
                .collect(Collectors.toList());
    }

    public static Set <String> uniqueNames (Stream <Employee> list){
        return list
                .map(p -> p.getName())
                .collect(Collectors.toSet());
    }

    public static List <Employee> streamToList (Stream <Employee> list){
        return list.collect(Collectors.toList());
    }

    public static double averageSalary (Stream <Employee> list){
        return list
               .mapToDouble(p -> p.getSalary())
               .average().getAsDouble();
    }

}
