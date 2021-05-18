package com.pdzierzega.intecacredit.DTO;

import com.pdzierzega.intecacredit.model.Credit;
import com.pdzierzega.intecacredit.model.Customer;
import com.pdzierzega.intecacredit.model.Product;

public class RequestDto {
    private Credit credit;
    private Customer customer;
    private Product product;

    public RequestDto() {
    }

    public Credit getCredit() {
        return credit;
    }

    public void setCredit(Credit credit) {
        this.credit = credit;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

}
