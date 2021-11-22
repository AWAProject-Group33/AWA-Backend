package com.awaprojectgroup33.awabackend.consumer;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumerRepository extends JpaRepository<Consumer, Long> {

    //code below in SQL, "SELECT * FROM consumer WHERE email = ?"
    Optional<Consumer> findConsumerByEmail(String email);

   /* final String consumerPostQuery = "INSERT ....";


    @Transactional
    @Modifying
    @Query(value = consumerPostQuery, nativeQuery = true)
    public void insertConsumer(String fname, String lname, String email, String password);
    */
}
