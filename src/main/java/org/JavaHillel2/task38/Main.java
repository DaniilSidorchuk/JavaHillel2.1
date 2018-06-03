package org.JavaHillel2.task38;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String input = "C:\\Users\\danii\\IdeaProjects\\JavaHillel2.1\\src\\main\\resources\\input.csv";
        List list = CustomizedFileEmployeeReader.changeSalary(input);
        String output = "C:\\Users\\danii\\IdeaProjects\\JavaHillel2.1\\src\\main\\res\\output.cv";
        try {
            CustomizedFileEmployeeReader.writeListToFile(output, list);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
