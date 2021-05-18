package com.pdzierzega.intecacredit.DTO;

import com.pdzierzega.intecacredit.model.Credit;
import com.pdzierzega.intecacredit.model.Customer;
import com.pdzierzega.intecacredit.model.Product;

public class ResponseDto {
    private ProductDto product;
    private CreditDto credit;
    private CustomerDto customer;


    public ResponseDto() {
    }

    public void setProduct(Product product) {
        this.product = new ProductDto(product);
    }

    public void setCredit(Credit credit) {
        this.credit = new CreditDto(credit);
    }

    public void setCustomer(Customer customer) {
        this.customer = new CustomerDto(customer);
    }

    public ProductDto getProduct() {
        return product;
    }

    public CreditDto getCredit() {
        return credit;
    }

    public CustomerDto getCustomer() {
        return customer;
    }
}
