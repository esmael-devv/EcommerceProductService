package dev.ismail.EcommerceProductService.mapper;

import dev.ismail.EcommerceProductService.dto.ProductResponseDTO;
import dev.ismail.EcommerceProductService.entity.Product;

public class ProductEntityDTOMapper {
    public static ProductResponseDTO convertProductentityToProductResponseDTO(Product product) {
        ProductResponseDTO responseDTO = new ProductResponseDTO();
        responseDTO.setProductId(product.getId());
        responseDTO.setTitle(product.getTitle());
        responseDTO.setDescription(product.getDescription());
        responseDTO.setPrice(product.getPrice());
        responseDTO.setCategory(product.getCategory());
        responseDTO.setImageURL(product.getImageURL());
        responseDTO.setRating(product.getRating());
        return responseDTO;
    }
}
