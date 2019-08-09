package com.company.HashsetExamples.TreeSet;

import java.util.TreeSet;

public class TreesetMain {
    public static void main(String[] args) {
        MapInterfaceAndCollectionExe exe = new MapInterfaceAndCollectionExe();
        exe.copyHashSet();
        exe.treeSetSize();
        exe.hashMap();
        exe.addingSpecificIndexElementInArray();


        System.out.println("####Hashset Stuff####");

        MapInterfaceExample mapper = new MapInterfaceExample();
        mapper.mapInterface();

        System.out.println("###### Map interface ####");
        mapper.Map();

        System.out.println("###### TREE SET #####");
        TreeSet<Student> st = new TreeSet<Student>();
        st.add(new Student(123, 23));
        st.add(new Student(234, 25));


        for (Student s : st) {
            System.out.println("Age is: " + s.age + " " + " Regno: " + s.regNo);

        }


        System.out.println("\nCompared by Age");

        TreeSet<Student> stu = new TreeSet<>();
        stu.add(new Student(12, 56));
        stu.add(new Student(17, 90));
        stu.add(new Student(19, 36));


        System.out.println(stu.size());
        for (Student student : stu) {
            System.out.println("Age: " + student.age);


        }
        System.out.println("Comparator by reg no:");

        for (Student student : stu) {
            System.out.println("Reg no: " + student.regNo);
        }

    }
}
