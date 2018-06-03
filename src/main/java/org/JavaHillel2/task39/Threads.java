package org.JavaHillel2.task39;

import java.util.Scanner;

public class Threads {

    static volatile String name = " ";

    public static void setName(String n){
        name = n;
    }

    public static void main(String[] args) {

                Thread thread1 = new Thread(() -> {
            System.out.println("Hello To My Multithreading World:");
        });

        Thread thread2 = new Thread(() -> {
            String start = " start:";
            for (int i = 1; i < 6; i++) {
                System.out.println(i);
            }
            for (int i = 1; i < 7; i++) {
                System.out.println(start);
                start += i + " ";
            }
        });
        Thread thread3 = new Thread(() -> {
            System.out.println("Please enter your name");
            Scanner sc = new Scanner(System.in);
            setName((String) sc.nextLine());
        });
        Thread thread4 = new Thread(()->{
            System.out.printf("My name is: %s", name);
        });

        thread1.run();
        thread2.run();
        thread3.run();
        try {
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread4.run();
    }
}