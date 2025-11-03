package dev.ismail.EcommerceProductService.service;

import dev.ismail.EcommerceProductService.dto.FakeStoreProductResponseDTO;
import dev.ismail.EcommerceProductService.entity.Product;
import dev.ismail.EcommerceProductService.exception.ProductNotFoundException;

import java.util.List;

public interface ProductService {
    List<FakeStoreProductResponseDTO> getAllProducts();
    FakeStoreProductResponseDTO getProduct(int product_id) throws ProductNotFoundException;
    Product createProduct(Product product);
    Product updateProduct(Product updateProduct, int product_id);
    boolean deleteProduct(int product_id);

}
