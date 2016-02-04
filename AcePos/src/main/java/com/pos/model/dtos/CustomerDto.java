/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.model.dtos;

import com.pos.model.customers.Customer;
import com.pos.model.persons.Person;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Arif
 */
public class CustomerDto {

    private Person person;
    private Customer customer;

    public CustomerDto(Person person, Customer customer) {
        this.person = person;
        this.customer = customer;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "CustomerDto{" + "person=" + person + ", customer=" + customer + '}';
    }

}
