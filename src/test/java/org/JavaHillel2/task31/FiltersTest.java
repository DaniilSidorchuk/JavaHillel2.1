package org.JavaHillel2.task31;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import  static org.JavaHillel2.task31.Filters.*;

public class FiltersTest {

    Student student;

    @Before
    public void createStudent (){
        student = new Student(4, "Anzor", 18);
    }

    @Test
    public void testCheckId() {
        boolean act = checkId(student);
        assertEquals(true, act);
    }

    @Test
    public void testCheckAge() {
        boolean act = checkAge(student);
        assertEquals(true, act);
    }

    @Test
    public void testCheckName() {
        boolean act = checkName(student);
        assertEquals(true, act);
    }
}