package com.company;

import java.util.Scanner;

public class UserInfo {

    private int age;
    private String name;
    private String surname;
    private double salary;

    public void getInfo() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name = ");
        name = in.next();
        System.out.println("Enter surname = ");
        surname = in.next();
        System.out.println("Enter age = ");
        age = in.nextInt();
        System.out.println("Enter salary = ");
        salary = in.nextDouble();
    }

    public void printInfo() {
        System.out.println("Name = " + this.name);
        System.out.println("Surname = " + this.surname);
        System.out.println("Age = " + this.age);
        System.out.println("Salary = " + this.salary);
    }
}
