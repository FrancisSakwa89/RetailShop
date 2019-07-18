package com.tutorial.filereader;

public class StudentEncapsulation {
    public String name;
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Test {
    public static void main(String[] args) {


        StudentEncapsulation s = new StudentEncapsulation();
        s.setName("Ndugwe");
        System.out.println(s.getName());

    }
}