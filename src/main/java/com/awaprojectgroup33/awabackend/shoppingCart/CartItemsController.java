package com.awaprojectgroup33.awabackend.shoppingCart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/cartitems")
@CrossOrigin
public class CartItemsController {
    

    private final CartItemsService cartItemsService;

    @Autowired
    public CartItemsController(CartItemsService cartItemsService) {
        this.cartItemsService = cartItemsService;
    }

    @GetMapping("all")
    public List<CartItems> getCartItems() {
        return cartItemsService.getCartItems();
    }

    @PostMapping("new")
    public void addNewCartItems(@RequestBody CartItems cartItems) {
        cartItemsService.addNewCartItems(cartItems);
    }
}
