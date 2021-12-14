package com.awaprojectgroup33.awabackend.restaurant;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

    // doesnt work yet
    final String getRestaurantByNameQuery = "SELECT * FROM restaurant WHERE name LIKE '%?1%' ";

    @Query(value = getRestaurantByNameQuery, nativeQuery = true)
    List<Restaurant> getRestaurantByName(String givenName);

    
}
