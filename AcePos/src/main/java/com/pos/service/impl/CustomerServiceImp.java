/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.service.impl;

import com.pos.model.customers.Customer;
import com.pos.model.customers.HibernateUtil;
import com.pos.service.CustomerService;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author Arif
 */
public class CustomerServiceImp implements CustomerService{
    private final SessionFactory factory;

    public CustomerServiceImp() {
        factory = HibernateUtil.getSessionFactory();
    }
    
    @Override
    public Customer getCustomerById(int customerId) {
        Customer customer = null;
        try {
            System.out.println("***********************************Service's Handler called------------------------------");
            //factory.getCurrentSession().beginTransaction();
            factory.getCurrentSession().beginTransaction();
            //Customer cust = new Customer();
            //cust.setFirstName("Muhammad");
            System.out.println("Session factory populated successfully so retrieving customer by id " + customerId);
            List<Customer> list = factory.getCurrentSession().createQuery(" from Customers as c where c.customerId=" + customerId).list();

            if (!list.isEmpty()) {
                customer = list.get(0);
            }
            System.err.println("Customer retrieved = " + customer);
            factory.getCurrentSession().close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }

        return customer;
    }



    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> list = null;
        System.out.println("Session factory populated successfully");

        list = factory.getCurrentSession().createQuery(" from Customers ").list();

//      
        return list;
    }


    @Override
    public void saveOrUpdateCustomer(Customer customer) {
        
        System.out.println("Session factory not populated successfully");
        factory.getCurrentSession().saveOrUpdate(customer);
        
    }
    
}
