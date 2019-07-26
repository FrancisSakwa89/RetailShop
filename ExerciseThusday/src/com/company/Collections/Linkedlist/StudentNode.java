package com.company.Collections.Linkedlist;


public class StudentNode {
    StudentNode previous;
    StudentNode next;
    Student s;

    public StudentNode getPrevious() {
        return previous;
    }

    public void setPrevious(StudentNode previous) {
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
}
