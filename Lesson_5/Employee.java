package ru.geekbrains.lesson_java_5;

public class Employee {

    private String full_name;
    private String position;
    private String email;
    private String phone;
    private String salary;
    private int age;

    public Employee (String full_name, String position, String email,
                     String phone, String salary ,int age) {
        this.full_name = full_name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }

    public void getAge () {
        if (age>40) {
            System.out.println("Full name is: " + full_name);
            System.out.println("Position is: " + position);
            System.out.println("Email is: " + email);
            System.out.println("Phone is: " + phone);
            System.out.println("Salary is: " + salary);
            System.out.println("Age is: " + age);
            System.out.println();
        }
    }
}
