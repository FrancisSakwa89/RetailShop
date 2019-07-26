package com.company.Collections.exe;

import java.io.*;
import java.util.*;

public class Student {
    String name;
    Date dob;
    int regno;
    String course;

    public Student(String name, Date dob, int regno, String course) {
        this.name = name;
        this.dob = dob;
        this.regno = regno;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getRegno() {
        return regno;
    }

    public void setRegno(int regno) {
        this.regno = regno;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }


}