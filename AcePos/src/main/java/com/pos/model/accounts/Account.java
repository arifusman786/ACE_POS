/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pos.model.accounts;

import java.sql.Timestamp;

/**
 *
 * @author Arif
 */
public class Account {
    public static String ACCOUNTID="ACCOUNTID";
    public static String PERSONID="PERSONID";
    public static String DEBIT="DEBIT";
    public static String CREDIT="CREDIT";
    public static String TYPE="TYPE";
    public static String STATUS="STATUS";
    public static String ACCOUNTTITLE="ACCOUNTTITLE";
    public static String BALANCE="BALANCE";
    public static String CREATIONDATE="CREATIONDATE";

    public static String COMPANYACCOUNTTITLE="Khyber Water Tank";
    public static int COMPANYACCOUNTID=14;
    //public static int COMPANYACCOUNTID=80;
    public static int COMPANYPERSONID=37;
    //public static int COMPANYPERSONID=107;
    
    private int iD;
    private int personId;
    private int accountID;

   
    private float debit;
    private float credit;
    private String type;
    private String status;
    private Timestamp creationDate;
    private float balance;
    private String accountTitle;

    public String getAccountTitle() {
        return accountTitle;
    }

    public void setAccountTitle(String accountTitle) {
        this.accountTitle = accountTitle;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

   



     public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }



    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }



    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



//    public CreateAccountBean(int iD, int debit, int credit, String status, String type, int balance, String accountTitle) {
//        this.iD = iD;
//        this.debit = debit;
//        this.credit = credit;
//        this.type = type;
//        this.creationDate = new Timestamp(Calendar.getInstance().getTimeInMillis());
//        this.balance = balance;
//        this.accountTitle = accountTitle;
//        this.status=status;
//        //SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
//        //String strDate = sdf.format(creationDate);
//        //this.creationDate = new Date();
//
//        //System.out.println("Date formated and now = "+this.creationDate);
//
//    }
//    public CreateAccountBean(int accountID, int customerID, int employeeID,  int debit, int credit, String status, String type) {
//        this.iD = accountID;
//        this.debit = debit;
//        this.credit = credit;
//        this.type = type;
//        this.creationDate = new Timestamp(Calendar.getInstance().getTimeInMillis());
//        this.customerID = customerID;
//        this.employeeID = employeeID;
//
//        //SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
//        //String strDate = sdf.format(creationDate);
//        //this.creationDate = new Date();
//
//        //System.out.println("Date formated and now = "+this.creationDate);
//
//    }
//
//    public CreateAccountBean() {
//    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getCredit() {
        return credit;
    }

    public void setCredit(float credit) {
        this.credit = credit;
    }

    public float getDebit() {
        return debit;
    }

    public void setDebit(float debit) {
        this.debit = debit;
    }
    

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public static String getCommaSeparatedListOfAccountsColumns(){
        String str = ACCOUNTID+", "+ACCOUNTTITLE+", "+BALANCE+", "+CREATIONDATE+", "+CREDIT+", "+DEBIT+", "+PERSONID+", "+STATUS+", "+TYPE;

        return str;

    }

    @Override
    public String toString() {
        return "Account{" + "iD=" + iD + "personId=" + personId + "accountID=" + accountID + "debit=" + debit + "credit=" + credit + "type=" + type + "status=" + status + "creationDate=" + creationDate + "balance=" + balance + "accountTitle=" + accountTitle + '}';
    }

   
    
}
