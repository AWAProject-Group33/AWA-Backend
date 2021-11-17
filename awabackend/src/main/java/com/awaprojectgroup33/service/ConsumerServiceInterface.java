package com.awaprojectgroup33.service;

import java.util.List;

import com.awaprojectgroup33.models.Order;
import com.awaprojectgroup33.models.Product;
import com.awaprojectgroup33.models.Restaurant;
import com.awaprojectgroup33.models.User;

public interface ConsumerServiceInterface {
    
    public Boolean createUser(User user); //save user to database

    public Boolean login(String userName, String passWord); //return user with matching credentials

    public List<Order> getOrderHistory(); //get list of orders of matching user from database

    public void confirmOrder(Order order); //set order status to delivered

    public Order getOrderStatus(Order order); //get order status of matching order from database

    public List<Product> getMenu(Restaurant restaurant); //get list of products of matching restaurant from database

    public Restaurant searchRestaurant(String name); //get restaurant with matching name from database

    public List<Restaurant> browseRestaurants(); //get list of restaurants from database

    public void addProductsToShoppingCart(Product product); //add product from menu to shopping cart

    //use shopping cart (payment, show content, set delivery location, show cost)
}
