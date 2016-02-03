/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.model.customers;

import com.pos.model.persons.Person;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Arif
 */
@Entity(name = "Customers")
@Transactional
public class Customer implements Serializable {

    public static String CUSTOMERID = "CUSTOMERID";
    public static String PERSONID = "PERSONID";
    public static String REFERANCE = "REFERANCE";
    public static String TYPEOFCUSTOMER = "TYPEOFCUSTOMER";
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;
    private int personId;
    private String reference;
    @Column(name="typeofcustomer")
    private String typeOfCustomer;
    
    protected  SessionFactory factory;
    
    public Customer() {
        System.err.println("Overloaded constructor called for Customer's" +factory);
        
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    
    
    /**
     * Gets a list of all customers
     * 
     * @return 
     */
    public List<Customer> getCustomers() {
        this.factory = HibernateUtil.getSessionFactory();
        List<Customer> list = null;
        if (factory == null) {
            System.out.println("Session factory not populated properly");
            return null;
        } else {
            System.out.println("Session factory not populated successfully");
            Transaction tx = this.factory.getCurrentSession().beginTransaction();
            list = factory.getCurrentSession().createQuery(" from Customers ").list();
            tx.commit();
            this.factory.getCurrentSession().close();
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

   
   
    public static String getCommaSeparatedStrOfCustomerColumns() {
        return CUSTOMERID + ", " + PERSONID + ", " + REFERANCE + ", " + TYPEOFCUSTOMER;
    }

    public static String getCommaSeparatedStrOfCustomersColumnsForUpdateQuery() {
        String tempStr = REFERANCE + "=?, " + TYPEOFCUSTOMER + "=?";

        return tempStr;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    @Override
    public String toString() {
        return "Customer{" + "customerId=" + customerId + ", reference=" + reference + ", typeOfCustomer=" + typeOfCustomer + ", factory=" + factory + '}';
    }
    
}
