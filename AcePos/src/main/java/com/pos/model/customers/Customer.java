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
public class Customer implements Serializable {

    public static String CUSTOMERID = "CUSTOMERID";
    public static String PERSONID = "PERSONID";
    public static String REFERANCE = "REFERANCE";
    public static String TYPEOFCUSTOMER = "TYPEOFCUSTOMER";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customerId")
    private int customerId;
    private int personId;
    private String referance;
    @Column(name = "typeofcustomer")
    private String typeOfCustomer;

    public Customer() {
        System.err.println("Overloaded constructor called for Customer's");

    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    /**
     *
     * @param factory
     * @return
     */
    public List<Customer> getCustomers(SessionFactory factory) {
//        this.factory = HibernateUtil.getSessionFactory();
        List<Customer> list = null;
        System.out.println("Session factory populated successfully");

        list = factory.getCurrentSession().createQuery(" from Customers ").list();

//      
        return list;
    }

    /*
     * Gets customer based on the customerId
     * @param customerId
     * @param factory
     * @return Null if not found otherwise customer against customerId
     */
    public Customer getCustomerById(int customerId, SessionFactory factory) {
        Customer customer = null;

        System.out.println("Session factory populated successfully so retrieving customer by id " + customerId);
        List<Customer> list = factory.getCurrentSession().createQuery(" from Customers as c where c.customerId=" + customerId).list();

        if (!list.isEmpty()) {
            customer = list.get(0);
        }

        return customer;
    }

    /**
     * Saves an object and returns newly created customer object
     *
     * @param cust Object to be saved
     * @return Newly created customer object
     */
    public Customer saveOrUpdateCustomer(Customer cust, SessionFactory factory) {
        Customer customer = null;
        if (factory == null) {
            System.out.println("Session factory not populated properly");

        } else {
            System.out.println("Session factory not populated successfully");
            factory.getCurrentSession().saveOrUpdate(cust);

//            }
        }

        return customer;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getReferance() {
        return referance;
    }

    public void setReferance(String referance) {
        this.referance = referance;
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
        return "Customer{" + "customerId=" + customerId + ", reference=" + referance + ", typeOfCustomer=" + typeOfCustomer + '}';
    }

}
