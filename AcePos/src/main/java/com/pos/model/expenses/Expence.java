/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pos.model.expenses;

import java.sql.Timestamp;

/**
 *
 * @author Arif
 */
public class Expence {
    public static String EXPENCEID="EXPENCEID";
    public static String PERSONID="PERSONID";
    public static String DESCRIPTION="DESCRIPTION";
    public static String EXPENDITUREDATE="EXPENDITUREDATE";
    public static String EXPENDITURETYPE="EXPENDITURETYPE";
    public static String EXPENCEAMOUNT="EXPENCEAMOUNT";

    private int expenceID;

    
    private int personID;
    private String personName;      //This variable is only used when viewing expense report

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }
    private String description;
    private Timestamp expenditureDate;
    private String expenditureType;
    private float expenceAmount;


    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getExpenceAmount() {
        return expenceAmount;
    }

    public void setExpenceAmount(float expenceAmount) {
        this.expenceAmount = expenceAmount;
    }

   

    public int getExpenceID() {
        return expenceID;
    }

    public void setExpenceID(int expenceID) {
        this.expenceID = expenceID;
    }

    public Timestamp getExpenditureDate() {
        return expenditureDate;
    }

    public void setExpenditureDate(Timestamp expenditureDate) {
        this.expenditureDate = expenditureDate;
    }

    public String getExpenditureType() {
        return expenditureType;
    }

    public void setExpenditureType(String expenditureType) {
        this.expenditureType = expenditureType;
    }

    @Override
    public String toString() {
        return "Expence{" + "expenceID=" + expenceID + "personID=" + personID + "personName=" + personName + "description=" + description + "expenditureDate=" + expenditureDate + "expenditureType=" + expenditureType + "expenceAmount=" + expenceAmount + '}';
    }

    

    
    
}
