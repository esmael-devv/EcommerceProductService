package dev.ismail.EcommerceProductService.client;

import dev.ismail.EcommerceProductService.dto.FakeStoreProductResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class FakeStoreClient {
    @Autowired
    private RestTemplateBuilder restTemplateBuilder;
    @Value("${fakestore.api.base.url}")  // this annotation will fetch the value from application.properties and inject that value to this variable
    private String fakeStoreAPIBaseURL;
    @Value("${fakestore.api.product.path}")
    private String fakeStoreAPIProductPath;

    public List<FakeStoreProductResponseDTO> getAllProducts() {
        String fakeStoreAPIProductURL = fakeStoreAPIBaseURL.concat(fakeStoreAPIProductPath);
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductResponseDTO[]> productResponse = restTemplate.getForEntity(fakeStoreAPIProductURL, FakeStoreProductResponseDTO[].class);
        return List.of(productResponse.getBody());
    }
}
