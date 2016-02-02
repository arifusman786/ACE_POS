/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.model.invoice;

/**
 *
 * @author Arif
 */
public class InvoiceById {

    private String phone;
    private String invoiceId;
    private String productId;
    private long quantity;
    private double lineTotal;
    private double cost;
    private double taxable;
    private long iid;
    private String productName;

    public InvoiceById(String phone, String invoiceId, String productId, long quantity, double lineTotal, double cost, double taxable, long iid, String productName) {
        this.phone = phone;
        this.invoiceId = invoiceId;
        this.productId = productId;
        this.quantity = quantity;
        this.lineTotal = lineTotal;
        this.cost = cost;
        this.taxable = taxable;
        this.iid = iid;
        this.productName = productName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public double getLineTotal() {
        return lineTotal;
    }

    public void setLineTotal(double lineTotal) {
        this.lineTotal = lineTotal;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getTaxable() {
        return taxable;
    }

    public void setTaxable(double taxable) {
        this.taxable = taxable;
    }

    public long getIid() {
        return iid;
    }

    public void setIid(long iid) {
        this.iid = iid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "InvoiceById{" + "phone=" + phone + ", invoiceId=" + invoiceId + ", productId=" + productId + ", quantity=" + quantity + ", lineTotal=" + lineTotal + ", cost=" + cost + ", taxable=" + taxable + ", iid=" + iid + ", productName=" + productName + '}';
    }

}
