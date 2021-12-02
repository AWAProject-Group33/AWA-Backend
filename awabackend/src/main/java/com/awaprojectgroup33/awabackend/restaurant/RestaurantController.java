package com.awaprojectgroup33.awabackend.restaurant;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/restaurant")
@CrossOrigin(origins = "*")
public class RestaurantController {

    private final RestaurantService restaurantService;


    @Autowired
    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @GetMapping("all")
    public List<Restaurant> getRestaurant() {
        return restaurantService.getRestaurant();

    }

    @GetMapping("{givenName}")
    public List<Restaurant> getRestaurantByNameOpt(@PathVariable String givenName){
        return restaurantService.getRestaurantByName(givenName);
    }

    @PostMapping("newrestaurant")
    public void addNewRestaurant(@RequestBody Restaurant restaurant) {
        restaurantService.addNewRestaurant(restaurant);
    }
    
}
