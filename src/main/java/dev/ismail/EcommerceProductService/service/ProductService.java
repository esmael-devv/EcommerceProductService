package dev.ismail.EcommerceProductService.service;

import dev.ismail.EcommerceProductService.dto.FakeStoreProductResponseDTO;
import dev.ismail.EcommerceProductService.entity.Product;

import java.util.List;

public interface ProductService {
    List<FakeStoreProductResponseDTO> getAllProducts();
    List<Product> getProduct(int product_id);
    Product createProduct(Product product);
    Product updateProduct(Product updateProduct, int product_id);
    boolean deleteProduct(int product_id);

}
