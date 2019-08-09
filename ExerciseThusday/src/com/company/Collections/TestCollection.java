package com.company.Collections;

import com.company.Collections.Linkedlist.Student;

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


        public void Satocollection(){

        LinkedList<satoCollections> satoes =  new LinkedList<satoCollections>();
        ArrayList<satoCollections> sarracollection = new ArrayList<>();
        satoes.add(new satoCollections("shule","09",8));
        satoCollections Moringa = new satoCollections("moringa","04",90);
        satoes.add(Moringa);


        Iterator<satoCollections> itr = satoes.iterator();
        while (itr .hasNext());
            System.out.println(itr.next());

//        for (satoCollections sato: satoes){
//            System.out.println(sato);
//        }


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

class satoCollections{
    String name;
    String id;
    int price;

    public satoCollections(String name, String id, int price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    @Override
    public String toString() {
        return "satoCollections{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", price=" + price + "}  && This is an array collection"+ '{'+ " sarracollection{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", price=" + price + '}';


    }
}
