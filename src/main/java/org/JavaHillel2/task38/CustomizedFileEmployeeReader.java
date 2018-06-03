package org.JavaHillel2.task38;

import org.JavaHillel2.task34and35and36.Employee;
import org.JavaHillel2.task37.FileEmployeeReader;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CustomizedFileEmployeeReader extends FileEmployeeReader {

    public static List<Employee> changeSalary (String root){
        List<Employee> list = (List<Employee>) FileEmployeeReader.getEmployeeListFromFile(root);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getAge()>25){
                if (list.get(i).getAge()<30){
                    list.get(i).setSalary(list.get(i).getSalary()+25000);
                }
                list.get(i).setSalary(list.get(i).getSalary()+50000);
            }
        }
        return list;
    }
    public static void writeListToFile (String root, List<Employee> list) throws IOException {
        FileWriter fw = new FileWriter(root);
        for (int i = 0; i < list.size(); i++) {
            fw.write(list.get(i).fileWriter() + "\n");
        }
        fw.close();
    }
}
