package com.company.HashsetExamples.TreeSet;

import java.util.Comparator;

public class CompareByAge implements Comparator<Student> {
    public int compare(Student a, Student b) {


        if (a.age > b.age) {
            return 1;
        } else if (a.age < b.age) {
            return 0;
        }
        else{

            return 0;
        }
    }

}
