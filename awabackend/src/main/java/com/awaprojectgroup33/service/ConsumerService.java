package com.awaprojectgroup33.service;

import java.util.List;

import com.awaprojectgroup33.models.Order;
import com.awaprojectgroup33.models.Product;
import com.awaprojectgroup33.models.Restaurant;
import com.awaprojectgroup33.models.User;

import org.springframework.stereotype.Service;

@Service
public class ConsumerService implements ConsumerServiceInterface {
    
    public User user;

    @Override
    public Boolean createUser(User user)
    {
        return false; //if succesful return true, else return false
    }

    @Override
    public Boolean login(String userName, String passWord)
    {
        //this.user = user from database
        //if credentials match return true, else return false

        return false;
    }

    @Override
    public List<Order> getOrderHistory()
    {
        //this.user
        return null;
    }

    @Override
    public void confirmOrder(Order order)
    {
        
    }

    @Override
    public Order getOrderStatus(Order order)
    {
        return null;
    }

    @Override
    public List<Product> getMenu(Restaurant restaurant)
    {
        return null;
    }

    @Override
    public Restaurant searchRestaurant(String name)
    {
        return null;
    }

    @Override
    public List<Restaurant> browseRestaurants()
    {
        return null;
    }

    public void addProductsToShoppingCart(Product product)
    {
        
    }
}
