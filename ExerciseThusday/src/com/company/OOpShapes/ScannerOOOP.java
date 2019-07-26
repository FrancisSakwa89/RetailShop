package com.company.OOpShapes;
import java.util.Scanner;

public class ScannerOOOP extends Shapes {
    public int length,width;

    @Override
    public double area() {
        return length*width;
    }

    @Override
    public double perimeter() {
        return 2*(length*width);
    }


}
