//package com.company.Shapes;
//
//public abstract class Shape { // fields
//    String name;
//    double area, perimeter;
//
//    // constructor
//    public Shape() {
//        name = "name";
//        area = perimeter = 0;
//    }
//
//    public abstract double area();
//
//    public abstract double perimeter();
//
//    public class Rectangle extends Shape {  // fields
//        double length, width;
//
//        // constructors
//        public Rectangle() {
//            name = "Rectangle";
//            length = width = 0;
//        }
//
//        public Rectangle(double _length, double _width) {
//            name = "Rectangle";
//            length = _length;
//            width = _width;
//        }
//
//        // methods
//        public void computeArea() {
//            area = length * width;
//        }
//
//        public void computePerimeter() {
//            perimeter = 2 * (length + width);
//        }
//    }
//
//    public static class Circle extends Shape {  // fields
//        double radius;
//
//        // constructors
//        public Circle() {
//            name = "Circle";
//            radius = 0;
//        }
//
//        public Circle(double _radius) {
//            name = "Circle";
//            radius = _radius;
//        }
//
//        // methods
//        public void computeArea(int i) {
//            area = Math.PI * radius * radius;
//        }
//
//        public void computePerimeter() {
//            perimeter = 2 * Math.PI * radius;
//        }
//
//        public class Square extends Shape {  // fields
//            double side;
//
//            // constructors
//            public Square() {
//                name = "Square";
//                side = 0;
//            }
//
//            public Square(double _side) {
//                name = "Square";
//                side = _side;
//            }
//
//            // methods
//            public void computeArea() {
//                area = side * side;
//            }
//
//            public void computePerimeter() {
//                perimeter = 4 * side;
//            }
//        }
//
//    }
//}