package com.company.Collections.Linkedlist;

public class StudentMain {
    public static void main(String[] args) {
        StudentNode s1 = new StudentNode();
        s1.setS(new Student("Sakwa","9"));

        StudentNode s2= new StudentNode();
        s2.setS(new Student("Ekutu","7"));

        s1.setNext(s2);
        s2.setPrevious(s1);
        do {
            System.out.println(s1.getS().getName());

        }while ((s1=s1.getNext())!=null);

        StudentNode studentNode = new StudentNode();
        studentNode.setPrevious("Francis");

    }
}
