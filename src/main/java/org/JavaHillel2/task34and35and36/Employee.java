package org.JavaHillel2.task34and35and36;

public class Employee {

    private String name;
    private long salary;
    private int age;
    private Gender gender;
    private boolean married;

    public Employee(String name, long salary, int age, Gender gender, boolean married) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.gender = gender;
        this.married = married;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public boolean isMarried() {
        return married;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", gender=" + gender +
                ", married=" + married +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Employee)){
            return false;
        }
        return this.name.equals(((Employee) obj).name);
    }
}
