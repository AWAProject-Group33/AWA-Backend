package com.awaprojectgroup33.controller;

import java.util.List;

import com.awaprojectgroup33.models.Order;
import com.awaprojectgroup33.models.User;
import com.awaprojectgroup33.service.ConsumerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ConsumerController {
    
    @Autowired
    private ConsumerService consumerService;

    @PostMapping
    public Boolean createUser(@RequestBody User user)
    {
        return consumerService.createUser(user);
    }

    //public User login()

    @GetMapping
    public List<Order> getOrderHistory()
    {
        return consumerService.getOrderHistory();
    }
}
