package com.company.Collections;

import java.util.*;

public class TestCollection {
    public void testarray1() {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<Integer> mylist = new ArrayList<Integer>();
        mylist.add(4);
        list.add("Francis" + " Sakwa");
        list.add("Age: 23 years old");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Iterator myi = mylist.iterator();
        while (myi.hasNext()) {
            System.out.println(myi.next());
        }

    }


    public void TestStudent() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Francis", "01"));
        students.add(new Student("Harriet", "02"));
        students.add(new Student("Agnes", "03"));
        students.add(new Student("George", "04"));
        students.add(new Student("Dennis", "05"));

        Iterator itr = students.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

//        for (Student student: students){
//            System.out.println(student);
//        }


        }

        public void Products(){
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("01","Chumvi"," kshs.15"));
        products.add(new Product("02","Ugali"," kshs.5,000"));
        products.add(new Product("03","Kuku"," 10,000"));
        Product Chocolate = new Product("23","Chocolate"," 120");
        products.add(Chocolate);




            Iterator itr = products.iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }


            for (Product student: products){
            System.out.println(products);
      }


        }


}

class Student {
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

class Product{
    String id;
    String name;
    String price;

    public Product(String id, String name, String price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID: "+id+" NAME: "+name+ " price"+price;

    }
}
