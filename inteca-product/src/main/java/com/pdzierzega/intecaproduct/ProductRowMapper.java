package com.pdzierzega.intecaproduct;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet resultSet, int i) throws SQLException {

        Product product=new Product();
        product.setCreditId(resultSet.getInt("CreditID"));
        product.setValue(resultSet.getInt("Value"));
        product.setProductName(resultSet.getString("ProductName"));

        return product;
    }
}
