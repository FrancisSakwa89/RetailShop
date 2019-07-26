package com.company.Collections.exe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.LinkedList;

public class Database {
    public String reader(){
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        String data = "";
        try {
            data = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    public void getStudents(){
        LinkedList<Student> studentLinkedList = new LinkedList<>();
        for (int i=0;i<10;i++){
            System.out.println("Enter name: ");

            String name = reader();
            System.out.println("Enter Date of birth: "+ "+ \" (YY/mm/dd: \"");

            Date dob = new Date(reader());
            System.out.println("Enter your reg no: ");

            int regno = Integer.parseInt(reader());
            System.out.println("Enter your course: ");

            String course = reader();

            Student student = new Student(name,dob,regno,course);
            studentLinkedList.add(student);
        }
        for (Student student : studentLinkedList){

            System.out.println("Name: "+ student.getName());
            System.out.println("Date of birth: "+ student.getDob());
            System.out.println("Reg no: "+ student.getRegno());
            System.out.println("course: "+ student.getCourse());




        }
    }

}
