package com.company.Collections.Linkedlist;


import com.company.Collections.exe.Student;

import java.util.LinkedList;

public class StudentNode extends LinkedList {
    String previous;
    StudentNode next;
    Student s;

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public StudentNode getNext() {
        return next;
    }

    public void setNext(StudentNode next) {
        this.next = next;
    }

    public void setS(Student s) {
        this.s = s;
    }


    public Student getS() {
        return s;
    }

    @Override
    public String toString() {
        return "StudentNode{" +
                "previous=" + previous +
                ", next=" + next +
                ", s='" + s + '\'' +
                '}';
    }

    public void setS(com.company.Collections.Linkedlist.Student sakwa) {
    }

    public void setPrevious(StudentNode s1) {
    }
}
