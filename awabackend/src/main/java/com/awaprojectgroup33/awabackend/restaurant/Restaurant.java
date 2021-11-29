package com.awaprojectgroup33.awabackend.restaurant;

import javax.persistence.*;

@Entity(name = "Restaurant")
@Table(name = "restaurant")

public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(
        name = "restaurant_id",
        updatable = false,
        nullable = false
    )
    private long restaurantId;

    @Column(
        name = "name"  
    )
    private String restaurantName;

    @Column(
        name = "address"  
    )
    private String restaurantAddress;

    @Column(
        name = "operating_hours"  
    )
    private String operatingHours;

    @Column(
        name = "restaurant_type"  
    )
    private String restaurantType;

    @Column(
        name = "price_level"  
    )
    private String priceLevel;

    @Column(
        name = "manager_id",
        updatable = false,
        nullable = false  
    )
    private long managerId;


    public Restaurant() {  
    }

    public Restaurant(String restaurantName, String restaurantAddress, String operatingHours, String restaurantType, String priceLevel, long managerId) {
        this.restaurantName = restaurantName;
        this.restaurantAddress = restaurantAddress;
        this.operatingHours = operatingHours;
        this.restaurantType = restaurantType;
        this.priceLevel = priceLevel;
        this.managerId = managerId;
    }


    public long getRestaurantId() {
        return this.restaurantId;
    }


    public String getRestaurantName() {
        return this.restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantAddress() {
        return this.restaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public String getOperatingHours() {
        return this.operatingHours;
    }

    public void setOperatingHours(String operatingHours) {
        this.operatingHours = operatingHours;
    }

    public String getRestaurantType() {
        return this.restaurantType;
    }

    public void setRestaurantType(String restaurantType) {
        this.restaurantType = restaurantType;
    }

    public String getPriceLevel() {
        return this.priceLevel;
    }

    public void setPriceLevel(String priceLevel) {
        this.priceLevel = priceLevel;
    }

    public long getManagerId() {
        return this.managerId;
    }

    /* //cant be used cause changing id shouldn't be an option but have to figure how to automatically get manager id in restaurant
    public void setManagerId(long managerId) {
        this.managerId = managerId;
    }
    */  
}
