package com.awaprojectgroup33.awabackend.shoppingCart;

import javax.persistence.*;

@Entity(name = "CartItems")
@Table(name = "cart_items")
public class CartItems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(
        name = "cart_items_id",
        updatable = false,
        nullable = false
    )
    private long cartItemsId;

    @Column(name = "product_id")
    private long productId;

    @Column(
        name = "shopping_id"
        //updatable = false, //this should be automated and not updatable but is not atm
        //nullable = false
    )
    @JoinColumn(name = "shopping_id")
    private long shoppingCartId;

    @Column(name = "quantity")
    private long quantity;


    public CartItems() {
    }


    public CartItems(long productId, long shoppingCartId, long quantity) {
        this.productId = productId;
        this.shoppingCartId = shoppingCartId;
        this.quantity = quantity;
    }


    public long getCartItemsId() {
        return this.cartItemsId;
    }

    public long getProductId() {
        return this.productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public long getShoppingCartId() {
        return this.shoppingCartId;
    }

    //changing id shouldn't be an option but have to figure how to automatically get shoppingcart id into cartItems
    public void setShoppingCartId(long shoppingCartId) {
        this.shoppingCartId = shoppingCartId;
    }

    public long getQuantity() {
        return this.quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }


    
}
