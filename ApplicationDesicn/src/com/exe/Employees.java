package com.exe;

public class Employees {
    String name;
    int id;
    String sector;

    public Employees(String name, int id, String sector) {
        this.name = name;
        this.id = id;
        this.sector = sector;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
    @Override
    public String toString() {
        return name +" "+ id;
    }
}

