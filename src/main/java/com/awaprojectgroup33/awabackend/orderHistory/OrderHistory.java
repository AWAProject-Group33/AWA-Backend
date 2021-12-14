package com.awaprojectgroup33.awabackend.orderHistory;

import javax.persistence.*;

@Entity(name = "OrderHistory")
@Table(name = "order_history")
public class OrderHistory {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(
        name = "order_history_id",
        updatable = false,
        nullable = false
    )
    private long orderHistoryId;

    @Column(
        name = "consumer_id"
        //updatable = false, //this should be automated and not updatable but is not atm
        //nullable = false
    )
    @JoinColumn(name = "consumer_id")
    private long consumerId;

    @Column(
        name = "manager_id"
        //updatable = false, //this should be automated and not updatable but is not atm
        //nullable = false
    )
    @JoinColumn(name = "manager_id")
    private long managerId;

    @Column(name = "products")
    private String products;



    public OrderHistory() {
    }


    public OrderHistory(long consumerId, long managerId, String products) {
        this.consumerId = consumerId;
        this.managerId = managerId;
        this.products = products;
    }


    public long getOrderHistoryId() {
        return this.orderHistoryId;
    }


    public long getConsumerId() {
        return this.consumerId;
    }

    //changing id shouldn't be an option but have to figure how to automatically get consumer id into orderhistory
    public void setConsumerId(long consumerId) {
        this.consumerId = consumerId;
    }

    public long getManagerId() {
        return this.managerId;
    }

    //changing id shouldn't be an option but have to figure how to automatically get manager id into orderhistory
    public void setManagerId(long managerId) {
        this.managerId = managerId;
    }

    public String getProducts() {
        return this.products;
    }

    public void setProducts(String products) {
        this.products = products;
    }



}
