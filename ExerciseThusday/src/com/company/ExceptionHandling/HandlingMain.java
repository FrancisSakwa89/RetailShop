package com.company.ExceptionHandling;

public class HandlingMain {
    public static void main(String[] args) {

        try {
            ArithmeticException arithmeticException = new ArithmeticException();
            arithmeticException.divide(3, 0);
            System.out.println(arithmeticException);

        } catch (java.lang.ArithmeticException e) {
            e.printStackTrace();
        }

        System.out.println(" This is an arithmetic exception error because the denominator equals to zero!!!");

        System.out.println(" ######################## ########## ");
        try {

            ArithmeticException exception = new ArithmeticException();
            exception.sizeOfString();
        } catch (java.lang.NullPointerException e) {
            e.printStackTrace();
        }
        System.out.println(" This is a number format error!!!");


    }

}



