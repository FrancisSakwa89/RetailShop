package com.Exercise.OOPConcepts.Bike.inheritance;

public class Motorcycle extends Bicycle {
    String define_me(){
        return "a cycle with an engine.";
    }

    public Motorcycle(){
        System.out.println("Hello I am a motorcycle, I am "+ define_me());

        String temp=super.define_me(); //Fix this line

        System.out.println("My ancestor is a cycle who is "+ temp );
    }
}