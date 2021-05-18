package com.pdzierzega.intecacredit;

import com.pdzierzega.intecacredit.model.Credit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class CreditDao {

    private SimpleJdbcInsert jdbcInsert;
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public CreditDao(SimpleJdbcInsert jdbcInsert, JdbcTemplate jdbcTemplate) {
        this.jdbcInsert = jdbcInsert;
        this.jdbcTemplate = jdbcTemplate;
    }

    public int executeSimpleInsert(Credit credit){
        HashMap map=new HashMap();
        map.put("CreditName",credit.getCreditName());

        return this.jdbcInsert.executeAndReturnKey(map).intValue();
    }


    public List<Credit> getAll() {
        String querry= "SELECT * FROM Credit;";
        return jdbcTemplate.query(querry,new CreditRowMapper());
    }
}
