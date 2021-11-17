package com.awaprojectgroup33.models;

import java.util.List;

public class Order {
    
    private long id;
    private static long idCounter = 0;
    private OrderStatus orderStatus;
    private double cost;
    private String deliveryLocation;
    private List<Product> orderContent;

    public Order(OrderStatus orderStatus, double cost, String deliveryLocation, List<Product> orderContent) {
        this.id = idCounter++;
        this.orderStatus = orderStatus;
        this.cost = cost;
        this.deliveryLocation = deliveryLocation;
        this.orderContent = orderContent;
    }

    public long getId() {
        return this.id;
    }

    public OrderStatus getOrderStatus() {
        return this.orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public double getCost() {
        return this.cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDeliveryLocation() {
        return this.deliveryLocation;
    }

    public void setDeliveryLocation(String deliveryLocation) {
        this.deliveryLocation = deliveryLocation;
    }

    public List<Product> getOrderContent() {
        return this.orderContent;
    }

    public void setOrderContent(List<Product> orderContent) {
        this.orderContent = orderContent;
    }

}
