package one.digitalinnovation.experts.shoppingcart.controller;

import one.digitalinnovation.experts.shoppingcart.model.Product;
import one.digitalinnovation.experts.shoppingcart.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    public Product create(@RequestBody Product product) {

        return productRepository.save(product);
    }
    @GetMapping("/{id}")
    public Product find(@PathVariable Long id) {
        return productRepository.findById(id).orElse(null);
    }
}
