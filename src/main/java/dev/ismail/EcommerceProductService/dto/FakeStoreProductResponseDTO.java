package dev.ismail.EcommerceProductService.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductResponseDTO {
    private int id;
    private String title;
    private String description;
    private double price;
    private String category;
    private String image;
    private FakeStoreProductRatingDTO rating;
}
