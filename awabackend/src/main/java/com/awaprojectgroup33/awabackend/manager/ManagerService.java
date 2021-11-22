package com.awaprojectgroup33.awabackend.manager;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerService {

    private final ManagerRepository managerRepository;

    @Autowired
    public ManagerService(ManagerRepository managerRepository) {
        this.managerRepository = managerRepository;
    }

    public List<Manager> getManager() {
        return managerRepository.findAll();
    }

    public void addNewManager(Manager manager) {
        Optional<Manager> managerByEmail = managerRepository.findManagerByEmail(manager.getEmail());
        if (managerByEmail.isPresent()) {
            throw new IllegalStateException("email taken");
        }
        managerRepository.save(manager);
    }
    
}
