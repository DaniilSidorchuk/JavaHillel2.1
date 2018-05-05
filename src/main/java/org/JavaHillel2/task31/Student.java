package org.JavaHillel2.task31;

import java.util.LinkedList;
import java.util.List;

public class Student {

    private int id;
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void setId(int id) {
        if (this.id!=0){
            return;
        }
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static List<Student> getListOfSortedByIdStudents (List<Student> list){
        List<Student> sortedList = new LinkedList<>();
        FilterStudent fs = Filters::checkId;
        for (Student s:list) {
            if (fs.check(s)){
                sortedList.add(s);
            }
        }
        return sortedList;
    }

    public static List<Student> getListOfSortedByAgeStudents (List<Student> list){
        List<Student> sortedList = new LinkedList<>();
        FilterStudent fs = Filters::checkAge;
        for (Student s:list) {
            if (fs.check(s)){
                sortedList.add(s);
            }
        }
        return sortedList;
    }

    public static List<Student> getListOfSortedByNameStudents (List<Student> list){
        List<Student> sortedList = new LinkedList<>();
        FilterStudent fs = Filters::checkName;
        for (Student s:list) {
            if (fs.check(s)){
                sortedList.add(s);
            }
        }
        return sortedList;
    }

    @Override
    public String toString() {
        return getName() + " " + getAge() + " " + getId();

    }
}
