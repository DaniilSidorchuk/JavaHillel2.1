package org.JavaHillel2.task37;

import org.JavaHillel2.task34and35and36.Employee;
import org.JavaHillel2.task34and35and36.Gender;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Scanner;

public class FileEmployeeReader {

    public static Collection <Employee> getEmployeeListFromFile (String adr)  {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(adr);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(fileReader);
        LinkedList list = new LinkedList();

        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            line = line.replaceAll("\"", " ");
            line = line.replaceAll("“", " ");
            line = line.replaceAll("”", " ");
            String [] lines = line.split(",");

            Employee employee = new Employee
                    (lines[0].trim(), Long.parseLong(lines[1].trim())*1000, Integer.parseInt(lines[2].trim()), genderType(lines[3].trim()) , isMarried(lines[4]));
            list.add(employee);
        }
        scanner.close();
        return list;
    }

    private static Boolean isMarried (String str){
        str = str.trim().toLowerCase();
        if (str.equals("yes") || str.equals("true") || str.equals("ye") || str.equals("es") || str.equals("ys")){
            return true;
        }
        if (str.equals("no") || str.equals("false") || str.equals("on")){
            return false;
        }
        System.out.println("Neccesery word in file hasn`t been found");
        return null;
    }

    private static Gender genderType (String str){
        str = str.toLowerCase().trim();
        if (str.equals("male")){
            return Gender.male;
        }
        if (str.equals("female")){
            return Gender.female;
        }
        System.out.println("Neccesery word in file hasn`t been found");
        return null;
    }


}
