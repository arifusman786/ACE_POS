/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pos.model.customers;

import com.pos.model.persons.Person;


/**
 *
 * @author Arif
 */
public class FullCustomerInformation {
    private Customer customer;
    private Person person;

    public FullCustomerInformation() {
        customer = new Customer();
       //person = new Person();
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    
    
}
