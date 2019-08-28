package com.exe;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Sale implements Serializable {
    Customer customer;
    List<Item> orderList;
    double total;
    double totalProfit;

    public Sale(Customer customer, List<Item> orderList, double total,double totalProfit) {
        this.customer = customer;
        this.orderList = orderList;
        this.total = total;
        this.totalProfit = totalProfit;
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

    public double getTotalProfit() {
        return totalProfit;
    }

    public void setTotalProfit(double totalProfit) {
        this.total = totalProfit;
    }




    @Override
    public String toString() {
//        System.out.println("NAME"+"     "+"ORDER LIST"+"     "+"TOTAL");
        System.out.println("______________________________________________________________________________");
        System.out.println("NAME\t\t\tORDERLIST\t\t\tTOTAL");
        System.out.println(customer.getName()+"\t\t\t"+orderList+"\t\t\t"+total + "\t\t\t\t"+totalProfit);
        System.out.println("______________________________________________________________________________");
        return String.valueOf(orderList);
    }
}
