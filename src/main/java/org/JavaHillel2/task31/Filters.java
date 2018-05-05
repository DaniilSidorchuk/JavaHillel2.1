package org.JavaHillel2.task31;

public class Filters {

    public static boolean checkId(Student student){
        return student.getId() < 5;
    }
    public static boolean checkAge(Student student){
        return student.getAge()<19;
    }
    public static boolean checkName(Student student){
        return student.getName().trim().toUpperCase().toCharArray()[0] == 'A';
    }



}
