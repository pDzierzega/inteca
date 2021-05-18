package com.pdzierzega.intecaproduct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ProductController {

    @Autowired
    private ProductDao dao;

    @PostMapping("/products")
    public Integer createProduct(@RequestBody Product product){
        return dao.executeSimpleInsert(product);
    }

    @GetMapping("/products")
    public List<Product> getCustomers(){
        return dao.getAll();
    }


}
