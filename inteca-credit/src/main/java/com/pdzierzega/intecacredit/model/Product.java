package com.pdzierzega.intecacredit.model;

import com.fasterxml.jackson.annotation.JsonInclude;

public class Product {

    private Integer creditId;
    private String productName;
    private Integer value;


    public Product() {
    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getCreditId() {
        return creditId;
    }

    public void setCreditId(Integer creditId) {
        this.creditId = creditId;
    }

}
