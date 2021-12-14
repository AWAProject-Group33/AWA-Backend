package com.awaprojectgroup33.awabackend.orderHistory;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderHistoryService {
    
    private final OrderHistoryRepository orderHistoryRepository;

    @Autowired
    public OrderHistoryService(OrderHistoryRepository orderHistoryRepository) {
        this.orderHistoryRepository = orderHistoryRepository;
    }

    public List<OrderHistory> getOrderHistory() {
        return orderHistoryRepository.findAll();
    }

    public void addNewOrderHistory(OrderHistory orderHistory) {
        orderHistoryRepository.save(orderHistory);
    }

    
}
