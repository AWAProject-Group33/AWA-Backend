package com.awaprojectgroup33.models;

import java.util.List;

public class Restaurant {
    
    private long id;
    private static long idCounter = 0;
    private RestaurantPriceLevel priceLevel;
    private RestaurantType type;
    private String address, operatingHours, name;
    private List<Product> menu;

    public Restaurant(RestaurantPriceLevel priceLevel, RestaurantType type, String address, String operatingHours, String name, List<Product> menu) {
        this.id = idCounter++;
        this.priceLevel = priceLevel;
        this.type = type;
        this.address = address;
        this.operatingHours = operatingHours;
        this.name = name;
        this.menu = menu;
    }

    public long getId() {
        return this.id;
    }

    public RestaurantPriceLevel getPriceLevel() {
        return this.priceLevel;
    }

    public void setPriceLevel(RestaurantPriceLevel priceLevel) {
        this.priceLevel = priceLevel;
    }

    public RestaurantType getType() {
        return this.type;
    }

    public void setType(RestaurantType type) {
        this.type = type;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOperatingHours() {
        return this.operatingHours;
    }

    public void setOperatingHours(String operatingHours) {
        this.operatingHours = operatingHours;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getMenu() {
        return this.menu;
    }

    public void setMenu(List<Product> menu) {
        this.menu = menu;
    }
}
