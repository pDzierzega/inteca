package com.pdzierzega.intecacredit.model;


import com.fasterxml.jackson.annotation.JsonInclude;

public class Credit {
    private Integer id;
    private String creditName;


    public Credit() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreditName() {
        return creditName;
    }

    public void setCreditName(String creditName) {
        this.creditName = creditName;
    }

}
