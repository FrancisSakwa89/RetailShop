package com.exe;

public class AddProducts extends Item {
        String name;
        String id;
        int price;
        int myquantity;
        String category;

    public AddProducts(String name, String id, int price, int myquantity, String category,int buyingprice) {
        super(name,id,price, myquantity,category,buyingprice);
        this.name = name;
        this.id = id;
        this.price = price;
        this.myquantity = myquantity;
        this.category = category;
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
    }

