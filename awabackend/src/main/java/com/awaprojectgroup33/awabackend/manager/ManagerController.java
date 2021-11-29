package com.awaprojectgroup33.awabackend.manager;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/manager")
public class ManagerController {

    private final ManagerService managerService;


    @Autowired
    public ManagerController(ManagerService managerService) {
        this.managerService = managerService;
    }

    @GetMapping("all")
    public List<Manager> getManager() {
        return managerService.getManager();
    }

    @PostMapping("registernewmanager")
    public void registerNewManager(@RequestBody Manager manager) {
        managerService.addNewManager(manager);
    }

    @GetMapping("{givenID}")
    public Optional<Manager> getManagerById(@PathVariable Long givenID){
        return managerService.getManagerByID(givenID);
    }
    
}
