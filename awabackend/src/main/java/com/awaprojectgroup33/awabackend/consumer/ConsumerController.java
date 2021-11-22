package com.awaprojectgroup33.awabackend.consumer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping
    public List<Consumer> getConsumer() {
        return consumerService.getConsumer();
    }

    @PostMapping
    public void registerNewConsumer(@RequestBody Consumer consumer) {
        consumerService.addNewConsumer(consumer);
    }
    
}
