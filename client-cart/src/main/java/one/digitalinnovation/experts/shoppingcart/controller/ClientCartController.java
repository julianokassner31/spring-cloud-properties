package one.digitalinnovation.experts.shoppingcart.controller;

import one.digitalinnovation.experts.shoppingcart.model.ClientCart;
import one.digitalinnovation.experts.shoppingcart.service.ClientCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client-cart")
public class ClientCartController {

    @Autowired
    private ClientCartService clientCartService;

    @GetMapping("/{id}")
    public ClientCart find(@PathVariable Long id) {

        return clientCartService.findByClientId(id);
    }
}
