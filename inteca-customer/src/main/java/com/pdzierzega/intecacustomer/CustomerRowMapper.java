package com.pdzierzega.intecacustomer;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerRowMapper implements RowMapper<Customer> {
    @Override
    public Customer mapRow(ResultSet resultSet, int i) throws SQLException {

        Customer customer=new Customer();
        customer.setCreditId(resultSet.getInt("CreditID"));
        customer.setFirstName(resultSet.getString("FirstName"));
        customer.setSurname(resultSet.getString("Surname"));
        customer.setPesel(resultSet.getString("Pesel"));

        return customer;
    }
}
