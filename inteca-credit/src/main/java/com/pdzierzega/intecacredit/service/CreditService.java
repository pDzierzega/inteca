package com.pdzierzega.intecacredit.service;

import com.pdzierzega.intecacredit.CreditDao;
import com.pdzierzega.intecacredit.DTO.RequestDto;
import com.pdzierzega.intecacredit.DTO.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
public class CreditService {

    private CreditDao dao;
    private CustomerService customerService;
    private ProductService productService;


    @Autowired
    public CreditService(CreditDao dao, CustomerService customerService, ProductService productService) {
        this.dao = dao;
        this.customerService = customerService;
        this.productService = productService;
    }

    @Transactional
    public int createCredit(RequestDto dto) {
        int creditId = dao.executeSimpleInsert(dto.getCredit());

        dto.getCredit().setId(creditId);
        dto.getCustomer().setCreditId(creditId);
        dto.getProduct().setCreditId(creditId);

        this.productService.createProduct(dto.getProduct());
        this.customerService.createCustomer(dto.getCustomer());

        return creditId;
    }


    public Collection <ResponseDto> getAllAsList() {
        Map<Integer, ResponseDto> map=new HashMap<>();

        dao.getAll().forEach(credit -> {
            ResponseDto dto = new ResponseDto();
            dto.setCredit(credit);
            map.put(credit.getId(),dto);
        });

        customerService.getAll().stream()
                .filter(customer-> map.containsKey(customer.getCreditId()))
                .forEach(customer -> {
                    ResponseDto dto=map.get(customer.getCreditId());
                    dto.setCustomer(customer);
        });

        productService.getAll().stream()
                .filter(product-> map.containsKey(product.getCreditId()))
                .forEach(product -> {
                    ResponseDto dto=map.get(product.getCreditId());
                    dto.setProduct(product);
        });

        return map.values();
    }






}
