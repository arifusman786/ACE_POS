/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pos.service;
import com.pos.model.customers.Customer;
import java.util.List;

/**
 *
 * @author Eyob
 */
public interface CustomerService {
    
    public Customer getCustomerById(Long id);
    public void saveCustomer(Customer customer);
    public List<Customer> getAllCustomer();
    public void updateCustomerinfo(Customer customer);
    
}
