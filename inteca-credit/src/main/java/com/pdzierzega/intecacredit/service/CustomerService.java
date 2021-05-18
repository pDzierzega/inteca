package com.pdzierzega.intecacredit.service;

import com.pdzierzega.intecacredit.model.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Service
public class CustomerService {

    private  String urlResources;
    private RestTemplate restTemplate;

    public CustomerService( @Value("${url.customer-component}") String urlResources, RestTemplate restTemplate) {
        this.urlResources = urlResources;
        this.restTemplate = restTemplate;
    }

    public Integer createCustomer(Customer customer) {
        return restTemplate.postForObject(urlResources,customer,Integer.class);
    }


    public List<Customer> getAll(){
        ResponseEntity<List<Customer>> responseEntity=
                restTemplate.exchange(urlResources, HttpMethod.GET, null, new ParameterizedTypeReference<List<Customer>>() {
                });

        return responseEntity.getBody();
    }
}
