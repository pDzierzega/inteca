package com.pdzierzega.intecacustomer;

import com.fasterxml.jackson.annotation.JsonInclude;

public class Customer {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer creditId;

    private String firstName;
    private String surname;
    private String pesel;


    public Customer() {
    }


    public Integer getCreditId() {
        return creditId;
    }

    public void setCreditId(Integer creditId) {
        this.creditId = creditId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
