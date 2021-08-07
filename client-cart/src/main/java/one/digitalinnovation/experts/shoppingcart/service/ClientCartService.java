package one.digitalinnovation.experts.shoppingcart.service;

import one.digitalinnovation.experts.shoppingcart.model.ClientCart;

public interface ClientCartService {
    ClientCart findByClientId(Long id);
}
