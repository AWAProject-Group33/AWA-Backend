package com.awaprojectgroup33.awabackend.db;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumerRepository extends JpaRepository<Consumer, Long> {

    //code below in SQL, "SELECT * FROM consumer WHERE email = ?"
    Optional<Consumer> findConsumerByEmail(String email);
    
}
