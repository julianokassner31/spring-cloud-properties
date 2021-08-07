package one.digitalinnovation.experts.shoppingcart.repository;

import one.digitalinnovation.experts.shoppingcart.model.Client;
import one.digitalinnovation.experts.shoppingcart.model.ClientCart;
import org.springframework.data.repository.CrudRepository;

public interface ClientCartRepository extends CrudRepository<ClientCart, Long> {
}
