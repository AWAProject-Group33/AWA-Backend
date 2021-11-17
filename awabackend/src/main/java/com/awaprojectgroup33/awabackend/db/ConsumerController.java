package com.awaprojectgroup33.awabackend.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/consumer")
public class ConsumerController {

    private final ConsumerService consumerService;


    @Autowired
    public ConsumerController(ConsumerService consumerService) {
        this.consumerService = consumerService;
    }

    public List<Consumer> getConsumer() {
        return consumerService.getConsumer();
    }

    @PostMapping
    public void registerNewCustomer(@RequestBody Consumer consumer) {
        consumerService.addNewConsumer(consumer);
    }
    
}
