package com.pdzierzega.intecacredit.DTO;

import com.pdzierzega.intecacredit.model.Product;

public class ProductDto {
    private String productName;
    private Integer value;

    public ProductDto(Product product) {
        this.productName=product.getProductName();
        this.value=product.getValue();
    }

    public String getProductName() {
        return productName;
    }

    public Integer getValue() {
        return value;
    }
}
