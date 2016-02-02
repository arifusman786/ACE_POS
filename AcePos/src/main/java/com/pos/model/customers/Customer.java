/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pos.model.customers;

/**
 *
 * @author Arif
 */
public class Customer {
    public static String CUSTOMERID="CUSTOMERID";
    public static String PERSONID="PERSONID";
    public static String REFERANCE="REFERANCE";
    public static String TYPE="TYPE";

    private int customerId;
    private int personId;
    private String reference;
    private String type;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
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
        return "Customer{" + "customerId=" + customerId + "personId=" + personId + "reference=" + reference + "type=" + type + '}';
    }

    public static String getCommaSeparatedStrOfCustomerColumns(){
        return CUSTOMERID+", "+PERSONID+", "+REFERANCE+", "+TYPE;
    }

    public static String getCommaSeparatedStrOfCustomersColumnsForUpdateQuery(){
        String tempStr = REFERANCE+"=?, "+TYPE+"=?";

        return tempStr;
    }
    
}
