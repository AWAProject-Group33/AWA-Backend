package com.awaprojectgroup33.awabackend.orderHistory;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/orderhistory")
@CrossOrigin
public class OrderHistoryController {
    
    private final OrderHistoryService orderHistoryService;

    @Autowired
    public OrderHistoryController(OrderHistoryService orderHistoryService) {
        this.orderHistoryService = orderHistoryService;
    }

    @GetMapping("all")
    public List<OrderHistory> getOrderHistory() {
        return orderHistoryService.getOrderHistory();
    }

    @PostMapping("new")
    public void addNewOrderHistory(@RequestBody OrderHistory orderHistory) {
        orderHistoryService.addNewOrderHistory(orderHistory);
    }
}
