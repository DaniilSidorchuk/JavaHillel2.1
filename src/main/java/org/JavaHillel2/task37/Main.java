package org.JavaHillel2.task37;

import org.JavaHillel2.task34and35and36.Employee;

import java.io.FileNotFoundException;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList <Employee> list = new LinkedList() ;

        try {
            list = (LinkedList<Employee>) FileEmployeeReader.getEmployeeListFromFile("E:\\SD\\JH2\\JavaHillel2.1\\src\\main\\resources\\input.csv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        list.stream()
                .forEach(p -> System.out.println(p));

    }

}
