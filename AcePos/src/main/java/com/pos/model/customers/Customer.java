/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.model.customers;

import com.pos.model.persons.Person;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Arif
 */
@Entity(name = "Customers")
@Transactional
public class Customer extends Person implements Serializable {

    public static String CUSTOMERID = "CUSTOMERID";
    public static String PERSONID = "PERSONID";
    public static String REFERANCE = "REFERANCE";
    public static String TYPE = "TYPE";
    
    
    private int customerId;
    private String reference;
    private String type;
    
    public Customer(SessionFactory factory) {
        System.err.println("Overloaded constructor called for Customer's" +factory);
        this.factory = factory;
    }
    
    public Customer() {
        System.err.println("Customer's constructor called ");
    }
    
    

    public SessionFactory getFactory() {
        return factory;
    }

    @Autowired
    public void setFactory(SessionFactory factory) {
        System.err.println("Setting session factory to "+factory);
        this.factory = factory;
    }

    /**
     * Gets a list of all customers
     * 
     * @return 
     */
    public List<Customer> getCustomers() {
        List<Customer> list = null;
        if (factory == null) {
            System.out.println("Session factory not populated properly");
            return null;
        } else {
            System.out.println("Session factory not populated successfully");
            list = factory.getCurrentSession().createQuery("* from Customers").list();
        }
        
        return list;
    }
    
    /**
     * Gets customer based on the customerId
     * 
     * @return Null if not found otherwise customer against customerId
     */
    public Customer getCustomerById(int customerId) {
        Customer customer = null;
        if (factory == null) {
            System.out.println("Session factory not populated properly");
            return null;
        } else {
            System.out.println("Session factory not populated successfully");
            List<Customer> list = factory.getCurrentSession().createQuery("* from Customers where Customers.customerId="+customerId).list();
            if(!list.isEmpty())
                customer = list.get(0);
        }
        
        return customer;
    }
    
    /**
     * Saves an object and returns newly created customer object
     * @param cust Object to be saved
     * @return Newly created customer object
     */
    public Customer saveCustomer(Customer cust){
        Customer customer = null;
        if (factory == null) {
            System.out.println("Session factory not populated properly");
            
        } else {
            System.out.println("Session factory not populated successfully");
            Object customerObject = factory.getCurrentSession().save(cust);
            if(customerObject!=null)
                customer = (Customer)customerObject;
        }
        
        return customer;
    }
    
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Customer{" + "customerId=" + customerId + "reference=" + reference + "type=" + type + '}';
    }

    public static String getCommaSeparatedStrOfCustomerColumns() {
        return CUSTOMERID + ", " + PERSONID + ", " + REFERANCE + ", " + TYPE;
    }

    public static String getCommaSeparatedStrOfCustomersColumnsForUpdateQuery() {
        String tempStr = REFERANCE + "=?, " + TYPE + "=?";

        return tempStr;
    }

}
