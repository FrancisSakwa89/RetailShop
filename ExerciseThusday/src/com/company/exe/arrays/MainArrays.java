package com.company.exe.arrays;

import java.util.Scanner;

public class MainArrays {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter name, age and salary");

        // String input
        String name = myObj.nextLine();

        // Numerical input
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();
        // Output input by user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

        System.out.println("######## Adding a +b using different forms ##########");
        Calculation cal = new Calculation();
        cal.sum(23,45);
        cal.sum(34,67,89);

    }
}
