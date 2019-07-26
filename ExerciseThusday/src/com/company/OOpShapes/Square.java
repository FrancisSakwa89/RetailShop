package com.company.OOpShapes;

public class Square extends Shapes{
    private double length;

    public Square(){

    }

    @Override
    public double area(){
      return length*length;
    }
    @Override
    public double perimeter(){
        return 4*(length);
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return ("Square Area: "+ area())+ " and Perimeter: "+ perimeter();
    }
}
