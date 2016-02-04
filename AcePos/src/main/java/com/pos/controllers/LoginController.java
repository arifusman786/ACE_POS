/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.controllers;

import com.pos.model.customers.Customer;
import com.pos.model.customers.HibernateUtil;
import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Arif
 */
@Controller
public class LoginController {

    private SessionFactory factory;

    public LoginController() {
        System.out.println("***********************************Controller loaded------------------------------");

    }

    @RequestMapping(value = "main")
    public String main(Model model) {

        //getListCustomers();
        //getCustomerById(1);
        Customer customer = new Customer();
        customer.setCustomerId(1);
        customer.setReferance("Updated Reference");
        saveOrUpdateCustomer(customer);
        return "main";
    }

    /**
     * 
     * @return 
     */
    public List<Customer> getListCustomers() {
        factory = HibernateUtil.getSessionFactory();
        //factory.getCurrentSession().beginTransaction();
        factory.getCurrentSession().beginTransaction();
        List<Customer> list = null;
        try {
            System.out.println("***********************************Handler called------------------------------");
            Customer cust = new Customer();
            //cust.setFirstName("Muhammad");
            list = cust.getCustomers(factory);
            System.err.println("list of customers = " + list);
            factory.getCurrentSession().close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }

        return list;
    }

    /**
     * 
     * @param customerId
     * @return 
     */
    public Customer getCustomerById(int customerId) {

        Customer customer = null;
        try {
            System.out.println("***********************************Handler called------------------------------");
            factory = HibernateUtil.getSessionFactory();
            //factory.getCurrentSession().beginTransaction();
            factory.getCurrentSession().beginTransaction();
            Customer cust = new Customer();
            //cust.setFirstName("Muhammad");
            customer = cust.getCustomerById(customerId, factory);
            System.err.println("Customer retrieved = " + customer);
            factory.getCurrentSession().close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }

        return customer;
    }

    /**
     * 
     * @param customer
     * @return 
     */
    public boolean saveOrUpdateCustomer(Customer customer) {

        //Customer customer = null;
        try {
            System.out.println("***********************************Handler called------------------------------");
            factory = HibernateUtil.getSessionFactory();
            //factory.getCurrentSession().beginTransaction();
            factory.getCurrentSession().beginTransaction();
            Customer cust = new Customer();
            //cust.setFirstName("Muhammad");
            customer = cust.saveOrUpdateCustomer(customer, factory);
            System.err.println("Customer saved = " + customer);
            factory.getCurrentSession().close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }

        return true;
    }

    @RequestMapping(value = "bills")
    public String bills(Model model) {
        return "bills";
    }

}
