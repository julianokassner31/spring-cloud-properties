package one.digitalinnovation.experts.shoppingcart.service;

import one.digitalinnovation.experts.shoppingcart.model.ClientCart;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class ClientCartServiceImpl implements ClientCartService {
    @Value("${endpoint.shopping.cart}")
    private String url;

    private RestTemplate restTemplate = new RestTemplate();

    @Override
    public ClientCart findByClientId(Long id) {
        Map<String, Object> params = new HashMap<>();
        params.put("id", id);
        ResponseEntity<ClientCart> responseEntity = restTemplate.getForEntity(this.url.concat("/client/{id}"), ClientCart.class, params);

        return responseEntity.getBody();
    }
}
