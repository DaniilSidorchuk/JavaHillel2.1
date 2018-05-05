package org.JavaHillel2.task31;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Ivan", 23);
        Student student2 = new Student("Armen", 18);
        Student student3 = new Student("Alex", 16);
        Student student4 = new Student("Viktor", 42);

        student1.setId(5);
        student2.setId(4);
        student3.setId(10);
        student4.setId(1);

        LinkedList<Student> list = new LinkedList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);

        List sortedByAge = Student.getListOfSortedByAgeStudents(list);
        List sortedById = Student.getListOfSortedByIdStudents(list);
        List sortedByName = Student.getListOfSortedByNameStudents(list);

        System.out.println(sortedByAge);
        System.out.println(sortedById);
        System.out.println(sortedByName);

    }

}
