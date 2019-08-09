package com.company.Collections.Linkedlist;

public class Student {
    String name;
    String id;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "ID: "+id+" NAME: "+name;
    }
}
