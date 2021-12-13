package com.awaprojectgroup33.awabackend.shoppingCart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartItemsService {

    private final CartItemsRepository cartItemsRepository;

    @Autowired
    public CartItemsService(CartItemsRepository cartItemsRepository) {
        this.cartItemsRepository = cartItemsRepository;
    }

    public List<CartItems> getCartItems() {
        return cartItemsRepository.findAll();
    }

    public void addNewCartItems(CartItems cartItems) {
        cartItemsRepository.save(cartItems);
    }
    
}
