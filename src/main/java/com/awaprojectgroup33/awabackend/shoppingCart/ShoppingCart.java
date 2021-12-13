package com.awaprojectgroup33.awabackend.shoppingCart;

import javax.persistence.*;

@Entity(name = "ShoppingCart")
@Table(name = "shopping_cart")
public class ShoppingCart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(
        name = "shopping_id",
        updatable = false,
        nullable = false
    )
    private long shoppingCartId;

    @Column(
        name = "consumer_id"
        //updatable = false, //this should be automated and not updatable but is not atm
        //nullable = false
    )
    @JoinColumn(name = "consumer_id")
    private long consumerId;


    public ShoppingCart() {
    }


    public ShoppingCart(long consumerId) {
        this.consumerId = consumerId;
    }


    public long getShoppingCartId() {
        return this.shoppingCartId;
    }

    public long getConsumerId() {
        return this.consumerId;
    }

    //changing id shouldn't be an option but have to figure how to automatically get consumer id into shoppingCart
    public void setConsumerId(long consumerId) {
        this.consumerId = consumerId;
    }


    
}
