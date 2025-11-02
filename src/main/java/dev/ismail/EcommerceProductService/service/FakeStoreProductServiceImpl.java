package dev.ismail.EcommerceProductService.service;

import dev.ismail.EcommerceProductService.client.FakeStoreClient;
import dev.ismail.EcommerceProductService.dto.FakeStoreProductResponseDTO;
import dev.ismail.EcommerceProductService.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FakeStoreProductServiceImpl implements ProductService{
    @Autowired
    private FakeStoreClient fakeStoreClient;

    @Override
    public List<FakeStoreProductResponseDTO> getAllProducts() {
        List<FakeStoreProductResponseDTO> products = fakeStoreClient.getAllProducts();
        return products;
    }

    public List<Product> getProduct(int id) {
        return null;
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public Product updateProduct(Product updateProduct, int product_id) {
        return null;
    }

    public boolean deleteProduct(int product_id) {
        return false;
    }
}
