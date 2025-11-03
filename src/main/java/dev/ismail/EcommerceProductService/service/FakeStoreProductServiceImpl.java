package dev.ismail.EcommerceProductService.service;

import dev.ismail.EcommerceProductService.client.FakeStoreClient;
import dev.ismail.EcommerceProductService.dto.FakeStoreProductResponseDTO;
import dev.ismail.EcommerceProductService.entity.Product;
import dev.ismail.EcommerceProductService.exception.InvalidInputException;
import dev.ismail.EcommerceProductService.exception.NoProductPresentException;
import dev.ismail.EcommerceProductService.exception.ProductNotFoundException;
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
    public List<FakeStoreProductResponseDTO> getAllProducts() throws NoProductPresentException {
        List<FakeStoreProductResponseDTO> products = fakeStoreClient.getAllProducts();
        if(products == null){
            throw new NoProductPresentException("no products are found");

        }
        return products;
    }

    public FakeStoreProductResponseDTO getProduct(int id) throws ProductNotFoundException {
        if(id<1){
            throw new InvalidInputException("Input "+id+" is not valid");
        }
        FakeStoreProductResponseDTO  product = fakeStoreClient.getProductById(id);
        if(product == null) {
            throw new ProductNotFoundException("Product not found with id " + id);
        }
        return product;
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
