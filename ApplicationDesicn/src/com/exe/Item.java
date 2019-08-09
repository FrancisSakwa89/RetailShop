package com.exe;

import java.io.Serializable;

public class Item implements Serializable {
    String name;
    String id;
    int price;
    int myquantity;
    String category;
    int Buyingprice;

    public Item(String name, String id, int price, int myquantity, String category, int buyingprice) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.myquantity = myquantity;
        this.category = category;
        Buyingprice = buyingprice;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMyquantity() {
        return myquantity;
    }

    public void setMyquantity(int myquantity) {
        this.myquantity = myquantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getBuyingprice() {
        return Buyingprice;
    }

    public void setBuyingprice(int buyingprice) {
        Buyingprice = buyingprice;
    }

    @Override
    public String toString() {
        return name;
    }
}



