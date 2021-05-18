package com.pdzierzega.intecaproduct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

@Repository
public class ProductDao {

    private SimpleJdbcInsert jdbcInsert;
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public ProductDao(SimpleJdbcInsert jdbcInsert, JdbcTemplate jdbcTemplate) {
        this.jdbcInsert = jdbcInsert;
        this.jdbcTemplate = jdbcTemplate;
    }

    @Transactional
    public Integer executeSimpleInsert(Product product){
        HashMap map=new HashMap();

        map.put("ProductName",product.getProductName());
        map.put("Value",product.getValue());
        map.put("CreditID",product.getCreditId());

        return this.jdbcInsert.executeAndReturnKey(map).intValue();
    }


    public List<Product> getAll() {
        String querry= "SELECT * FROM Product;";
        return jdbcTemplate.query(querry,new ProductRowMapper());
    }



}
