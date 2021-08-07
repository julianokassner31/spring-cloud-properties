package one.digitalinnovation.experts.shoppingcart.controller;

import one.digitalinnovation.experts.shoppingcart.model.Client;
import one.digitalinnovation.experts.shoppingcart.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/client")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @PostMapping
    public Client create(@RequestBody Client client) {

        return clientRepository.save(client);
    }
    @GetMapping("/{id}")
    public Client find(@PathVariable Long id) {
        return clientRepository.findById(id).orElse(null);
    }
}
