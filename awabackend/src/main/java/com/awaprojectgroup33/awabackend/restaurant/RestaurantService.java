package com.awaprojectgroup33.awabackend.restaurant;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;

    @Autowired
    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public List<Restaurant> getRestaurant() {
        return restaurantRepository.findAll();
    }

    public List<Restaurant> getRestaurantByName(String givenName) {
        return restaurantRepository.getRestaurantByName(givenName);
    }

    public void addNewRestaurant(Restaurant restaurant) {
        restaurantRepository.save(restaurant);
    }
    
}
