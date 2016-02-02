/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelclasses;

import java.sql.Timestamp;

/**
 *
 * @author Arif
 */
public class PaidSalary {
    public static String PAIDSALARYID="PAIDSALARYID";
    public static String PAYMENTDATE="PAYMENTDATE";
    public static String PAIDAMOUNT="PAIDAMOUNT";
    public static String STATUS="STATUS";
    public static String SALARYID="SALARYID";

    private int paidSalaryId;
    private int salaryId;

    public int getSalaryId() {
        return salaryId;
    }

    public void setSalaryId(int salaryId) {
        this.salaryId = salaryId;
    }
    private Timestamp paymentDate;
    private float paidAmount;
    private String status;

    public float getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(float paidAmount) {
        this.paidAmount = paidAmount;
    }

    public int getPaidSalaryId() {
        return paidSalaryId;
    }

    public void setPaidSalaryId(int paidSalaryId) {
        this.paidSalaryId = paidSalaryId;
    }

    public Timestamp getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Timestamp paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PaidSalary{" + "paidSalaryId=" + paidSalaryId + "salaryId=" + salaryId + "paymentDate=" + paymentDate + "paidAmount=" + paidAmount + "status=" + status + '}';
    }

   

    
    
}
