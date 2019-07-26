package com.company.OOpShapes;

public class Trapezium extends Square {
    private double top,height,base,hypo;

    @Override
    public double area() {
        return ((base+top)*height)/2;
    }

    @Override
    public double perimeter() {
        return (base+top+height+hypo);
    }

    public void setTop(double top) {
        this.top = top;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHypo(double hypo) {
        this.hypo = hypo;
    }

    @Override
    public String toString() {
        return ("Trapezium area: "+ area() + " and perimter: "+ perimeter());
    }
}
