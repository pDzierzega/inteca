package com.pdzierzega.intecacredit.DTO;

import com.pdzierzega.intecacredit.model.Credit;

public class CreditDto {
    private String creditName;

    public CreditDto(Credit credit) {
        this.creditName=credit.getCreditName();
    }

    public String getCreditName() {
        return creditName;
    }
}
