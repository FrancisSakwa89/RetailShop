package com.company.exe.arrays;

public class OOpDog {

    String breed;
    String color;

    @Override
    public String toString() {
        return "To string method Dog Created";
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
        toString();

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public  static int legs = 4;

    public int getLegs() {
        return legs;
    }
    public static int getLegs2() {
        return legs;
    }


}


