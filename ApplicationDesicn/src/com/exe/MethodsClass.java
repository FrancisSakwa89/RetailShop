package com.exe;

import java.util.Scanner;

public class MethodsClass {
    String choice = null;
    String name = "";
    String userId="";
    String product = "";
    int quantity = 0;
    int myquantity = 0;
    int ch = 0;
    int total = 0;
    String id;
    int price;
    String produdtName;
    String category;
    int pay;
    int buyingprice;
    String counterPerson;
    String searchItem;
    double totalSum = 0;
    String UserOrder = null;

    Scanner scan = new Scanner(System.in);



    public void createAccount(){
        System.out.println("Customer name.");

        name = scan.nextLine();
        System.out.print("Enter id:");
        userId = scan.nextLine();

        System.out.println("____________________________________________________________________________");
        System.out.println("Welcome " + name.toUpperCase() + " it is my pleasure that you are here !");
        System.out.println("____________________________________________________________________________");

    }

    public void displayProducts() {
        if (name.length() != 0) {
            System.out.println("________________________________________________________________________________");
            System.out.println("Here is the product list ");


            System.out.println("________________________________________________________________________________");
            System.out.println("NAME\t\t\tQUANTITY\tPRICE\t\tCATEGORY");


        }  else {
        System.out.println("__________________________________________");
        System.out.println("Please set up your account first....");
        System.out.println("__________________________________________");

    }
    }

    public void purchaseProducts(){


    }

    }

