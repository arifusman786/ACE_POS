/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pos.model.customers;

/**
 *
 * @author Arif
 */
public class CustomerReport {
    private String customerName;
    private float sales;
    private float received;
    private float balance;
    private String status;
    private int customerID;

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public float getReceived() {
        return received;
    }

    public void setReceived(float received) {
        this.received = received;
    }

    public float getSales() {
        return sales;
    }

    public void setSales(float sales) {
        this.sales = sales;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CustomerReport{" + "customerName=" + customerName + "sales=" + sales + "received=" + received + "balance=" + balance + "status=" + status + "customerID=" + customerID + '}';
    }

    
    
}
