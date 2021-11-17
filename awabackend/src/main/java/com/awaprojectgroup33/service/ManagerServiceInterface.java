package com.awaprojectgroup33.service;

import java.util.List;

import com.awaprojectgroup33.models.Order;
import com.awaprojectgroup33.models.Product;
import com.awaprojectgroup33.models.Restaurant;
import com.awaprojectgroup33.models.User;

public interface ManagerServiceInterface {
    
    public User createUser(User user); //save user to database

    public User login(String userName, String passWord); //return user with matching credentials

    public List<Order> getOrderHistory(Restaurant restaurant); //get list of orders of matching restaurant from database

    public void setOrderStatus(Order order); //change orders status

    public void receiveOrder(Order order); //set order status to received

    public Restaurant createRestaurant(Restaurant restaurant); //save restaurant to database

    public List<Product> createMenu(Restaurant restaurant, List<Product> menu); //save list of products to database
}
