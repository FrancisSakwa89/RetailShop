package com.exe;

import java.util.ArrayList;
import java.util.List;

public class Sale {
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
}
