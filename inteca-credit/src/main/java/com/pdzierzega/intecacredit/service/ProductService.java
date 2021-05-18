package com.pdzierzega.intecacredit.service;

import com.pdzierzega.intecacredit.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ProductService {

    private  String urlResources;
    private RestTemplate restTemplate;

    @Autowired
    public ProductService(@Value("${url.product-component}")String urlResources, RestTemplate restTemplate) {
        this.urlResources = urlResources;
        this.restTemplate = restTemplate;
    }

    public Integer createProduct(Product product) {
        return restTemplate.postForObject(urlResources,product,Integer.class);
    }

    public List<Product> getAll(){
        ResponseEntity<List<Product>> responseEntity=
                restTemplate.exchange(urlResources, HttpMethod.GET, null, new ParameterizedTypeReference<List<Product>>() {
                });

        return responseEntity.getBody();
    }
}
