package com.awaprojectgroup33.controller;

import com.awaprojectgroup33.service.ManagerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ManagerController {
    
    @Autowired
    private ManagerService managerService;
}
