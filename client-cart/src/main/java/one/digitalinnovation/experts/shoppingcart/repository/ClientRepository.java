package one.digitalinnovation.experts.shoppingcart.repository;

import one.digitalinnovation.experts.shoppingcart.model.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Long> {
}
