package com.pdzierzega.intecacustomer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CustomerDao {

    private SimpleJdbcInsert jdbcInsert;
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public CustomerDao(SimpleJdbcInsert jdbcInsert, JdbcTemplate jdbcTemplate) {
        this.jdbcInsert = jdbcInsert;
        this.jdbcTemplate = jdbcTemplate;
    }

    @Transactional
    public Integer executeSimpleInsert(Customer customer){
        HashMap map=new HashMap();

        map.put("CreditID",customer.getCreditId());
        map.put("FirstName",customer.getFirstName());
        map.put("Pesel",customer.getPesel());
        map.put("Surname",customer.getSurname());

        return this.jdbcInsert.execute(map);
    }


    public List<Customer> getAll() {
        String querry= "SELECT * FROM Customer;";
        return jdbcTemplate.query(querry,new CustomerRowMapper());
    }
}
