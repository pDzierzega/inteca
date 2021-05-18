package com.pdzierzega.intecacustomer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerDao dao;

    @PostMapping("/customers")
    public Integer createCustomer(@RequestBody Customer customer){
        return dao.executeSimpleInsert(customer);
    }

    @GetMapping("/customers")
    public List<Customer> getCustomers(){
        return dao.getAll();
    }

}
