package com.company.OOpShapes;
import java.util.Scanner;
import java.lang.Math;

public class Circle extends Shapes {
    private double radius;

    public Circle() {
    }

    @Override
    public double area(){
        return (Math.PI*radius*radius);
    }

    @Override
    public double perimeter(){
        return 2*Math.PI*radius*radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Get area circle: = "+ String.format("%.2f",area())+ " and perimeter: = "+ String.format ("%.3f",perimeter());
    }
}


