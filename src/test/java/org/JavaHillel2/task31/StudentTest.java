package org.JavaHillel2.task31;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;
import static org.junit.Assert.*;

public class StudentTest {

    List<Student> listOfStudents;
    Student student1;
    Student student2;
    Student student3;
    Student student4;

    @Before
    public void createListOfStudents(){
        listOfStudents = new LinkedList<>();
        student1 = new Student(1,"Ivan", 23);
        student2 = new Student(5,"Armen", 18);
        student3 = new Student(7,"Alex", 16);
        student4 = new Student(3,"Viktor", 42);
        listOfStudents.add(student1);
        listOfStudents.add(student2);
        listOfStudents.add(student3);
        listOfStudents.add(student4);
    }

    @Test
    public void testGetListOfSortedByIdStudents() {
        List expected = new LinkedList();
        expected.add(student1);
        expected.add(student4);
        List<Student> actual = new LinkedList();
        actual = Student.getListOfSortedByIdStudents(listOfStudents);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetListOfSortedByAgeStudents() {
        List expected = new LinkedList();
        expected.add(student2);
        expected.add(student3);
        List<Student> actual = new LinkedList();
        actual = Student.getListOfSortedByAgeStudents(listOfStudents);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetListOfSortedByNameStudents() {
        List expected = new LinkedList();
        expected.add(student2);
        expected.add(student3);
        List<Student> actual = new LinkedList();
        actual = Student.getListOfSortedByNameStudents(listOfStudents);
        assertEquals(expected, actual);
    }

}