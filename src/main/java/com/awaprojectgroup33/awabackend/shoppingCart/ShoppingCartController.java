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
@RequestMapping("api/shoppingcart")
@CrossOrigin
public class ShoppingCartController {

    private final ShoppingCartService shoppingCartService;

    @Autowired
    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @GetMapping("all")
    public List<ShoppingCart> getShoppingCart() {
        return shoppingCartService.getShoppingCart();
    }
    
    @PostMapping("new")
    public void addNewShoppingCart(@RequestBody ShoppingCart shoppingCart) {
        shoppingCartService.addNewShoppingCart(shoppingCart);
    }
}
