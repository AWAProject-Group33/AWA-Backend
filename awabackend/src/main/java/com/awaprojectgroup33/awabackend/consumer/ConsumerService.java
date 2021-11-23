package com.awaprojectgroup33.awabackend.consumer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    private final ConsumerRepository consumerRepository;


    @Autowired
    public ConsumerService(ConsumerRepository consumerRepository) {
        this.consumerRepository = consumerRepository;
    }


    public List<Consumer> getConsumer() {
        return consumerRepository.findAll();

    }


    public void addNewConsumer(Consumer consumer) {
        Optional<Consumer> consumerByEmail = consumerRepository.findConsumerByEmail(consumer.getEmail());
        if (consumerByEmail.isPresent()) {
            throw new IllegalStateException("email taken");
        }
        consumerRepository.save(consumer);
    }


    public Optional<Consumer> getConsumerByID(Long givenID) {
        return consumerRepository.findById(givenID);
    }
}
