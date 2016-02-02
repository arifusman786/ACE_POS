/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pos.model.salaries;

/**
 *
 * @author Arif
 */
public class Payment {
    public static String PAYMENTID="PAYMENTID";
    public static String ORDERID="ORDERID";
    public static String PAYMENTTYPE="PAYMENTTYPE";
    public static String PAYMENTSTATUS="PAYMENTSTATUS";
    public static String PAYMENTAMOUNT="PAYMENTAMOUNT";
    public static String PAIDTOTAL="PAIDTOTAL";

    private int paymentID;
    private int orderID;
    private String paymentType;
    private String paymentStatus;
    private float paymentAmount;
    private float paidTotal;

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    

    public float getPaymentAmount() {
        return paymentAmount;
    }

    public float getPaidTotal() {
        return paidTotal;
    }

    public void setPaidTotal(float paidTotal) {
        this.paidTotal = paidTotal;
    }

    public void setPaymentAmount(float paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    

    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "Payment{" + "paymentID=" + paymentID + "orderID=" + orderID + "paymentType=" + paymentType + "paymentStatus=" + paymentStatus + "paymentAmount=" + paymentAmount + "paidTotal=" + paidTotal + '}';
    }

    
}
