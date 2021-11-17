package com.awaprojectgroup33.models;

public class Product {
    
    private long id;
    private static long idCounter = 0;
    private String name, description;
    private double price;

    public Product(String name, String description, double price) {
        this.id = idCounter++;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
