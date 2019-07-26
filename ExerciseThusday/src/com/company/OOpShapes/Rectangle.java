package com.company.OOpShapes;
import java.util.Scanner;

public class Rectangle extends Shapes {
    private double length,width;


    public double area(){
        return (length*width);
    }
    public double perimeter(){
        return 2*(length+width);
    }


    public void setLength(double length) {
        this.length = length;
    }


    public void setWidth(double width) {
        this.width = width;
    }

    public String toString() {
        return "Rectangle area: = " + (String.format("%.3f",area()) + " and"+ " perimeter: = "+ (String.format("%.3f",perimeter())));

    }
}
