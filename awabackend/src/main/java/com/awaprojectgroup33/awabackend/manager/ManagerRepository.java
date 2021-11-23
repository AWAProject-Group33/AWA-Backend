package com.awaprojectgroup33.awabackend.manager;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerRepository extends JpaRepository<Manager, Long> {

    //code below in SQL, "SELECT * FROM manager WHERE email = ?"
    Optional<Manager> findManagerByEmail(String email);

    final String getManagerByIdQuery = "SELECT * FROM manager WHERE manager_id=?1";

    @Query(value = getManagerByIdQuery, nativeQuery = true)
    Optional<Manager> getManagerByID(Long givenID);
    
}
