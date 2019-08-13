package com.exe;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Sale implements Serializable {
    Customer customer;
    List<Item> orderList;
    double total;

    public Sale(Customer customer, List<Item> orderList, double total) {
        this.customer = customer;
        this.orderList = orderList;
        this.total = total;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Item> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Item> orderList) {
        this.orderList = orderList;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
//        System.out.println("NAME"+"     "+"ORDER LIST"+"     "+"TOTAL");
        System.out.println("______________________________________________________________________________");
        System.out.println("NAME: "+customer+"   "+"ORDER: "+ orderList+"      "+"TOTAL: "+total);
        System.out.println("______________________________________________________________________________");
        return String.valueOf(orderList);
    }
}
