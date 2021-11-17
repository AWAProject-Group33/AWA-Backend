package com.awaprojectgroup33.service;

import java.util.List;

import com.awaprojectgroup33.models.Order;
import com.awaprojectgroup33.models.Product;
import com.awaprojectgroup33.models.Restaurant;
import com.awaprojectgroup33.models.User;

import org.springframework.stereotype.Service;

@Service
public class ManagerService implements ManagerServiceInterface{

    @Override
    public User createUser(User user)
    {
        return null;
    }

    @Override
    public User login(String userName, String passWord)
    {
        return null;
    }

    @Override
    public List<Order> getOrderHistory(Restaurant restaurant)
    {
        return null;
    }

    @Override
    public void setOrderStatus(Order order)
    {
        
    }

    @Override
    public void receiveOrder(Order order)
    {
        
    }

    @Override
    public Restaurant createRestaurant(Restaurant restaurant)
    {
        return null;
    }

    @Override
    public List<Product> createMenu(Restaurant restaurant, List<Product> menu)
    {
        return null;
    }
}
