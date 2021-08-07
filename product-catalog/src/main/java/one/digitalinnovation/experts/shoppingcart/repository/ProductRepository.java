package one.digitalinnovation.experts.shoppingcart.repository;

import one.digitalinnovation.experts.shoppingcart.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
