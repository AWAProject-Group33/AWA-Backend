package com.awaprojectgroup33.awabackend.consumer;


import java.util.Optional;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumerRepository extends JpaRepository<Consumer, Long> {

    //code below in SQL, "SELECT * FROM consumer WHERE email = ?",  this is used to check that the email is unique
    Optional<Consumer> findConsumerByEmail(String email);


    //Query to find one consumer by id
    final String getConsumerByIdQuery = "SELECT * FROM consumer WHERE consumer_id=?1";

    @Query(value = getConsumerByIdQuery, nativeQuery = true)
    Optional<Consumer> getConsumerByID(Long givenID);


   /* final String consumerPostQuery = "INSERT into consumer (first_name, last_name, email, encrypted_password) values ('');";


    @Transactional
    @Modifying
    @Query(value = consumerPostQuery, nativeQuery = true)
    public void insertConsumer(String fname, String lname, String email, String password);
    */
}
