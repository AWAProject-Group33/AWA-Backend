package com.awaprojectgroup33.awabackend.consumer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/consumer")
@CrossOrigin
public class ConsumerController {

    private final ConsumerService consumerService;


    @Autowired
    public ConsumerController(ConsumerService consumerService) {
        this.consumerService = consumerService;
    }

    @GetMapping("all")
    public List<Consumer> getConsumer() {
        List<Consumer> testList = consumerService.getConsumer();
        return testList;
    } 

    @PostMapping("registernewconsumer")
    public void registerNewConsumer(@RequestBody Consumer consumer) {
        consumerService.addNewConsumer(consumer);
    }

    @GetMapping("{givenID}")
    public Optional<Consumer> getConsumerById(@PathVariable Long givenID){
        return consumerService.getConsumerByID(givenID);
    }
    
}
