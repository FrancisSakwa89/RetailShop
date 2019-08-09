package com.company.HashsetExamples.TreeSet;

import java.util.Comparator;

public class CompareByRegno implements Comparator<Student> {
    // regno number
    public int compare(Student a, Student b)
    {
        if (a.regNo>b.regNo){
            return 1;
        }
        else if (a.regNo<b.regNo){
            return 0;
        }
        return -1;
    }
}
