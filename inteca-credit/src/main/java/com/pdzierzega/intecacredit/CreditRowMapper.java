package com.pdzierzega.intecacredit;

import com.pdzierzega.intecacredit.model.Credit;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CreditRowMapper implements RowMapper<Credit> {
    @Override
    public Credit mapRow(ResultSet resultSet, int i) throws SQLException {

        Credit credit=new Credit();
        credit.setCreditName(resultSet.getString("CreditName"));
        credit.setId(resultSet.getInt("ID"));
        return credit;
    }
}
