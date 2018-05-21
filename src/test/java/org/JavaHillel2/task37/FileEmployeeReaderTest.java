package org.JavaHillel2.task37;

import org.JavaHillel2.task34and35and36.Employee;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class FileEmployeeReaderTest {

    @Test
    public void testGetEmployeeListFromFile() {

        LinkedList<Employee> list = new LinkedList() ;

        try {
            list = (LinkedList<Employee>) FileEmployeeReader.getEmployeeListFromFile("E:\\SD\\JH2\\JavaHillel2.1\\src\\main\\resources\\input.csv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        assertEquals(4, list.size());

    }
}