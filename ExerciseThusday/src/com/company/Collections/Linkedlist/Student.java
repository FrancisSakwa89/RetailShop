//package com.company.Collections.Linkedlist;
//
//import java.io.*;
//import java.util.Date;
//import java.util.LinkedList;
//
//public class Student {
//
//    String name;
//    Date dob;
//    int regno;
//    String course;
//
//    public void writeToFile() throws IOException {
//        LinkedList<Student> students = new LinkedList<>();
//        OutputStreamWriter out = null;
//        try (InputStreamReader keyboard = new InputStreamReader(System.in)) {
//            out = new FileWriter("output.txt");
//            System.out.println("Enter a name: ");
//            System.out.println("Enter dob: ");
//            System.out.println("Enter regno no: ");
//            System.out.println("Enter your course: ");
//
//
//
//            char c;
//            do {
//                c = (char) keyboard.read();
//                out.write(c);
//            } while (c != 'q');
//
//        }
//
//
//    }
//}
//
