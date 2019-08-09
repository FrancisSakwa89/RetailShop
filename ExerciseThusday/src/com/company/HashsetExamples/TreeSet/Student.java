package com.company.HashsetExamples.TreeSet;

public  class Student implements Comparable <Student>{

    public int regNo;
    public int age;

    public Student(int regNo, int age) {
        this.regNo=regNo;
        this.age=age;
    }

    public int compareTo(Student s) {
        if (age>s.age) {
            return 1;
        }

        else if (age<s.age){
            return -1;
        }
        else {

            return 0;
        }
    }



}

