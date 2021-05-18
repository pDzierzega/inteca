package com.pdzierzega.intecacustomer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import javax.sql.DataSource;

@Configuration
public class Config {

    @Autowired
    private DataSource dataSource;

    @Bean
    public SimpleJdbcInsert getSimpleJdbcInsert (){
        return new SimpleJdbcInsert(dataSource)
                .withTableName("Customer")
                .usingGeneratedKeyColumns("Id");
    }

    @Bean
    public JdbcTemplate getJdbcTemplate(){
        return new JdbcTemplate(dataSource);
    }


}
