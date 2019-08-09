package com.company.OOpShapes;



public class MainOOP {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setLength(5);
        rectangle.setWidth(6);
        System.out.println(rectangle);

        com.company.OOpShapes.Circle circle = new com.company.OOpShapes.Circle();
        circle.setRadius(7.5);
        System.out.println(circle);

        Circle c = new Circle();
          c.setRadius(8);
        System.out.println(c);




        Square square = new Square();
        square.setLength(10);
        System.out.println(square);

        Trapezium trapezium = new Trapezium();
        trapezium.setBase(4);
        trapezium.setHeight(5);
        trapezium.setHypo(6);
        trapezium.setTop(3);
        System.out.println(trapezium);

    }
}
