package one.digitalinnovation.experts.shoppingcart.controller;

import one.digitalinnovation.experts.shoppingcart.model.Cart;
import one.digitalinnovation.experts.shoppingcart.model.Product;
import one.digitalinnovation.experts.shoppingcart.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/cart")
public class CartController {

    @Autowired
    private CartRepository cartRepository;

    @PostMapping
    public Cart create(@RequestBody Cart cart) {

        return cartRepository.save(cart);
    }
    @GetMapping("/{id}")
    public Cart find(@PathVariable Long id) {
        return cartRepository.findById(id).orElse(null);
    }

    @GetMapping("/client/{clientId}")
    public String findByClientId(@PathVariable Long clientId) {
        return "{\"id\": "+clientId+"," +
                "\"clientName\": \"Juliano\"," +
                "\"price\": 120.10," +
                "\"items\": [" +
                    "\"Tenis\", \"Meia\", \"Calça\"" +
                    "]"+
                "}";
    }
}
