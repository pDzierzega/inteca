package com.pdzierzega.intecacredit.DTO;

import com.pdzierzega.intecacredit.model.Customer;

public class CustomerDto {

    private String firstName;
    private String pesel;
    private String surname;

    public CustomerDto(Customer customer) {
        this.firstName= customer.getFirstName();
        this.pesel= customer.getPesel();
        this.surname= customer.getSurname();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPesel() {
        return pesel;
    }

    public String getSurname() {
        return surname;
    }
}
